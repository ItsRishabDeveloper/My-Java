import java.util.Scanner;
public class ArrayExercise {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        for(int j = 0; j <5; j++){
            System.out.print(arr[j]+" ");
        int LargestElement = arr[j];
        for(int k = j+1;k<5;k++){
            if(arr[k]>LargestElement){
                LargestElement=arr[k];
            }
        }
        System.out.println(LargestElement);
        }
        }
    }
}
