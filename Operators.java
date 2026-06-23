//An operator performs an action on one or more operands.
public class Operators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 50;
        int e = 100;
        int f = 200;
//        int c = a+b;.
//        Arithmetic operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
//        if in a%b (if a is smaller than b then answer is always a itself)
        System.out.println(b%a);

//        Assingment Operators
        a+=5;
        b+=5;
        a*=2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);

//        Relational Operators
        System.out.println(10==10);
        System.out.println(10!=10);
        System.out.println(10>20);
        System.out.println(50<10);
        System.out.println(10>=10);

//        Logical Operators
        int age = 20;
        boolean x = true;
        System.out.println(age > 18 && age <60);
        System.out.println(age > 18 || age <60);
        System.out.println(!x);
//        Post increment
        System.out.println(c++);
        System.out.println(d++);
        System.out.println(c);
        System.out.println(d);
//        Pre Increment
        System.out.println(++c);
        System.out.println(++d);

        //        Post decrement
        System.out.println(e--);
        System.out.println(f--);
        System.out.println(e);
        System.out.println(f);
//        Pre Increment
        System.out.println(--e);
        System.out.println(--f);
        System.out.println(e);
    }
}
