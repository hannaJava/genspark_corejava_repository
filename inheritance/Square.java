package inheritance;

public class Square extends Rectangle{
    public Square(){
        super();
    }
    public Square(double width){
        super(width,width);
    }

    //Write a Java Program to Show Polymorphism in Class(static)
    //Write a Java Program to Show Overriding of Methods in Classes
    //Write a Java Program to Show Use of Super Keyword in Class
    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(double height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}
