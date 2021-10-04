package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {

        //Initialize known variables
        int rate = 15;
        int maxHours = 40;

        //Get Input on Hours Worked
        System.out.println("How many hours worked this week?");
        Scanner scanner = new Scanner(System.in);

        double hoursWorked = scanner.nextDouble();

        //Validate hours worked
        double hourOverage = (double) (hoursWorked - maxHours);
        double hourUnderage = (double) (1 - hoursWorked);
        while (hoursWorked > maxHours || hoursWorked < 1) {

            if (hoursWorked < 1) {
                System.out.println("Your hours must be between 1 and 40. You are currently at " + hoursWorked + " which is " + hourUnderage + " under the min.");
                hoursWorked = scanner.nextDouble();

            } else {
                System.out.println("Your hours must be between 1 and 40. You are currently at " + hoursWorked + " which is " + hourOverage + " over the 40 hour limit. Please enter hours worked under 40:");
                hoursWorked = scanner.nextDouble();
            };
        }

        scanner.close();

        double totalGrossPay = hoursWorked * rate;
        System.out.println("Your pay for the week is $" + totalGrossPay);
    }
}
