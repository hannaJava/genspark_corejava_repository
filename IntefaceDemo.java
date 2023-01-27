public class IntefaceDemo {
    public static void main(String[] args) {
        //Write a Java Program to Create an Interface
        StudentI student=new Student();
        student.setName("Mike");
        student.introduceSelf();
    }
}

interface StudentI{
    String school="Pyramid";
    public void setName(String name);
    public void introduceSelf();
}

class Student implements StudentI{
    private String name;
    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void introduceSelf() {
    System.out.println("Hi, I'm "+this.name+"\nI'm attending "+this.school);
    }
}
