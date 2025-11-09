class University {
    String uniName;
    int rank;

    University(String uniName, int rank) {
        this.uniName = uniName;
        this.rank = rank;
    }
}
class Faculty extends University {
    String facName;
    Faculty(String uniName, int rank, String facName) {
        super(uniName, rank);
        this.facName = facName;
    }
    void Details() {
        System.out.println("University Name: "+uniName);
        System.out.println("Faculty Name: "+facName);
    }
}
class Department extends Faculty {
    String deptName;
    String chairman;

    Department(String uniName, int rank, String facName, String deptName, String chairman) {
        super(uniName, rank, facName);
        this.deptName = deptName;
        this.chairman = chairman;
    }
    @Override
    void Details() {
        System.out.println("Department Name: "+deptName);
        System.out.println("Chairman: "+chairman);
    }
    void Display() {
        super.Details();
        System.out.println();
        Details();
    }
}
public class w10_6 {
    public static void main(String[] args) {
        Department d = new Department("AMU", 20, "Science", "Computer Science", "Dr. Armaan");
        System.out.println("University ranking: "+d.rank);
        d.Display();
    }
}
