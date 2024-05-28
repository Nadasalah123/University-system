
package university_;

public class faculity extends Employee{
    double work_hour;
    String rank;
    double bonus;
    //default constractor
    public faculity() {
    }
    //primary constractor

    public faculity(String fname, String lname, int id, int age, String phone, double salary,
            String date_hired,double work_hour,String rank,double bonus)
    {
        super(fname, lname, id, age, phone, salary, date_hired);
    this.work_hour=work_hour;
    this.rank=rank;
    this.bonus=bonus;
    }
    
    //setter methods
    public void setWork_hour(double work_hour) {
        this.work_hour = work_hour;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    //getter methods
    public double getWork_hour() {
        return work_hour;
    }

    public String getrank() {
        return rank;
    }

    public double getBonus() {
        return bonus;
    }
    
    @Override
    public double salary()
    {
        return (work_hour*20)+bonus;
    }
     @Override
      public void print_all_details()
      {
      super.print_all_details();
          System.out.println("the work_hours are "+work_hour);
          System.out.println("the rank is "+rank);
          System.out.println("the bonus is "+bonus);
      }

    @Override
    public String toString() {
        return fname +"   "+lname+"   "+id+"    "+age+"    "+phone+"   " +salary+"   "+date_hired+"   "
                +work_hour +"   "+ rank+ " "+ bonus;
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
