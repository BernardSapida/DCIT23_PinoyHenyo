import java.util.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Game extends Tao {
    String player;
    int player1Score;
    int player2Score;
    public Scanner question = new Scanner(System.in);

    public void randomCategory() {
        Random randNum = new Random();

        switch(randNum.nextInt(4)) {
            case 0 -> { taoCategory(); }
            case 1 -> { bagayCategory(); }
            case 2 -> { hayopCategory(); }
            case 3 -> { lugarCategory(); }
        }
    }

    public void taoCategory() {
        Random randNum = new Random();
        int chosenQuestion = randNum.nextInt(4);
        
        switch(chosenQuestion) {
            case 0 -> {
                String chosenWord = parteNgKatawan[randNum.nextInt(parteNgKatawan.length)];
                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Tao");
                    System.out.println("Hint: Parte ng katawan");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = parteNgMukha[randNum.nextInt(parteNgMukha.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Tao");
                    System.out.println("Hint: Parte ng mukha");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = parteNgKamay[randNum.nextInt(parteNgKamay.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Tao");
                    System.out.println("Hint: Parte ng kamay");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
            case 3 -> { 
                String chosenWord = pangalanNgPresidente[randNum.nextInt(pangalanNgPresidente.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Tao");
                    System.out.println("Hint: Apelyido ng naging president ng Pilipinas");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
        }
    }

    public void bagayCategory() {
        Random randNum = new Random();
        int chosenQuestion = randNum.nextInt(3);
        
        switch(chosenQuestion) {
            case 0 -> {
                String chosenWord = bagaySaLoobNgBahay[randNum.nextInt(bagaySaLoobNgBahay.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Bagay");
                    System.out.println("Hint: Nakikita sa loob ng bahay");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = gamitSaKusina[randNum.nextInt(gamitSaKusina.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Bagay");
                    System.out.println("Hint: Gamit sa kusina");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = gamitSaPaglalaro[randNum.nextInt(gamitSaPaglalaro.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Bagay");
                    System.out.println("Hint: Ginagamit sa paglalaro");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
        }
    }

    public void hayopCategory() {
        Random randNum = new Random();
        int chosenQuestion = randNum.nextInt(3);
        
        switch(chosenQuestion) {
            case 0 -> {
                String chosenWord = breedNgAso[randNum.nextInt(breedNgAso.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Hayop");
                    System.out.println("Hint: Breed ng aso");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = apatNaPaa[randNum.nextInt(apatNaPaa.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Hayop");
                    System.out.println("Hint: Ito ay may apat na paa");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = lumilipad[randNum.nextInt(lumilipad.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Hayop");
                    System.out.println("Hint: Ito ay lumilipad");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
        }
    }

    public void lugarCategory() {
        Random randNum = new Random();
        int chosenQuestion = randNum.nextInt(3);
        
        switch(chosenQuestion) {
            case 0 -> {
                String chosenWord = cavitePlace[randNum.nextInt(cavitePlace.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Lugar");
                    System.out.println("Hint: Lugar sa Cavite");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = asianCountry[randNum.nextInt(asianCountry.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Lugar");
                    System.out.println("Hint: Asian Country");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = europeCountry[randNum.nextInt(europeCountry.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nCategory: Lugar");
                    System.out.println("Hint: Europe Country");
                    System.out.print("Enter Word: ");
                    String answer = question.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is Incorrect!");
                    }
                }
            }
        }
    }

    public void endingMessage() {
        System.out.println("\n########################################################################################\n");
        System.out.println("Thank you for playing Pinoy Henyo!");
        System.exit(1);
    }

    public void automaticEnter() {
        Robot robot = null;
        
        try {
            robot = new Robot();
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
}
