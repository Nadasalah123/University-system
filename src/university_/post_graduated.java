
package university_;

public class post_graduated extends student{
   protected String interesting_search_area;
   protected String grade;
   protected String supervisor;
  //default constractor

    public post_graduated() {
    }
  //primary constractor
    public post_graduated(String fname, String lname, int id, int age, String phone,
            double GPA, String specification,String interesting_search_area,String grade,String supervisor) 
    {
        super(fname, lname, id, age, phone,GPA, specification);
        this.interesting_search_area=interesting_search_area;
        this.grade=grade;
        this.supervisor=supervisor;
    }
    //****setters methods****

    public void setInteresting_search_area(String interesting_search_area) {
        this.interesting_search_area = interesting_search_area;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
   //****getters methods****

    public String getInteresting_search_area() {
        return interesting_search_area;
    }

    public String getGrade() {
        return grade;
    }

    public String getSupervisor() {
        return supervisor;
    }
    
     @Override
    public String toString() {
        return fname+"   "+ lname+"   "+id+"    "+age+"   "+phone+"   "+GPA+
                "   "+specification+"     "+interesting_search_area+"     "+grade+"     "+supervisor;
    }
      @Override
     public void print_all_details()
      {
      super.print_all_details();
          System.out.println("the interesting_search_area is "+interesting_search_area);
          System.out.println("the grade is "+grade);
          System.out.println("the supervisor is "+supervisor);
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
