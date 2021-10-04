package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] arg){
        //1. Get the number of hours worked
        System.out.println("How Many Hours Worked?");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();


        //2. Get hourly pay rate
        System.out.println("What is your pay rate?");
        double pay = scanner.nextDouble();

        //3. Multiply hours and pay rate
        double grossPay = hours * pay;

        //4.  Display Result
        System.out.println("Employee's gross pay is " + grossPay);
    }
}
