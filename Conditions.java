import java.util.Scanner;
public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int age=20;
        if(a>=18){
            System.out.println("You are Eligible to vote");
        }
        else{
            System.out.println("You are not Eligible to vote");
        }
        int day = 3;
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
