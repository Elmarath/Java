package SuperKeyword;

/* File name : Employee.java */
class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}

/* File name : Salary.java */
class Salary extends Employee {
    private double salary; // Annual salary

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class ");
        System.out.println("Mailing check to " + getName() + " with salary " + salary);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            salary = newSalary;
        } else {
            System.out.println("new salary could not initialized.");
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary / 52;
    }
}

public class SuperKullanim {
    public static void main(String[] args) {
        Salary s1 = new Salary("Denisan", "balcova", 12, 5000);
        System.out.println(s1.getAddress());
        System.out.println(s1.computePay());

    }
}