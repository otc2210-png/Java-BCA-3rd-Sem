class  Student {
    int rollNo;
    String name;
    int marks;
    static String schoolName;

    Student( int rollNo, String name, int marks, String schoolName) {
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
        this.schoolName=schoolName;
    }
    static String changeSchoolName(String newName) {
       return schoolName=newName;
    }
    void display() {
        System.out.println("Roll No.: "+rollNo);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks+"/100");
        System.out.println("School Name: "+schoolName);
        System.out.println();
    }
}
public class w9_10 {
    public static void main (String[] args) {
        Student s = new Student(37, "abc", 73, "APS");
        s.display();

        Student.changeSchoolName("DPS");
        s.display();
    }
}