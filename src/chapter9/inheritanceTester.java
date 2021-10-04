package chapter9;

public class inheritanceTester {
    public static void main(String[] args) {
        //Person person = new Person("Jerry");
        //Employee employee = new Employee();

        //Rectangle rectangle1 = new Rectangle();
        //rectangle1.print();

        //Square square1 = new Square();
        //square1.print("Square");

        Mother mother1 = new Mother();
        mother1.setName("Martha");
        System.out.println(mother1.getName() + " is a " + mother1.getGender());
    }
}
