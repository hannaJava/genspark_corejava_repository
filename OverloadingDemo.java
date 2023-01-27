public class OverloadingDemo {
    public static void main(String[] args) {
        //Write a Java Program to Show Overloading of Methods in Class
        talkToMe("yaaaye!!!");
    }
    public static void talkToMe(String statement, int count){
        for(int i=0;i<count;++i){
            System.out.println("Hello team. I'm ready for this training."+statement);
        }
    }
    public static void talkToMe(String statement){
        talkToMe(statement,1);
    }
}
