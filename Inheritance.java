class Person {
    String name;
    int age;

    void greeting() {
        System.out.println("Hello World" + name);
    }

    void displayinfo() {
        System.out.println("Hello World" + name);
        System.out.print("You Age is" + age);
    }
}
class student extends Person{
    int registernumber;
    void tellroll(){
        System.out.println("Hello World" + name);
        System.out.print("You Age is" + age);
        System.out.print("You are " + registernumber);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student();
        s1.name = "Rishab";
        s1.age = 20;
        s2.name = "Rahul";
        s1.registernumber = 24;
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.age);
        System.out.println(s2.age);
        System.out.println(s1.registernumber);
    }
}
