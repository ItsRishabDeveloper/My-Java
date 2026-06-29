import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        Method 1
        int[] marks =  new int[5];
        marks[0] = 1;
        marks[1] = 2;
        marks[2] = 3;
        marks[3] = 4;
        marks[4] = 5;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[3]);
//        Method 2
        int[] Score = {50,60,70,80,90};
        System.out.println(Score[0]);
        System.out.println(Score[1]);
        marks[3] = 11;
        System.out.println(marks[3]);
        System.out.println(marks.length);
//        System.out.println(marks);
//        for(int i=0;i<marks.length;i++){
//            System.out.println(marks[i]);
//        Taking Array Input.
        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[5];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = sc.nextInt();
//        for(i=0;i<5;i++){
//            System.out.println(arr[i]);
//        }
//        }
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);
        }
        }
    }

