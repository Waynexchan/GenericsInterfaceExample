
public class Main{

    public static  <T> T printHello(T obj){
        return(T) (obj + ". hello");
    }
    public static <T> void print(T obj){
        System.out.println(obj.getClass().getName());
    }
    public static void main(String[] args) {
        print("Hello World.");
        System.out.println(printHello("Wilson"));

    }
}