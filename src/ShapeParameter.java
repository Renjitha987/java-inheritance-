class Shapee{
    protected String name;
    Shapee(String name){
        this.name= name;
    }
    void describe(){
        System.out.print("shepe"+name);
    }}
class Circle extends Shapee{
    private float radius;
    final double pie=3.14;
    Circle(String name,float radius){
        super(name);
        this.radius=radius;

    }
    @Override
    public void describe(){
        super.describe();
        double area=pie*radius*radius;
        System.out.print("Area"+area);
    }}
public class ShapeParameter{
    public static void main(String[]args){
        Circle c=new Circle("Circle",5);
        c.describe();
    }}
