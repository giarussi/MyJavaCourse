package chapter3;

import java.util.Scanner;

public class MadLibsTest {

    public static void main(String args[]){

        //1. What are the coin values, double = decimal int = whole numbers
        double penny = .01;
        double nickel = .05;
        double dime = .10;
        double quarter = .25;
        int dollar = 1;

        Scanner scanner = new Scanner(System.in);
        //2. Generate game start message

        System.out.println("Welcome to 'Change for a Dollar'! " +
                "Your objective is to enter enough change to make exactly $1.00. For an extra challenge try to include all four coin types.");
        //3. Request coin amounts from user

        System.out.println("How many pennies are in your dollar?:");
        int numOfPennies = scanner.nextInt();

        System.out.println("How many nickles are in your dollar?:");
        int numOfNickels = scanner.nextInt();

        System.out.println("How many dimes are in your dollar:");
        int numOfDimes = scanner.nextInt();

        System.out.println("How many quarters are in your dollar:");
        int numOfQuarters = scanner.nextInt();

        scanner.close();
        //4. How to calculate total of user's selected coins

        double total = numOfPennies * penny + numOfNickels * nickel + numOfDimes * dime + numOfQuarters * quarter;
        //5. Calculate short amount

        if(total < dollar){
            double amountShort = dollar - total;
            //6. Way to make the decimal print with only 2 decimal places "under"

            System.out.println("Sorry, you lose! You were short " + String.format("%.2f", amountShort) + " cents.");
        }
        //7. Calculate Over amount

        else if(total > dollar){
            double amountOver = total - dollar;
            //8. Way to make the decimal print with only 2 decimal places "over"

            System.out.println("Sorry, you lose! You were over " + String.format("%.2f", amountOver) + " cents.");
        }
        //9. Display win text

        else{
            System.out.println("Yay! That's exactly $1.00! You win!");
        }
    }
}
