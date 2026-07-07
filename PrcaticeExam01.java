//Check if the number is prime or not
import java.util.Scanner;
public class PrcaticeExam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a/a == 0 & a/a == 1) {
            System.out.println("A is a prime number");
        }
        else{
            System.out.println("A is a not prime number");
        }
    }
}
