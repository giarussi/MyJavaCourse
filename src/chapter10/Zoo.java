package chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();
        feed(dog);

        Animal buford = new Dog();
        buford.makeSound();
        feed(buford);

        buford = new Cat();
        buford.makeSound();
        ((Cat) buford).scratch();
        feed(buford);
    }

    public static void feed(Animal animal){
        if(animal instanceof Dog){
            System.out.println("Feeding Dog Food... YUM!");
        } else if(animal instanceof Cat){
            System.out.println("Feeding Cat Food... Delicious!");
        }
    }
}
