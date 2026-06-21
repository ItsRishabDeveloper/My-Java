class Student {
    String name;   // Instance Variable
}

public class VariableScope {

    static String college = "RUAS"; // Static Variable

    public static void main(String[] args) {

        int a = 10; // Local Variable

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "Rishab";
        s2.name = "Rahul";

        System.out.println("Local Variable: " + a);

        System.out.println("Student 1 Name: " + s1.name);
        System.out.println("Student 2 Name: " + s2.name);

        System.out.println("College: " + VariableScope.college);
    }
}