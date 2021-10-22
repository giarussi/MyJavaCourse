package classcodetesting;

import java.util.Random;
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Enjoy rolling of the die game, here we go!");

        //2. Generate roll counter

        for(int i = 1; maxRolls >= i; i++){

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.printf("Roll #%d: You've rolled a %d. ", i, die);

            if(currentSpace == lastSpace){
                System.out.print("You are on space " + currentSpace + ". Good job you're a winner!");
                break;
            }
            else if(currentSpace > lastSpace){
                System.out.print("Sorry you have gone too far " + lastSpace + " spaces. You're a loser!");
                break;
            }
            else if(i == maxRolls){
                System.out.println("You are on space " + currentSpace + ".");
                System.out.println("Sadly you didn't make it to all " +
                        lastSpace + " spaces. You lost.");
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and you have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }
    }
}

