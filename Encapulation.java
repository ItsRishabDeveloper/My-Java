//class Student_Portfolio{
//    String name;
//    int age;
//}
//public class Encapulation {
//    public static void main(String[] args) {
//        Student_Portfolio s1 = new Student_Portfolio();
//        s1.name="John";
//        s1.age=18;
//        System.out.println(s1.name);
//        System.out.println(s1.age);
//    }
//}
//Earlier in this we had a problem like anyone could change the valueof the variables and subsequently we we get that values..
//So here is encapsulation..
class Student_portfolio{
    private String name;
    private int age;
    void setAge(int age){
        this.age=age;
    }
    public int getAge() {
        return age;
    }
}
public class Encapulation {
    public static void main(String[] args) {
        Student_portfolio s1 = new Student_portfolio();
//        s1.name = "Rishab"; error
        s1.setAge(20);
        System.out.println(s1.getAge());
    }
}