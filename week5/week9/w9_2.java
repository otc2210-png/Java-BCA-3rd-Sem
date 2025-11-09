class University {
    String uniname;
    int ranking;

    University(String uniname, int ranking) {
        this.uniname=uniname;
        this.ranking=ranking;
    }
}
class Faculty extends University {
    String facname;
    Faculty(String uniname, int ranking, String facname) {
        super(uniname, ranking);
        this.facname=facname;
    }
    void Details() {
        System.out.println("Faculty: "+facname);
    }
}
class Department extends Faculty {
    String deptname;
    String chairman;

    Department(String uniname, int ranking, String facname, String deptname, String chairman) {
        super(uniname, ranking, facname);
        this.deptname=deptname;
        this.chairman=chairman;
    }
    void Details() {
        System.out.println("Department: "+deptname);
        System.out.println("Chairman: "+chairman);
    }
    void Display() {
        System.out.println("University: "+uniname);
        super.Details();
        Details();
    }
}
public class w9_2 {
    public static void main(String[] args) {
        Department d = new Department("AMU", 8, "Science", "Computer", "Dr. Armaan");
        d.Display();
        System.out.println("Ranking: "+d.ranking);
    }
}
