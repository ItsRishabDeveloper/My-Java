//public class PatternPractice {
//    Hallow Square
//    public static void main(String[] args) {
//        int n = 4; // Size of the square
//
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                // Print star for boundaries, space for the inside
//                if (i == 1 || i == n || j == 1 || j == n) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print("  ");
//                }
//            }
//            // Move to the next line after each row
//            System.out.println();
//        }
//    }
//    Hallow Rectangle
//    public static void main(String[] args) {
//        int n = 4;
//        int m = 5;
//        for(int i = 1; i <= n; i++){
//            for(int j = 1; j <= m; j++){
//                if(i==1 || i==n || j==1 || j==m){
//                    System.out.print("*");
//                }
//                else{
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
//    }
//    Full Pyramid
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i = 1; i <= n; i++) {
//            for(int j = 1; j <= n-1; j++) {
//                System.out.print(" ");
//            }
//            for(int k = 1; k <= 2*i-1; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
public class PatternPractice {
    public static void main(String[] args) {
        int n = 5; // Height of the pyramid

        for (int i = 1; i <= n; i++) {
            // 1. Print leading spaces (decreases as rows increase)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // 2. Print stars (increases by odd numbers: 1, 3, 5, 7...)
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            // 3. Move to the next line after each row
            System.out.println();
        }
    }
}