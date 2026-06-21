//A variable is a named storage location that holds data.
public class Variables {
    int a=10;
    double cgpa = 8.3568;
    char gender = 'M';
    String name = "Rishab";
    boolean Passes = true;

//    Variable Declaration
    int age;
    age = 19;
    int x = 10;
    x = 20;
    x = 45;

//    Constants
    final double PI = 3.14;
    int b = 23;
    int c = b;
//    Here C = B = 23
    int b = 43;

    public double getCgpa() {
        return cgpa;
    }
//    Note : Only the b value changes now , not c.. Because B and c are independent variables here
    System.out.println(a);
    System.out.println(getCgpa());
    System.out.println(gender);
    System.out.println(name);
    System.out.println(Passes);
    System.out.println(age);
    System.out.println(x);
    System.out.println(PI);
    System.out.println(b);
    System.out.println(c);
}