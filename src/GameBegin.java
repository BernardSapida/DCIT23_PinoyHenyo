import java.util.*;

public class GameBegin extends Tao {
    Random randNum = new Random();

    GameBegin() {
        System.out.println("Welcome to Pinoy Henyo\n");
        System.out.println("Instructions:");
        System.out.println("* This game is a 2-player game.");
        System.out.println("* Player will be given a random category (Tao, Bagay, Hayop, Lugar). Each category composed of words to guess.");
        System.out.println("* Player can guess as many as he/she can under 2 minutes. 2 minutes is the given time per category to guess the word.");
        System.out.println("* As the Player got correct answer, he/she gets point that can be redeem to a specific reward.");
        System.out.println("* As the game starts the players need to guess the word. Player can choose if pass or\ncontinue guessing the word. If Player chose to continue, it continues the guessing of word.\nIf Player chose to pass, another word will continue to guess.");
        System.out.println("* When the given time (2 minutes) is over, the Player with highest points will be declared as winner and the one with the lowest points will be declared as loss.");
        System.out.println("* As the game is over, the lose Player can have a rematch, but the winner is twice to beat as an advantage and can only have 1 rematch.");
        System.out.println("* In rematch, if lose Player wins in the current match, he/she will gain the opponents prize/points and if he/she would loss, Player will not gain anything. If the winner wins Player’s prize/points will be doubled and recognize as Back-to-back winner.");
    }

    public void queryStartGame() {
        Scanner start = new Scanner(System.in);

        System.out.print("Do you want to start (Yes/No): ");
        String answer = start.nextLine().toLowerCase();

        while(true) {
            if(answer.equals("yes")) {
                randomCategory();
                break;
            } else if(answer.equals("no")) {
                endingMessage();
                break;
            } else {
                System.out.println("Your input is incorrect!\n");
                System.out.print("Do you want to start (Yes/No): ");
                answer = start.nextLine().toLowerCase();
            }
        }        
    }

    public void randomCategory() {
        switch(randNum.nextInt(4)) {
            case 0 -> { taoCategory(); }
            case 1 -> { bagayCategory(); }
            case 2 -> { hayopCategory(); }
            case 3 -> { lugarCategory(); }
        }
    }

    public void taoCategory() {
        int chosenQuestion = randNum.nextInt(3);
        Scanner lugarQuestion = new Scanner(System.in);
        
        switch(chosenQuestion) {
            case 0 -> {
                String chosenWord = cavitePlace[randNum.nextInt(cavitePlace.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = asianCountry[randNum.nextInt(asianCountry.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = europeCountry[randNum.nextInt(europeCountry.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
        }
    }

    public void bagayCategory() {
        int chosenQuestion = randNum.nextInt(3);
        Scanner lugarQuestion = new Scanner(System.in);
        
        switch(chosenQuestion) {
            case 0 -> {
                String chosenWord = cavitePlace[randNum.nextInt(cavitePlace.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = asianCountry[randNum.nextInt(asianCountry.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = europeCountry[randNum.nextInt(europeCountry.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
        }
    }

    public void hayopCategory() {
        int chosenQuestion = randNum.nextInt(3);
        Scanner lugarQuestion = new Scanner(System.in);
        
        switch(chosenQuestion) {
            case 0 -> {
                String chosenWord = cavitePlace[randNum.nextInt(cavitePlace.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = asianCountry[randNum.nextInt(asianCountry.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = europeCountry[randNum.nextInt(europeCountry.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
        }
    }

    public void lugarCategory() {
        int chosenQuestion = randNum.nextInt(3);
        Scanner lugarQuestion = new Scanner(System.in);
        
        switch(chosenQuestion) {
            case 0 -> {
                String chosenWord = cavitePlace[randNum.nextInt(cavitePlace.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = asianCountry[randNum.nextInt(asianCountry.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = europeCountry[randNum.nextInt(europeCountry.length)];

                while(true) {
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        break;
                    } else {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
        }
    }

    public void endingMessage() {
        System.out.println("Thank you for playing Pinoy Henyo!");
    }
}
