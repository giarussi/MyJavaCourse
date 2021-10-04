package chapter3;
/*
Comments can be anywhere! This package introduces IF statements
 */

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args){

        //Initialize Known Values
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        //Get values for unknown
        System.out.println("How many sales made this week?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();
        //Quick detour for bonus earners
        if(sales > quota){
            salary = salary + bonus;
        }
        //Output to User
        System.out.println("Employee Salary is " + salary);
    }
}
