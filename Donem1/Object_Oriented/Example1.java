package Object_Oriented;

public class Example1 extends Example2 {

    String name;

    public void sayName() {
        System.out.println("My name");
    }

    public void sayName(String name) {
        System.out.println("My name is :" + name);
    }

    public static void main(String[] args) {
        Example1 e1 = new Example1();
        e1.sayHi();
    }
}
