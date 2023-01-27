
public class SingletonClassDemo{
    public static void main(String[] args) {
        //Write a Java Program to Create Singleton Class
        //both obj1 and obj2 pointing to same object
        SingletonClass obj1=SingletonClass.getInstance();
        SingletonClass obj2=SingletonClass.getInstance();
    }
        }
class SingletonClass {
    static SingletonClass singletonClassInstance;
    private SingletonClass(){

    }
    public static SingletonClass getInstance(){
        return singletonClassInstance;
    }
}
