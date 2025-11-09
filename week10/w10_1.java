class Person {
    String name;
    long phone;

    Person(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }
    class Address {
        int house_no;
        String street;
        String city;
        String state;

        Address(int house_no,String street,String city,String state) {
            this.house_no = house_no;
            this.street = street;
            this.city = city;
            this.state = state;
        }
        void displayAddr() {
            System.out.println("Address: "+house_no+", "+street+", "+city+", "+state);
        }
    }
    class DateOfBirth {
        int day;
        int month;
        int year;
        
        DateOfBirth(int day, int month, int year) {
            this.day = day;
            this.month = month;
            this.year = year;
        }
        void displayDOB() {
            System.out.println("DOB: "+day+"/"+month+"/"+year);
        }
    }
    void display(Address add, DateOfBirth dob) {
        System.out.println("Name: "+name);
        add.displayAddr();
        dob.displayDOB();
        System.out.println("Phone no.: "+phone);
    }
}
public class w10_1 {
    public static void main(String[] args) {
        Person p = new Person("ABC", 6023094427L);

        Person.Address add = p.new Address(45, "Park Street", "Agra","UP");
        Person.DateOfBirth dob = p.new DateOfBirth(12, 4, 2001);

        p.display(add, dob);
    }
}