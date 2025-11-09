class Employee {
    String empName;
    int empId;

    Employee(String empName, int empId) {
        this.empName = empName;
        this.empId = empId;
    }
    class Salary {
        int basic;
        int hra;
        int pf;

        Salary(int basic, int hra, int pf) {
            this.basic = basic;
            this.hra = hra;
            this.pf = pf;
        }
        void displaySalary() {
            System.out.println("'Salary details'");
            System.out.println("Basic: "+basic);
            System.out.println("HRA: "+hra);
            System.out.println("PF: "+pf);
            System.out.println();
        }
    }
    class JoiningDate {
        int day;
        int month;
        int year;

        JoiningDate(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        void displayJoiningDate() {
            System.out.println("'Joining'");
            System.out.println("Day: "+day);
            System.out.println("Month: "+month);
            System.out.println("Year: "+year);
        }
    }
    void displayEmployee(Salary pay, JoiningDate join) {
            System.out.println("'Employee Details'");
            System.out.println("Name: "+empName);
            System.out.println("Id: "+empId);
            System.out.println();
            pay.displaySalary();
            join.displayJoiningDate();
    }
}
public class w10_7 {
    public static void main(String[] args) {
        Employee emp = new Employee("Jeff", 2940);

        Employee.Salary pay = emp.new Salary(1500000, 20000, 30000);
        Employee.JoiningDate join = emp.new JoiningDate(12, 6, 2003);
        
        emp.displayEmployee(pay, join);
    }
}
