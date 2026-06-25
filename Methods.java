import java.util.Scanner;
public class Methods {
    public static void Welcome(){
        System.out.println("Welcome user");
    }
    public static void greet(String name){
        System.out.println("Hello "+name);
    }
    public static void add(int a, int b , int c){
        System.out.println(a+b+c);
    }
    public static void add(double a, int b , int c){
        System.out.println(a+b+c);
    }
    public static String good(String name){
        return String.format("Hello %s",name);
    }
    public static int adds(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        Welcome();
        Welcome();
        Welcome();
        Welcome();
        greet("Java");
        greet("World");
        add(1,2,3);
        add(1.1,2,3);
        int answer = adds(2,3);
        System.out.println(answer);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println(good(name));
    }
}
