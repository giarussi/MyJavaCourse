package chapter10;

public class Dog extends Animal {

    @Override
    public void makeSound(){
        System.out.println("Bark Bark!");
    }

    public void fetch(){
        System.out.println("Fetch is fun!");
    }
}
