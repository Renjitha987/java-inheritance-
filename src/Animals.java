class Animal1 {

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog1 extends Animal1 {

    public void bark() {
        System.out.println("Dog is barking");
    }
}

public class Animals {

    public static void main(String[] args) {

        Dog1 d = new Dog1();

        d.eat();
        d.sleep();
        d.bark();
    }
}