package abstraction;

public class Student extends AbstractStudent {
    @Override
    void getStudentsInfo() {
        System.out.println("Hi. My name is " + this.name + " I'm Students at " + this.faculty);
    }
}
