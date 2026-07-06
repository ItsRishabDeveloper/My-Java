class Student01 {
    String name;
    int age;
    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}
public class OOPS {
    public static void main(String[] args) {
        Student01 s1 = new Student01();
        Student01 s2 = new Student01();
        s1.name = "Rishab";
        s1.age = 18;
        s2.name = "Rishab";
        s2.age = 18;
        System.out.println(s1.name);
        System.out.println(s1.age);
        System.out.println(s2.name);
        System.out.println(s2.age);
        s1.display();
        s2.display();
    }
}
