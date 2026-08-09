class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {

    Dog() {
        super();
        System.out.println("Dog constructor");
    }

    void bark() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {

    Cat() {
        super();
        System.out.println("Cat constructor");
    }

    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();

        System.out.println();

        Cat c = new Cat();

        System.out.println();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}