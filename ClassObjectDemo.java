public class ClassObject {
    public static void main(String[] args) {
        //Write a Java Program to Create a Class and Object
        //create object of type Key //invoke constructor //returne reference to the object
        Person person1=new Person();
        Person person2=new Person("Mike",22,"Pyramid","software developer");
    }
}

 class Person {
    private String name;
    private int age;
    private String company;
    private String job;

    // constructors
     public Person() {
     }
     public Person(String name, int age, String company, String job) {
         this.name = name;
         this.age = age;
         this.company = company;
         this.job = job;
     }
        //getters
     public String getName() {
         return name;
     }

     public int getAge() {
         return age;
     }

     public String getCompany() {
         return company;
     }

     public String getJob() {
         return job;
     }

     //setters

     public void setName(String name) {
         this.name = name;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public void setCompany(String company) {
         this.company = company;
     }

     public void setJob(String job) {
         this.job = job;
     }
 }

