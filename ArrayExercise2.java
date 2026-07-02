public class ArrayExercise2 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70,80,90,100};
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);

            String LargestNumber = null;
            for (int k : arr) {
                if (arr[i + 1] > k) {
                    LargestNumber = String.valueOf(arr[i]);
                    break;
                }
            }
            System.out.println(LargestNumber);
        }
    }
}
