class Animal{
    public void eat(){
        System.out.println("animal is eating");}
    public void sleep(){
        System.out.println("animal is sleeping");}
}
class Dog extends Animal{
    public void bark(){
        System.out.println("animal is barking");}

}
public class Animals
{
    public static void main(String[]args){
        Dog d=new Dog();
        d.eat();
        d.sleep();
        d.bark();
    }}