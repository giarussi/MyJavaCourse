package chapter6;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(){
        length = 0;
        width = 0;
    }

    public Rectangle(double width, double length){
        this.length = length;
        setWidth(width);
    }

    //calculatePerimeter Method
    public double calculatePerimeter(){

        return (length * 2) + (width * 2);
    }
    //calculateArea Method
   public double calculateArea(){

        return length * width;
    }

    //Getter methods
    public double getLength(){

        return length;

    }

    public double getWidth(){

        return width;

    }

    //Setter methods

   public void setWidth(double width){
        this.width = width;
    }

   public void setLength(double length){
        this.length = length;
    }

}
