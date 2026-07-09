class Student10 {
    String name;
    int age;
    Student10(String name, int age) {
        System.out.println("Student object was created.");
        this.name = name;
        this.age = age;
    }
}
public class Constructors01 {
    public static void main(String[] args) {
        Student10 s1 = new Student10("Rishab", 19);
        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}