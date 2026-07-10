class Employee{
    private String name;
    private int age;
    private double salary;
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
        if(name == null || name == ""){
            System.out.println("Name is empty");
        }
        else{
            System.out.println("Name is already set");
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
        if(age < 65 && age > 18){
            System.out.println("Accepted");
        }
        else{
            System.out.println("Rejected");
        }
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
        if (salary > 0){
            System.out.println("Salary is set");
        }
        else{
            System.out.println("Salary is empty");
        }
    }
}
public class EncapsulationEX {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rishab",20,50000);
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());
        e1.setName("Rishab Kumar");
        e1.setAge(21);
        e1.setSalary(75000);
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());
        e1.setName(" ");
        e1.setAge(-10);
        e1.setSalary(-5000);
        System.out.println(e1.getName());
        System.out.println(e1.getAge());
        System.out.println(e1.getSalary());
    }
}
