class ObjectOriented {
    void abstraction(){
        System.out.println("Abstraction");
    }
    void polymorphism(){
        System.out.println("Polymorphism");
    }
    void inheritance(){
        System.out.println("Inheritance");
    }
}
class JavaLanguage extends ObjectOriented {
    @Override
    void abstraction() {
        System.out.println("Java Abstraction");
    }
    @Override
    void polymorphism(){
        System.out.println("Java Polymorphism");
    }
    @Override
    void inheritance(){
        System.out.println("Java Inheritance");
    }
    void persistence(){
        System.out.println("Java Persistence");
    }
    void interfaces(){
        System.out.println("Java Interfaces");
    }
}
class C_Language extends ObjectOriented {
    @Override
    void abstraction() {
        System.out.println("C++ Abstraction");
    }
    @Override
    void polymorphism(){
        System.out.println("C++ Polymorphism");
    }
    @Override
    void inheritance(){
        System.out.println("C++ Inheritance");
    }
    void template() {
        System.out.println("Template");
    }
    void friendFunction() {
        System.out.println("Friend Function");
    }
}
public class w10_4and5 {
    public static void main(String[] args) {
        ObjectOriented obj1 = new JavaLanguage();
        obj1.abstraction();
        obj1.polymorphism();
        obj1.inheritance();

        JavaLanguage j = (JavaLanguage)obj1;
        j.persistence();
        j.inheritance();
        
        System.out.println();

        ObjectOriented obj2 = new C_Language();
        obj2.abstraction();
        obj2.polymorphism();
        obj2.inheritance();

        C_Language c = (C_Language)obj2;
        c.template();
        c.friendFunction();
    }
}
