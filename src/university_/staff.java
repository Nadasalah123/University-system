
package university_;

public class staff extends Employee {
    String department;
    int days_of_absence;
    //default constractor
    public staff() {
    }
    //primary constractor
    public staff(String fname, String lname, int id, int age, String phone, 
            double salary,String date_hired,String department,int days_of_absence) {
        super(fname, lname, id, age, phone, salary, date_hired);
    }
    //setter methods
    public void setdepartment(String department) {
        this.department = department;
    }

    public void setDays_of_absence(int days_of_absence) {
        this.days_of_absence = days_of_absence;
    }
    
    //getter methods
    public String getdepartment() {
        return department;
    }

    public int getDays_of_absence() {
        return days_of_absence;
    }
    
    @Override
    public double salary()
    {
        return salary-(days_of_absence*5);
    }
     @Override
      public void print_all_details()
      {
      super.print_all_details();
          System.out.println("the department is "+department);
          System.out.println("the days_of_absence are "+days_of_absence);
      }
     @Override
    public String toString() {
        return fname +"   "+lname+"   "+id+"    "+age+"    "+phone+"   " +salary+"   "+date_hired+"   "
                +department +"   "+ days_of_absence;
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
