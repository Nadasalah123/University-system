
package university_;

public  abstract class student extends person {
    protected String specification; 
    protected double GPA;
    //defult constructor
    public student()
    {
    }
    //primary constractor
    public student(String fname,String lname,int id,int age,String phone,
          double GPA,String specification)
    {
        super(fname,lname,id,age,phone);
                this.specification=specification;
                this.GPA=GPA;
    }
      //****setters methods****
     public void set_specification(String specification)
    {
    this.specification=specification;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
     
      //***getters methods****
      public String get_specification()
    {
      return specification;
    }

    public double getGPA() {
        return GPA;
    }
      
    @Override
      public void print_all_details()
      {
      super.print_all_details();
          System.out.println("the specification is "+specification);
      }

   

    @Override
    public boolean equals(Object x) {
        student s=(student)x;
        if (id==s.id) 
            return true;
          else
            return false;
        }
      
}
