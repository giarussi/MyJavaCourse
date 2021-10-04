package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        //createNewFile();
        numbersExceptionHandling();
    }

    public static void createNewFile(){
        File file = new File("resources/nonexistent.txt");
        try{
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Directory Doesn't Exist.");
            e.printStackTrace();
        }
        }

    public static void numbersExceptionHandling(){

        File file = new File("resources/numbers.txt");
        Scanner fileReader = new Scanner(file);

        try{

            while(fileReader.hasNext()){
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        }catch(FileNotFoundException | InputMismatchException e){                         //use a pipe to add multiple exceptions to handle
            e.printStackTrace();
        }finally{ fileReader.close();
    }
    }
    public static void createNewFileRethrow(){
        File file = new File("resources/nonexistent.txt");
            file.createNewFile();

    }
}
