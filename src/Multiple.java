interface A{
    default void display(){
        System.out.println("A");
    }}
interface B{
    default void display()
    {
        System.out.println("B");}}
class C implements A,B{
    @Override
    public void display(){
        A.super.display();
        B.super.display();
        System.out.println("C");
    }}
public class Multiple{
    public static void main(String[]args){
        C obj=new C();
        obj.display();
    }}