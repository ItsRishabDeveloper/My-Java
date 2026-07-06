class Mobile{
    String Brand;
    String Model;
    double Price;
    String Battery;

    void Display(){
        System.out.println("This is the Mobile Display");
    }
    void turnon(){
        System.out.println(("Mobile turned on"));
    }
    void turnoff(){
        System.out.println(("Mobile turned off"));
    }

}
public class OOPSPractice {
    public static void main(String[] args) {
        Mobile m1 = new Mobile();
        Mobile m2 = new Mobile();
        m1.Display();
        m2.Display();
    }
}
