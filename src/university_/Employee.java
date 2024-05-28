
package university_;

public abstract class Employee extends person{
    double salary;
    String date_hired;
    
    //default constractor

    public Employee() {
    }
    //primary constractor
    public Employee(String fname, String lname, int id, int age, String phone, double salary,
    String date_hired) {
        super(fname, lname, id, age, phone);
        this.salary=salary;
        this.date_hired=date_hired;
    }
    //****setters methods******

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDate_hired(String date_hired) {
        this.date_hired = date_hired;
    }
    //****getters methods******

    public double getSalary() {
        return salary;
    }

    public String getDate_hired() {
        return date_hired;
    }
    //abstract method
    public abstract double salary();
    
     @Override
      public void print_all_details()
      {
      super.print_all_details();
          System.out.println("the salary is "+salary);
          System.out.println("the date_hired is "+date_hired);
      }
       @Override
    public boolean equals(Object x) {
        person p=(person)x;
        if (id == p.id) 
            return true;
        else
            return false;
       }
      
}
