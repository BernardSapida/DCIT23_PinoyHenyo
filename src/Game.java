import java.util.*;

public class Game extends Tao {
    Random randNum = new Random();
    String player;
    int player1Score = 0;
    int player2Score = 0;

    public void randomCategory(String player) {
        this.player = player;
        switch(randNum.nextInt(4)) {
            case 0 -> { taoCategory(); }
            case 1 -> { bagayCategory(); }
            case 2 -> { hayopCategory(); }
            case 3 -> { lugarCategory(); }
        }
    }

    public void taoCategory() {
        int chosenQuestion = randNum.nextInt(4);
        Scanner lugarQuestion = new Scanner(System.in);
        
        switch(chosenQuestion) {
            case 0 -> {
                String chosenWord = parteNgKatawan[randNum.nextInt(parteNgKatawan.length)];
                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Parte ng katawan");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = parteNgMukha[randNum.nextInt(parteNgMukha.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Parte ng mukha");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = parteNgKamay[randNum.nextInt(parteNgKamay.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Parte ng kamay");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 3 -> { 
                String chosenWord = pangalanNgPresidente[randNum.nextInt(pangalanNgPresidente.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Apelyido ng naging president ng Pilipinas");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
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
                String chosenWord = bagaySaLoobNgBahay[randNum.nextInt(bagaySaLoobNgBahay.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Nakikita sa loob ng bahay");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = gamitSaKusina[randNum.nextInt(gamitSaKusina.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Gamit sa kusina");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = gamitSaPaglalaro[randNum.nextInt(gamitSaPaglalaro.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Ginagamit sa paglalaro");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
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
                String chosenWord = breedNgAso[randNum.nextInt(breedNgAso.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Breed ng aso");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = apatNaPaa[randNum.nextInt(apatNaPaa.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Ito ay may apat na paa");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = lumilipad[randNum.nextInt(lumilipad.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Ito ay lumilipad");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
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

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Lugar sa Cavite");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 1 -> { 
                String chosenWord = asianCountry[randNum.nextInt(asianCountry.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Asian Country");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
            case 2 -> { 
                String chosenWord = europeCountry[randNum.nextInt(europeCountry.length)];

                while(!Main.future.isCancelled()) {
                    System.out.println("\nHint: Europe Country");
                    System.out.print("Enter Word: ");
                    String answer = lugarQuestion.nextLine();

                    if(chosenWord.toLowerCase().equals(answer)) {
                        System.out.println("Your answer is correct!\n");
                        if(player.equals("player1")) player1Score += 5;
                        if(player.equals("player2")) player2Score += 5;
                        break;
                    } else if(!chosenWord.toLowerCase().equals(answer) && !Main.future.isCancelled()) {
                        System.out.println("Your answer is incorrect!\n");
                    }
                }
            }
        }
    }

    public void endingMessage() {
        System.out.println("Thank you for playing Pinoy Henyo!");
        System.exit(1);
    }
}
