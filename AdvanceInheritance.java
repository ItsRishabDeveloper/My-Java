class Emp{
    private String name;
    private int age;
    private double salary;
    Emp(String name,int age,double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public double getSalary(){
        return salary;
    }
    void displaydetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Salary:"+salary);
    }
}
class developer extends Emp{
    private String ProgrammingLaunguage;
    developer(String name,int age,double salary){
        super(name,age,salary);
        this.ProgrammingLaunguage = "Programming Launguage";
    }
    @Override
    void displaydetails(){
        super.displaydetails();
        System.out.println("Programming Launguage:"+ProgrammingLaunguage);
    }
}
class manager extends Emp{
    private int teamSize;
    manager(String name,int age,double salary,int teamSize){
        super(name,age,salary);
        this.teamSize = teamSize;
    }
    @Override
    void displaydetails(){
        super.displaydetails();
        System.out.println("Team Size:"+teamSize);
    }
}
public class AdvanceInheritance {
    public static void main(String[] args) {
        developer d1 = new developer("David",23,500);
        d1.displaydetails();
        manager m1 = new manager("Rahul",45,60000,15);
        m1.displaydetails();
        Emp e1 = new developer("David",23,500);
        e1.displaydetails();
    }
}
