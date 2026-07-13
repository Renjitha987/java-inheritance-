class Student{
    protected int  rollNo;
    protected String name;
    protected double marks;

    // constructor
    Student(int rollNo, String name, double marks){
        this.rollNo=rollNo;
        this.name=name;
        this.marks=marks;
    }
    //method to display student details
    void displayStudent()
    {
        System.out.println("Student Details");
        System.out.println("---------------");
        System.out.println("Roll No      : " + rollNo);
        System.out.println("Name         : " + name);
        System.out.println("Marks        : " + marks);
    }




}
