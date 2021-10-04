package chapter3;

import javax.swing.*;
import java.util.Scanner;

/*
IF ELSE
 */
public class QuotaCalculator {

    public static void main(String[] args){

    //Initialize the values we know
    int quota = 10;

    //Get Unknown values
    System.out.println("Enter the number of sales you made this month");
    Scanner scanner = new Scanner(System.in);
    int sales = scanner.nextInt();

    //Make Decision on path
    if(sales >= quota){
        System.out.println("Congratulations! You met your quota with " + sales + " sales for the month!");
    }
    else{
        int salesShort = quota - sales;
        System.out.println("I'm sorry, you did not meet your quota for the month. You were " + salesShort + " sales short of making your quota.");
    }
}}
