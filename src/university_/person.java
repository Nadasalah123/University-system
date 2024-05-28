
package university_;

public abstract class person {
    //*******attributes*******
     protected String fname;
     protected String lname;
     protected int id;
     protected int age;
     protected String phone;
     
    //****defult constractor**
    public person()
    {
    }
    //primary constractor
    public person(String fname,String lname,int id,int age )
    {
        this.fname=fname;
        this.lname=lname;
        this.id=id;
        this.age=age;
        
    }
    //***second constractor***
    public person(String fname,String lname,int id,int age,String phone)    {
    this(fname,lname,id,age);
    this.phone=phone;
    }
    //****setters methods******
     public void set_fname(String fname)
    {
      this.fname=fname;
    }
    public void set_lname(String lname)
    {
    this.lname=lname;
    }
    public void set_id(int id)
    {
    this.id=id;
    }
    public void set_age(int age)
    {
    this.age=age;
    }
     public void set_phone(String phone)
    {
    this.phone=phone;
    }
    
      
      //***getters methods****
      public String get_fname()
    {
      return fname;
    }
    public String get_lname()
    {
    return lname;
    }
    public int get_id()
    {
    return id;
    }
    public int get_age()
    {
    return age;
    }
     public String get_phone()
    {
    return phone;
    }
     
       public void print_all_details()
    {
        System.out.println("first name is "+fname);
        System.out.println("last name is "+lname);
        System.out.println("id is "+id);
        System.out.println("age "+age); 
        System.out.println("phone is "+phone);
      
    }


   
   

  
       
}
