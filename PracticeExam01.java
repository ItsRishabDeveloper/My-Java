import java.util.Scanner;

public class PracticeExam01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.close(); // good practice to close scanner

        if (isPrime(a)) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }
    }

    public static boolean isPrime(int n) {
        // Handle edge cases
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true; // 2 is the only even prime
        }
        if (n % 2 == 0) {
            return false; // other even numbers are not prime
        }
        // Check odd divisors up to sqrt(n)
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}