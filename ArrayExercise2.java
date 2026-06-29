public class ArrayExercise2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);

      for(int j=0;j<arr.length;j++){
          if(arr[i+1] > arr[j]){
              String LargestNumber = String.valueOf(arr[i]);
          }
      }
      System.out.println(LargestNumber);
        }
    }
}
