public class Loops {
//    Syntax for FOR loop
//    for(initialization , condition , update){
//    }
//    example
    public static void main(String[] args) {
        for(int i=0; i<=5;i++){
            System.out.println(i);
        }
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }
        int sum = 0;
        for(int i=0;i<=10;i++){
            sum = sum+i;
        System.out.println(sum);
        }
        for(int i = 1; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                System.out.println(i + " " + j);
            }
        }
        for(int i = 1; i <= 4; i++) {
            for(int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = 1;i<=4;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
