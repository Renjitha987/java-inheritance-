// Superclass
class Employee {

    void calculateSalary() {
        System.out.println("Employee salary calculation");
    }
}

// Subclass Manager
class Manager extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Manager Salary = ₹80,000");
    }
}

// Subclass Developer
class Developer extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Developer Salary = ₹60,000");
    }
}

// Subclass Intern
class Intern extends Employee {

    @Override
    void calculateSalary() {
        System.out.println("Intern Salary = ₹15,000");
    }
}

// Main class
public class EmployeeTest {

    public static void main(String[] args) {

        Employee emp;

        emp = new Manager();
        emp.calculateSalary();

        emp = new Developer();
        emp.calculateSalary();

        emp = new Intern();
        emp.calculateSalary();
    }
}