import java.util.concurrent.*;
import java.util.*;
import java.awt.*;

public class Main {
    private static ExecutorService threadPool = Executors.newFixedThreadPool(1);
    private static TaskRunner task;
    public static Future<?> future;
    private static Prizes prizes = new Prizes();
    private static String player1name = "ZO";
    private static String player2name = "JOSHUA";
    public static int player1points = 3;
    public static int player2points = 0;
    public static int player1roundpoints = 0;
    public static int player2roundpoints = 0;

    Main() {
        System.out.println("Welcome to Pinoy Henyo\n");
        System.out.println("Instructions:");
        System.out.println("* This game is a 2-player game.");
        System.out.println("* Player will be given a random category (Tao, Bagay, Hayop, Lugar). Each category composed of words to guess.");
        System.out.println("* Player can guess as many as he/she can under 2 minutes. 2 minutes is the given time per category to guess the word.");
        System.out.println("* As the Player got correct answer, he/she gets point that can be redeem to a specific reward.");
        System.out.println("* As the game starts the players need to guess the word. Player can choose if pass or\ncontinue guessing the word. If Player chose to continue, it continues the guessing of word.\nIf Player chose to pass, another word will continue to guess.");
        System.out.println("* When the given time (2 minutes) is over, the Player with highest points will be declared as winner and the one with the lowest points will be declared as loss.");
        System.out.println("* As the game is over, the lose Player can have a rematch, but the winner is twice to beat as an advantage and can only have 1 rematch.");
        System.out.println("* In rematch, if lose Player wins in the current match, he/she will gain the opponents prize/points and if he/she would loss, Player will not gain anything. If the winner wins Player's prize/points will be doubled and recognize as Back-to-back winner.");
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        // System.out.println("\n########################################################################################\n");
        // System.out.print("Player 1: What is your name? ");
        // player1name = sc.nextLine().toUpperCase();

        // System.out.print("Player 2: What is your name? ");
        // player2name = sc.nextLine().toUpperCase();
        // System.out.println("\n########################################################################################\n");

        // Main.startPlayer("player1");
        // Main.startPlayer("player2");
        // Main.rematch();
        prizes.displayPrizes();
        while(true) {
            System.out.println("\n########################################################################################\n");
            System.out.print("Would you like to claim your rewards (Yes/No)? ");
            String response = sc.nextLine().toLowerCase();

            if(response.equals("yes")) {
                System.out.print("What is your name? ");
                String name = sc.nextLine().toUpperCase();
                if(name.equals(player1name.toUpperCase())) {
                    if(player1points >= 5) {
                        player1points = prizes.getPrize(Main.player1name, Main.player1points);
                    } else {
                        System.out.println("Insufficient points!");
                    }
                } else if(name.equals(player2name.toUpperCase())) {
                    if(player2points >= 5) {
                        player2points = prizes.getPrize(Main.player2name, Main.player2points);
                    } else {
                        System.out.println("Insufficient points!");
                    }
                } else {
                    System.out.println("Your name didn't recognize!");
                }
            } else if(response.equals("no")) {
                new Game().endingMessage();
            } else {
                System.out.println("Your input is incorrect!");
            }
        }
    }

    private static void countdown() throws InterruptedException {
        System.out.println("\n########################################################################################\n");
        System.out.println("The game will start in 5...");
        Thread.sleep(1000);
        System.out.println("The game will start in 4...");
        Thread.sleep(1000);
        System.out.println("The game will start in 3...");
        Thread.sleep(1000);
        System.out.println("The game will start in 2...");
        Thread.sleep(1000);
        System.out.println("The game will start in 1...");
        Thread.sleep(1000);
    }

    private static void startPlayer(String player) throws InterruptedException, ExecutionException, AWTException {
        Scanner start = new Scanner(System.in);
        System.out.print("Do you want to start " + player + " (Yes/No): ");
        String answer = start.nextLine().toLowerCase();

        while(true) {
            if(answer.equals("yes")) {
                countdown();
                System.out.println("\n########################################################################################");
                System.out.println("\nThe game has been started!\n");
                System.out.println("########################################################################################");
                task = new TaskRunner();
                task.player = player;
                future = threadPool.submit(task);

                break;
            } else if(answer.equals("no")) {
                task.endingMessage();
                break;
            } else {
                System.out.println("Invalid Input!\n");
                System.out.print("Do you want to start " + player + " (Yes/No): ");
                answer = start.nextLine().toLowerCase();
            }
        } 
        
        try {
            future.get(10, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            future.cancel(true);
            task.terminateThread();
            System.out.println("\n\n########################################################################################\n");
            System.out.println("Times Up! 2 minutes is over.");
            System.out.println("\n########################################################################################\n");
        }
        if(player.equals("player1")) {
            player1roundpoints = task.player1Score;
            System.out.println(player + " Score: " + player1roundpoints);
            System.out.println("\n########################################################################################\n");
            player1points += task.player1Score;
        }
        if(player.equals("player2")) {
            player2roundpoints = task.player2Score;
            System.out.println(player + " Score: " + player2roundpoints);
            System.out.println("\n########################################################################################\n");
            player2points += task.player2Score;
        }
    }

    private static void rematch() throws InterruptedException, ExecutionException, AWTException {
        System.out.println("\n########################################################################################");
        System.out.println("#   Final Score:                                                                       #");
        System.out.println("#   (Player 1) " + player1name + " score: " + player1points + " ".repeat(64 - (String.valueOf(player1points).length() + player1name.length())) + "#");
        System.out.println("#   (Player 2) " + player2name + " score: " + player2points + " ".repeat(64 - (String.valueOf(player2points).length() + player2name.length())) + "#");
        System.out.println("########################################################################################");

        // Tie Break
        if(player1points == player2points) {
            System.out.println("\n########################################################################################\n");
            System.out.println("You are in a tie break!");
            System.out.println("\n########################################################################################\n");
            startPlayer("player1");
            startPlayer("player2");

            if(player1points == player2points) rematch();
        }

        // One player wins the game and opposing player wants a rematch.
        if(player1points != player2points) {
            Scanner rematch = new Scanner(System.in);

            while(true) {
                System.out.println("\n########################################################################################\n");
                if(player1roundpoints > player2roundpoints) System.out.print("Would you like to rematch player 2 against player 1 (Yes/No): ");
                else System.out.print("Would you like to rematch player 1 against player 2 (Yes/No): ");
                String response = rematch.nextLine().toLowerCase();
            
                if(response.equals("yes")) {
                    System.out.println("\n########################################################################################\n");
                    System.out.println("Game Rematch! if lose Player wins in the current match, he/she will gain the opponents\nprize/points and if he/she would loss, Player will not gain anything. If the winner wins\nPlayer’s prize/points will be doubled and recognize as Back-to-back winner.");
                    System.out.println("\n########################################################################################\n");
                    startPlayer("player1");
                    startPlayer("player2");

                    if(player1roundpoints == player2roundpoints) rematch();
                    else {
                        if(player1roundpoints > player2roundpoints) {
                            player1points += player1points;
                            player1points += player2points;
                            player2points = 0;
                            System.out.println(player1name + " points: " + player1points);
                            System.out.println(player2name + " points: " + player2points);
                        } else {
                            player2points += player2points;
                            player2points += player1points;
                            player1points = 0;
                            System.out.println(player1name + " points: " + player1points);
                            System.out.println(player2name + " points: " + player2points);
                        }
                    }
                    
                    
                    break;
                } else if(response.equals("no")) {
                    task.endingMessage();
                } else {
                    System.out.println("Your input is incorrect!");
                }
            }
        }
    }
}
