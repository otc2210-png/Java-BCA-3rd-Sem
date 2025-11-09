class Employee {
    String name;
    int salary;

    Employee(String name, int salary) {
        this.name=name;
        this.salary=salary;
    }
    void showDetails() {
        System.out.println("Name = "+name);
        System.out.println("Salary = "+salary+"/annum");
    }
}
class Manager extends Employee {
    String department;

    Manager(String name, int salary, String department) {
        super(name, salary);
        this.department=department;
    }
    void showDetails() {
        super.showDetails();
        System.out.println("Department = "+department);
    }
}
public class w9_7 {
    public static void main(String[] args) {
        Manager m = new Manager("ABC", 3000000, "Marketing");
        m.showDetails();
    }
}
