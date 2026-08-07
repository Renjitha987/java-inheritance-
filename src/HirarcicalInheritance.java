
class Shape {
    String color = "Red";

    void displayColor() {
        System.out.println("The color of this shape is: " + color);
    }
}

// Child Class 1 (Inherits from Shape)
class Circle extends Shape {
    double radius = 5.0;

    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of the Circle: " + area);
    }
}

// Child Class 2 (Inherits from Shape)
class Square extends Shape {
    double side = 4.0;

    void calculateArea() {
        double area = side * side;
        System.out.println("Area of the Square: " + area);
    }
}

// Main Class to execute the code
public class HirarcicalInheritance {
    public static void main(String[] args) {

        System.out.println("--- Testing Circle ---");
        Circle myCircle = new Circle();
        myCircle.displayColor(); // Accessing Parent method
        myCircle.calculateArea(); // Accessing Child1 method

        System.out.println("\n--- Testing Square ---");
        Square mySquare = new Square();
        mySquare.displayColor(); // Accessing Parent method
        mySquare.calculateArea(); // Accessing Child2 method
    }
}

