import java.util.concurrent.*;
import java.util.*;

public class Main {
    public static ExecutorService threadPool = Executors.newFixedThreadPool(1);
    public static TaskRunner task;
    public static Future<?> future;
    public static Main main = new Main();
    public static boolean isReady = false;

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
        Scanner start = new Scanner(System.in);

        System.out.print("Do you want to start (Yes/No): ");
        String answer = start.nextLine().toLowerCase();

        while(true) {
            if(answer.equals("yes")) {
                task = new TaskRunner();
                task.currentPlayer = "player1";
                future = threadPool.submit(task);
                break;
            } else if(answer.equals("no")) {
                task.endingMessage();
                break;
            } else {
                System.out.println("Your input is incorrect!\n");
                System.out.print("Do you want to start (Yes/No): ");
                answer = start.nextLine().toLowerCase();
            }
        } 
        
        try {
            future.get(5, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            future.cancel(true);
            task.terminateThread();
            System.out.println("\n\n########################################################################################");
            System.out.println("\nTimes Up! 2 minutes is over.");
            System.out.println("Press Enter to continue...");
        }
    
        System.out.println("Player 1 Score: " + task.player1Score);

        System.out.println("Player 2 get ready!");
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

        task.player = "player2";
        future = threadPool.submit(task);
        
        try {
            future.get(5, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            future.cancel(true);
            task.terminateThread();
            System.out.println("\n\n########################################################################################");
            System.out.println("\nTimes Up! 2 minutes is over.");
            System.out.println("Press Enter to continue...");
        }
    
        System.out.println("Player 2 Score: " + task.player2Score);
        System.out.println("\n\n########################################################################################");
        System.out.println("Player 1 Score: " + task.player1Score);
        System.out.println("Player 2 Score: " + task.player2Score);
    }
}
