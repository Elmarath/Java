package Object_Oriented;

public class Polymorphism {
    public static void main(String[] args) {
        m(new GraduateStudent());
        m(new Student());
        m(new Person());
        m(new Object());

    }

    Person p = new Student(); // upcasting
    Student s = (Student) new Person(); // downcasting

    public static void m(Object x) {
        System.out.println(x.toString());
    }
}

class GraduateStudent extends Student {

}

class Student extends Person {
    public String toString() {
        return "Student";
    }
}

class Person extends Object {

    public String toString() {
        return "Person";
    }
}
