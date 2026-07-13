class Employee{
    int  employeeID;
    String employyeName;
    double salary;
    //Constructor
    Employee(int employeeID,String employeeName,double salary)
    {
        this.employeeID=employeeID;
        this.employyeName=employeeName;
        this.salary=salary;
    }
    void displayEmployee(){
        System.out.println("Employee Detailes");
        System.out.println(" ID : "+employeeID);
        System.out.println(" Name : "+employyeName);
        System.out.println(" Salary : "+salary);

    }
}
class Manager extends Employee {
    String department;
    double bonus;

    Manager(int employeeID, String employeeName, double salary, String department,double bonus) {
        super(employeeID,employeeName,salary);
        this.department=department;
        this.bonus=bonus;
}
void displayManager(){
        displayEmployee();

        System.out.println();
        System.out.println("manager Detailes");
        System.out.println("________");
        System.out.println("Department:" +department);
        System.out.println("Bonus:" +bonus);


}

public static void main(String[] args){
        Manager obj = new Manager(101,"renjitha",900000,"Sales",150000);
        obj.displayManager();

    }
}