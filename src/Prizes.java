import java.util.Scanner;

public class Prizes extends Main {
    
    // { Points needed, Number of Items Available}
    private int[] chocolate_bar = {5, 100};
    private int[] certificate = {10, 50};
    private int[] framed_certificate = {20, 50};
    private int[] small_trophy = {30, 20};
    private int[] big_trophy = {70, 10};
    private int[] chips = {10, 50};
    private int[] drinks = {10, 50};
    private int points, prize_number;

    public void displayPrizes() {
        System.out.println("\n########################################################################################\n");
        System.out.println("Prize Category: Awards");
        System.out.println("(1) Certificate | Price: 10 Points | Available: " + certificate[1]);
        System.out.println("(2) Certificate with Frame | Price: 20 Points | Available: " + framed_certificate[1]);
        System.out.println("(3) Small Trophy | Price: 30 Points | Available: " + small_trophy[1]);
        System.out.println("(4) Big Trophy | Price: 70 Points | Available: " + big_trophy[1]);
        System.out.println("\nPrize Category: Foods and Beverages");
        System.out.println("(5) Chocolate Bar | Price: 5 Points | Available: " + chocolate_bar[1]);
        System.out.println("(6) Chips | Price: 10 Points | Available: " + chips[1]);
        System.out.println("(7) Drinks | Price: 10 Points | Available: " + drinks[1]);
    }

    public int getPrize(String name, int playerPoints) {
        Scanner getPrize = new Scanner(System.in);
        this.points = playerPoints;
        
        whileLoop: while(true) {
            System.out.println("\n########################################################################################\n");
            System.out.println("Name: " + name);
            System.out.println("Remaining Points: " + this.points);
            System.out.print("No. of Prize Category: ");
            String chosenPrize = getPrize.nextLine();

            switch(chosenPrize) {
                case "1" -> { 
                    prize_number = 1;
                    if(this.certificate[0] <= this.points && this.certificate[1] > 0) {
                        while(true) {
                            System.out.print("Enter quantity: ");
                            int quantity = getPrize.nextInt();
                            getPrize.nextLine();
                            
                            checkQuantity(this.certificate, this.points, quantity);
                            break;
                        }
                        if(buyAgain()) break whileLoop;
                    } else {
                        System.out.println("Insufficient Points!");
                    }
                }
                case "2" -> { 
                    prize_number = 2;
                    if(this.framed_certificate[0] <= points && this.framed_certificate[1] > 0) {
                        while(true) {
                            System.out.print("Enter quantity: ");
                            int quantity = getPrize.nextInt();
                            getPrize.nextLine();
                            checkQuantity(this.framed_certificate, this.points, quantity);
                            break;
                        }
                        if(buyAgain()) break whileLoop;
                    } else {
                        System.out.println("Insufficient Points!");
                    }
                }
                case "3" -> { 
                    prize_number = 3;
                    if(this.small_trophy[0] <= points && this.small_trophy[1] > 0) {
                        while(true) {
                            System.out.print("Enter quantity: ");
                            int quantity = getPrize.nextInt();
                            getPrize.nextLine();
                            checkQuantity(this.small_trophy, this.points, quantity);
                            break;
                        }
                        if(buyAgain()) break whileLoop;
                    } else {
                        System.out.println("Insufficient Points!");
                    }
                }
                case "4" -> { 
                    prize_number = 4;
                    if(this.big_trophy[0] <= points && this.big_trophy[1] > 0) {
                        while(true) {
                            System.out.print("Enter quantity: ");
                            int quantity = getPrize.nextInt();
                            getPrize.nextLine();
                            checkQuantity(this.big_trophy, this.points, quantity);
                            break;
                        }
                        if(buyAgain()) break whileLoop;
                    } else {
                        System.out.println("Insufficient Points!");
                    }
                }
                case "5" -> { 
                    prize_number = 5;
                    if(this.chocolate_bar[0] <= points && this.chocolate_bar[1] > 0) {
                        while(true) {
                            System.out.print("Enter quantity: ");
                            int quantity = getPrize.nextInt();
                            getPrize.nextLine();
                            checkQuantity(this.chocolate_bar, this.points, quantity);
                            break;
                        }
                        if(buyAgain()) break whileLoop;
                    } else {
                        System.out.println("Insufficient Points!");
                    }
                }
                case "6" -> { 
                    prize_number = 6;
                    if(this.chips[0] <= points && this.chips[1] > 0) {
                        while(true) {
                            System.out.print("Enter quantity: ");
                            int quantity = getPrize.nextInt();
                            getPrize.nextLine();
                            checkQuantity(this.chips, this.points, quantity);
                            break;
                        }
                        if(buyAgain()) break whileLoop;
                    } else {
                        System.out.println("Insufficient Points!");
                    }
                }
                case "7" -> { 
                    prize_number = 7;
                    if(this.drinks[0] <= points && this.drinks[1] > 0) {
                        while(true) {
                            System.out.print("Enter quantity: ");
                            int quantity = getPrize.nextInt();
                            getPrize.nextLine();
                            checkQuantity(this.drinks, this.points, quantity);
                            break;
                        }
                        if(buyAgain()) break whileLoop;
                    } else {
                        System.out.println("Insufficient Points!");
                    }
                }
                default -> { System.out.println("Your input is incorrect!\n"); }
            }
        }

        return points;
    }

    public boolean checkQuantity(int[] arrPrice, int points, int quantity) {
        if(quantity > 0 && quantity <= arrPrice[1]) {
            if((arrPrice[0] * quantity) > points) {
                System.out.println("Insufficient points!");
                return true;
            }
            modifyPrizes(arrPrice, points, quantity);
            return false;
        } else {
            System.out.println("Your input is incorrect! Quantity should be greater than 0.");
            return true;
        }
    }

    public void modifyPrizes(int[] arrPrice, int points, int quantity) {
        String prizeName = "";

        switch(prize_number) {
            case 1 -> { prizeName = "Certificate"; }
            case 2 -> { prizeName = "Certificate with Frame"; }
            case 3 -> { prizeName = "Small Trophy"; }
            case 4 -> { prizeName = "Big Trophy"; }
            case 5 -> { prizeName = "Chocolate Bar"; }
            case 6 -> { prizeName = "Chips"; }
            case 7 -> { prizeName = "Drinks"; }
        }

        points -= (arrPrice[0] * quantity);
        this.points = points;
        arrPrice[1] -= quantity;
        System.out.println("Current Points: " + this.points);
        System.out.println("You sucessfully owned " + quantity + " " + prizeName + ". Thank you!");
    }

    public boolean buyAgain() {
        Scanner buy_again = new Scanner(System.in);

        System.out.println("\n########################################################################################\n");
        System.out.print("Do you want to buy again (Yes/No): ");
        String response = buy_again.nextLine().toLowerCase();

        while(true) {
            if(response.equals("yes")) {
                System.out.println("\n########################################################################################\n");
                return false;
            } else if(response.equals("no")) {
                return true;
            } else {
                System.out.println("Your input is incorrect!\n");
                System.out.println("\n########################################################################################\n");
                System.out.print("Do you want to buy again (Yes/No): ");
                response = buy_again.nextLine().toLowerCase();
            }
        }
    }
}
