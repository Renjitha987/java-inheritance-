class Vehicle{
    protected String regNo;
    protected double dailyRate;

    Vehicle(String regNo,double dailyRate){
        this.regNo=regNo;
        this.dailyRate=dailyRate;
    }
    double computerRent(int days){
        return dailyRate *days;
    }
}
class Car extends Vehicle{
    private int numDoors;
    Car(String regNo,double dailyRate,int numDoors){
        super(regNo,dailyRate);
        this.numDoors=numDoors;
    }
    @Override
    double computerRent( int days){
        return super.computerRent(days)+200;

    }
}
public class VehicleRental{
    public static void main(String[]args){
        Car c=new Car("KLo5a123",1500,4);
        System.out.println("Rent:"+c.computerRent(3));
    }}