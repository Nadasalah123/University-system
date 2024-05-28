
package university_;

public class under_graduated extends student {
      protected int level;
    //defult constructor
    public under_graduated() {
    }
    //primary constractor
    public under_graduated(String fname, String lname, int id, int age, String phone,
             double GPA, String specification,int level) {
        super(fname, lname, id, age, phone,GPA, specification);
        this.level=level;
    }
    //****setters methods****

   

    public void setLevel(int level) {
        this.level = level;
    }
      //****getters methods****

    public int getLevel() {
        return level;
    }

   
      @Override
    public String toString() {
        return fname+"   "+ lname+"  "+id+"  "+age+"  "+phone+"  "+"   "+GPA+"   "+specification+"   "+level;
    }
      @Override
     public void print_all_details()
      {
      super.print_all_details();
          System.out.println("the level is "+level);
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
