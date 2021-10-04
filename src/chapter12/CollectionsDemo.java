package chapter12;

import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        //setDemo();
        //listDemo();
        queueDemo();
       // mapDemo();


    }

    //create a set and demo iterator capability with a set
    public static void setDemo() {
        Set <String> fruit = new HashSet();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Peach");
        fruit.add("Raspberry");
        fruit.add("Blueberry");
        fruit.add("Guava");

        System.out.println("Using Iterator Method:");

        var i = fruit.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        System.out.println("Using for loop Method:");

        //using for loop
        for(String item: fruit){
            System.out.println(item);
        }

        //using lambda forEach

        System.out.println("Using Lambda expression:");

        fruit.forEach(x -> System.out.println(x));

        //or this is the simplified form of the same call above
        System.out.println("Using secondary simplified form of Lambda expression:");

        fruit.forEach(System.out::println);
            
        }
//create a list and demo iterator methods

    public static void listDemo(){
        List <String> fruit = new ArrayList();
        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Peach");
        fruit.add("Raspberry");
        fruit.add("Blueberry");
        fruit.add("Guava");

        System.out.println("Using Iterator Method:");

        var i = fruit.iterator();
        while(i.hasNext())
            System.out.println(i.next());

        System.out.println("Using for loop Method:");

        //using for loop
        for(String item: fruit){
            System.out.println(item);
        }

        //using lambda forEach

        System.out.println("Using Lambda expression:");

        fruit.forEach(x -> System.out.println(x));

        //or this is the simplified form of the same call above
        System.out.println("Using secondary simplified form of Lambda expression:");

        fruit.forEach(System.out::println);

    }

    //Create a Queue and demonstrate iterator methods
public static void queueDemo(){

    Queue <String> fruit = new LinkedList();
    fruit.add("Apple");
    fruit.add("Banana");
    fruit.add("Peach");
    fruit.add("Raspberry");
    fruit.add("Blueberry");
    fruit.add("Guava");

    System.out.println("Using Iterator Method:");

    var i = fruit.iterator();
    while(i.hasNext())
        System.out.println(i.next());

    System.out.println("Using for loop Method:");

    //using for loop
    for(String item: fruit){
        System.out.println(item);
    }

    //using lambda forEach

    System.out.println("Using Lambda expression:");

    fruit.forEach(x -> System.out.println(x));

    //or this is the simplified form of the same call above
    System.out.println("Using secondary simplified form of Lambda expression:");

    fruit.forEach(System.out::println);

}

//Create a map and demonstrate iterator methods

    public static void mapDemo(){
        Map <String,Integer> fruitCalories = new HashMap();
        fruitCalories.put("Apple", 55);
        fruitCalories.put("Banana", 97);
        fruitCalories.put("Peach", 124);
        fruitCalories.put("Raspberry", 55);
        fruitCalories.put("Guava", 65);

        System.out.println("Using For Loop");

        for(var entry: fruitCalories.entrySet()){
            System.out.println(entry.getValue());
        }

        System.out.println("Using forEach expression");

        fruitCalories.forEach(
                (k,v) -> System.out.println("Fruit: " + k + " Calories: " + v));
    }
    }

