package inheritance;

public class Rectangle {
    //Write a Java Program to Show Encapsulation in Class
    //Write a Java Program to Show Data Hiding in Class
    private double width, height;

    //Write a Java Program to Show Use of This Keyword in Class
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(100, 100);
    }
    //getters
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    //setters

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //methods
    public double area(){
        return width*height;
    }
}
