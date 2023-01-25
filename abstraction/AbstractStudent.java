package abstraction;

abstract public class AbstractStudent {
    protected String name;
    protected int age;
    protected String faculty;

    //setters

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    //methods
    abstract void getStudentsInfo();
}
