// Calculator class
class Calculator {

    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add three integers
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Add two double values
    double add(double a, double b) {
        return a + b;
    }
}

// Main class
public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Sum of 10 and 20 = " + calc.add(10, 20));
        System.out.println("Sum of 5, 10 and 15 = " + calc.add(5, 10, 15));
        System.out.println("Sum of 12.5 and 7.5 = " + calc.add(12.5, 7.5));
    }
}