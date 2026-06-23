import java.util.Scanner;
public class InputOutput {
    public static void main(String[] args) {
        String name;
        int age;
        double height;
        float weight;
//        long Car;
//        boolean gender;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        name = sc.nextLine();
        System.out.println("Enter your age:");
        age = sc.nextInt();
        System.out.println("Enter your height:");
        height = sc.nextDouble();
        System.out.println("Enter your weight:");
        weight = sc.nextFloat();
//        System.out.println("Enter your Car:");
//        Car = sc.nextLong();
//        System.out.println("Enter your gender:");
//        gender = sc.nextBoolean();
        System.out.println("Enter your friend's name :");
        String friendName = sc.next();
//        friendName = sc.nextLine();
        System.out.println("Enter your brother's name :");
        String brotherName = sc.next();
//        brotherName = sc.nextLine();
        System.out.println("Hello " + name);
//        sc.next();
//        sc.nextLine();
    }
}
