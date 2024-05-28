//team 
//ندى صلاح الدين حسن محمد خلف 
//ايمان ضياء الدين
//نورهان عمرو

//software engineering


//in this project we used
//tostring method
//equals method
//abstract class and method
//classes with inheretance
//classes without inheretance



package university_;
import java.util.Scanner;
import java.util.ArrayList;
public class UNIVERSITY_ {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("if you want the under_graduated_students enter 1");
        System.out.println("if you want the post_graduated_students enter 2");
        System.out.println("if you want the faculity_teaching_staff enter 3");
        System.out.println("if you want the staff members enter 4");
        System.out.println("if you want to know College departments fees enter 5 ");
        System.out.println("if you want to compare the id of student using equal enter 6 ");
        
         int number=input.nextInt();
          ArrayList<under_graduated>student=new ArrayList<>();  
       
        
        
        under_graduated s1=new under_graduated("asmaa","sayed",1, 22,"01234595002",4.00,"bio",1);
        under_graduated s2=new under_graduated("Salah","Hassan",2, 22,"01234595002",3.04,"bio",2);
        under_graduated s3=new under_graduated("Dina","Salah",3, 22,"01143432234",3.14,"General",4);
        under_graduated s4=new under_graduated("Youssef","Salah",4, 22,"01003482424",4.00,"SE",4);
        under_graduated s5=new under_graduated("ahmed","ali",5, 22,"0113567546",3.0,"General",1);
        under_graduated s6=new under_graduated("Ahmed","asad", 6, 22,"01234595002",2.1,"SE",1);
        under_graduated s7=new under_graduated("Nada","Salah", 7, 23,"01246665654",3.22,"bi",1);
        under_graduated s8=new under_graduated("Levi","ackreman", 8, 22,"01234094832",3.92,"SE",2);
        under_graduated s9=new under_graduated("Eren","samir", 9, 22,"01114566667",3.01,"General",1);
        under_graduated s10=new under_graduated("Rana","kamel", 10, 22,"0103834254",1.14,"SE",2);   
         student.add(s1);
         student.add(s2);
         student.add(s3);
         student.add(s4);
         student.add(s5);
         student.add(s6);
         student.add(s7);
         student.add(s8);
         student.add(s9);
         student.add(s10);
    
     if(number==1)
       {
        System.out.println("if you are searching for a student enter 1");
        System.out.println("if you want to remove student enter 2");
        System.out.println("if you want to display student list enter 3");
        System.out.println("if you want to add a student enter 4");
        
        
         
          int x=input.nextInt();
        switch (x) {
            case 1:
                //the code of searching for student
               
                System.out.println("please enter ID of the student you searching for");
                int id=input.nextInt();
                for (int i=0;i<student.size();i++)
                {
                    if(student.get(i).get_id()==id)
                    {
                        System.out.println("fname  lname   id  age    phone      GPA  specification    level ");
                        System.out.println(student.get(i).toString());
                    }
                    
                }
               
                break;
            case 2:
                //the code of removing student
                System.out.println("please,enter the id of the student you want to remove ");
                int id_remove=input.nextInt();
                for (int i=0;i<student.size();i++)
                {
                    if(student.get(i).get_id()==id_remove)
                    {
                        student.remove(i);
                    }
                    
                }
                System.out.println("the list after removing element ");
                System.out.println(student);
                break;
            case 3:
                //the code of desiplaying the list
                System.out.println(student);
                break;
            case 4:
                // the code of adding element
               
                under_graduated s11=new under_graduated();
                System.out.println("enter first name");
                s11.fname=input.next();
                System.out.println("enter last name");
                s11.lname=input.next();
                System.out.println("enter id");
                s11.id=input.nextInt();
                System.out.println("enter age");
                s11.age=input.nextInt();
                System.out.println("enter phone");
                s11.phone=input.next();
                System.out.println("enter GPA");
                s11.GPA=input.nextDouble();
                System.out.println("enter Specification");
                s11.specification=input.next();
                System.out.println("enter level");
                s11.level=input.nextInt();
     
                student.add(s11);
                System.out.println("the list after adding");
                System.out.println(student);
                break;
            default:
                System.out.println("not valid");
                break;
        }
       }
     else if(number==2)
     {
        System.out.println("if you are searching for a student enter 1");
        System.out.println("if you want to remove student enter 2");
        System.out.println("if you want to display student list enter 3");
        System.out.println("if you want to add a student enter 4");
         ArrayList<post_graduated>Student=new ArrayList<>(); 
        
        post_graduated st1=new post_graduated("asmaa","sayed",1, 22,"01234595002",4.00,"bio","data communication","Master","Dr.mamdoh");
        post_graduated st2=new post_graduated("Salah","Hassan",2, 22,"01234595002",3.04,"bio","oop","Master","DR.ahmed");
        post_graduated st3=new post_graduated("Dina","Salah",3, 22,"01143432234",3.14,"General","oop","Master","DR.ahmed");
        post_graduated st4=new post_graduated("Youssef","Salah",4, 22,"01003482424",2.77,"SE","IS","Master","DR.Omar");
        post_graduated st5=new post_graduated("ahmed","ali",5, 22,"0113567546",3.0,"General","IT","Master","DR.Ali");
        post_graduated st6=new post_graduated("Ahmed","asad", 6, 22,"01234595002",2.1,"SE","Data communication","Master","DR.Asad");
        post_graduated st7=new post_graduated("Nada","Salah", 7, 23,"01246665654",3.22,"bi","IT","Master","DR.Islam");
        post_graduated st8=new post_graduated("Levi","ackre", 8, 22,"01234094832",3.92,"SE","Data communication","Master","DR.Asad");
        post_graduated st9=new post_graduated("Eren","samir", 9, 22,"01114566667",3.01,"General","IS","Master","DR.Asad");
        post_graduated st10=new post_graduated("Rana","kamel", 10, 22,"0103834254",1.14,"SE","Data structure","Master","DR.kamal");
        post_graduated st11=new post_graduated("asmaa","sayed",11, 22,"01234595002",4.00,"bio","Data communication","Master","DR.Asad");
        post_graduated st12=new post_graduated("Salah","Hassan",12, 22,"01234595002",3.04,"bio","Data communication","Master","DR.Asad");
        post_graduated st13=new post_graduated("Dina","Salah",13, 22,"01143432234",3.14,"General","IS","Master","DR.Mohammed");
        post_graduated st14=new post_graduated("Youssef","Salah",14, 22,"01003482424",2.77,"SE","IT","Master","DR.Dalia");
        post_graduated st15=new post_graduated("ahmed","ali",15, 22,"0113567546",3.0,"General","oop","Master","DR.Ali");

        
         Student.add(st1);
         Student.add(st2);
         Student.add(st3);
         Student.add(st4);
         Student.add(st5);
         Student.add(st6);
         Student.add(st7);
         Student.add(st8);
         Student.add(st9);
         Student.add(st10);
         Student.add(st11);
         Student.add(st12);
         Student.add(st13);
         Student.add(st14);
         Student.add(st15);
         
          int y=input.nextInt();
        switch (y) {
            case 1:
                //the code of searching for student
                System.out.println("please enter ID of the student you searching for");
                int id=input.nextInt();
                for (int i=0;i<Student.size();i++)
                {
                    if(Student.get(i).get_id()==id)
                    {
                        System.out.println("fname  lname   id  age    phone   "
                                + "    GPA  specification    interesting research area     grade    supervisot   ");
                        System.out.println(Student.get(i).toString());
                    }
                }
                break;
            case 2:
                //the code of removing student
                System.out.println("please,enter the id of the student you want to remove ");
                int id_remove=input.nextInt();
                for (int i=0;i<Student.size();i++)
                {
                    if(Student.get(i).get_id()==id_remove)
                    {
                        Student.remove(i);
                    }
                    
                }
                System.out.println("the list after removing element ");
                System.out.println(Student);
                break;
            case 3:
                //the code of desiplaying the list
                System.out.println(Student);
                break;
            case 4:
                // the code of adding element
               post_graduated st16=new post_graduated();
                System.out.println("enter first name");
                st16.fname=input.next();
                System.out.println("enter last name");
                st16.lname=input.next();
                System.out.println("enter id");
                st16.id=input.nextInt();
                System.out.println("enter age");
                st16.age=input.nextInt();
                System.out.println("enter phone");
                st16.phone=input.next();
                System.out.println("enter GPA");
                st16.GPA=input.nextDouble();
                System.out.println("enter Specification");
                st16.specification=input.next();
                System.out.println("enter interesting search area ");
                st16.interesting_search_area=input.next();
                System.out.println("enter grade  ");
                st16.grade=input.next();
                System.out.println("enter supervisor ");
                st16.supervisor=input.next();
                System.out.println("the list after adding");
                System.out.println(Student);
                break;
            default:
                System.out.println("not valid");
                break;
        }
     }
     
     
     else if(number==3)
     {
       ArrayList<faculity>faculity1=new ArrayList<>();  
       
        System.out.println("if you are searching for a Doctor enter 1");
        System.out.println("if you want to remove Doctor 2");
        System.out.println("if you want to display Doctor list enter 3");
        System.out.println("if you want to add a Doctor enter 4");
        
        faculity f1=new faculity("mostafa","nady",1, 33, "0112986006",2000,"12/9/2004",120,"Doctor", 100);
        faculity f2=new faculity("wafaa","nasser",2, 39, "0122986006",8000,"1/12/2017",120,"teaching assistant",100);
        faculity f3=new faculity("amgad","youssef",3, 44, "0112786566",5000,"9/4/2015",120,"Doctor", 100);
        faculity f4=new faculity("mostafa","nady",4, 31, "011806216",2000,"2/2/2002",120,"Doctor", 100);
        faculity f5=new faculity("yasser","nady",5, 49, "0112986006",2000,"8/9/2000",120,"Doctor", 100);
        faculity f6=new faculity("dalia","mohammed",6, 44, "0109112000",7000,"4/10/2008",120,"Doctor", 100);
        faculity f7=new faculity("Ahmed","kamel",7, 33, "0119875443",5000,"12/10/2010",120,"teaching assistant", 100);
        faculity f8=new faculity("Amir","saad",8, 47, "0112986006",7000,"1/6/2018",120,"Doctor", 100);
        faculity f9=new faculity("Manal","tarek",9, 32, "0109871086",2000,"12/9/2019",120,"teaching assistant", 100);
        faculity f10=new faculity("mariam","gasser",10, 38, "0118796006",4000,"5/9/2009",120,"teaching assistant", 100);   
         faculity1.add(f1);
         faculity1.add(f2);
         faculity1.add(f3);
         faculity1.add(f4);
         faculity1.add(f5);
         faculity1.add(f6);
         faculity1.add(f7);
         faculity1.add(f8);
         faculity1.add(f9);
         faculity1.add(f10);
           int z=input.nextInt();
        switch (z) {
            case 1:
                //the code of searching for Doctor
                System.out.println("please enter ID of the Doctor you searching for");
                int id=input.nextInt();
                for (int i=0;i<faculity1.size();i++)
                {
                    if(faculity1.get(i).get_id()==id)
                    {
                        System.out.println("fname  lname   id  age    phone   "
                                + "   salary     date_hired    work_hour   rank    bonus ");
                        System.out.println(faculity1.get(i).toString());
                    }
                }
                break;
            case 2:
                //the code of removing Doctor
                System.out.println("please,enter the id of the Doctor you want to remove ");
                int id_remove=input.nextInt();
                for (int i=0;i<faculity1.size();i++)
                {
                    if(faculity1.get(i).get_id()==id_remove)
                    {
                        faculity1.remove(i);
                    }
                    
                }
                System.out.println("the list after removing element ");
                System.out.println(faculity1);
                break;
            case 3:
                //the code of desiplaying the list
                System.out.println(faculity1);
                break;
            case 4:
                // the code of adding element
                 faculity f16=new faculity();
                System.out.println("enter first name");
                f16.fname=input.next();
                System.out.println("enter last name");
                f16.lname=input.next();
                System.out.println("enter id");
                f16.id=input.nextInt();
                System.out.println("enter age");
                f16.age=input.nextInt();
                System.out.println("enter phone");
                f16.phone=input.next();
                System.out.println("enter salary");
                f16.salary=input.nextDouble();
                System.out.println("enter date_hired");
                f16.date_hired=input.next();
                System.out.println("enter work_hour ");
                f16.work_hour=input.nextInt();
                System.out.println("enter rank ");
                f16.rank=input.next();
                System.out.println("enter bonus ");
                f16.bonus=input.nextInt();
                System.out.println("the list after adding");
                System.out.println(faculity1);
                break;
            default:
                System.out.println("not valid");
                break;
        }
     }
     
     else if(number==4)
     {
      ArrayList<staff>staff1=new ArrayList<>();  
       
        System.out.println("if you are searching for a staff member  enter 1");
        System.out.println("if you want to remove staff member 2");
        System.out.println("if you want to display staff member list enter 3");
        System.out.println("if you want to add a staff member enter 4");
        
        staff A1=new staff("mostafa","nady",1, 33, "0112986006",2000,"12/9/2004","students affairs", 1);
        staff A2=new staff("wafaa","nasser",2, 39, "0122986006",8000,"1/12/2017","cafeteria",12);
        staff A3=new staff("amgad","youssef",3, 44, "0112786566",5000,"9/4/2015","cleaner", 4);
        staff A4=new staff("mostafa","nady",4, 31, "011806216",2000,"2/2/2002","security",3);
        staff A5=new staff("yasser","nady",5, 49, "0112986006",2000,"8/9/2000","security",2);
        staff A6=new staff("dalia","mohammed",6, 44, "0109112000",7000,"4/10/2008","cleaner",5);
        staff A7=new staff("Ahmed","kamel",7, 33, "0119875443",5000,"12/10/2010","cafeteria",0);
        staff A8=new staff("Amir","saad",8, 47, "0112986006",7000,"1/6/2018","security",7);
        staff A9=new staff("Manal","tarek",9, 32, "0109871086",2000,"12/9/2019","security", 2);
        staff A10=new staff("mariam","gasser",10, 38, "0118796006",4000,"5/9/2009","tsecurity", 1);   
         staff1.add(A1);
         staff1.add(A2);
         staff1.add(A3);
         staff1.add(A4);
         staff1.add(A5);
         staff1.add(A6);
         staff1.add(A7);
         staff1.add(A8);
         staff1.add(A9);
         staff1.add(A10);
           int M=input.nextInt();
        switch (M) {
            case 1:
                //the code of searching for Staff member
                System.out.println("please enter ID of the staff member you searching for");
                int id=input.nextInt();
                for (int i=0;i<staff1.size();i++)
                {
                    if(staff1.get(i).get_id()==id)
                    {
                        System.out.println("fname  lname   id  age   phone      salary   date_hired     department     days_of_absence ");
                        System.out.println(staff1.get(i).toString());
                    }
                }
                break;
            case 2:
                //the code of removing staff member
                System.out.println("please,enter the id of the staff member you want to remove ");
                int id_remove=input.nextInt();
                for (int i=0;i<staff1.size();i++)
                {
                    if(staff1.get(i).get_id()==id_remove)
                    {
                        staff1.remove(i);
                    }
                    
                }
                System.out.println("the list after removing element ");
                System.out.println(staff1);
                break;
            case 3:
                //the code of desiplaying the list
                System.out.println(staff1);
                break;
            case 4:
                // the code of adding element
                 staff A16=new staff();
                System.out.println("enter first name");
                A16.fname=input.next();
                System.out.println("enter last name");
                A16.lname=input.next();
                System.out.println("enter id");
                A16.id=input.nextInt();
                System.out.println("enter age");
                A16.age=input.nextInt();
                System.out.println("enter phone");
                A16.phone=input.next();
                System.out.println("enter salary");
                A16.salary=input.nextDouble();
                System.out.println("enter date_hired");
                A16.date_hired=input.next();
                System.out.println("enter department ");
                A16.department=input.next();
                System.out.println("enter days_of_absence ");
                A16.days_of_absence=input.nextInt();
           
                System.out.println("the list after adding");
                System.out.println(staff1);
                break;
            default:
                System.out.println("not valid");
                break;
        }
        }
     
     //this code is for knowing the fees of studying in any department in the college
     else if(number==5)
     {
         System.out.println("for General department enter 1");
         System.out.println("for Bio department enter 2");
         System.out.println("for SE department enter 3");
         int num=input.nextInt();
         if(num==1)
         {
             System.out.println("please,enter number of subjects you will study this year ");
             int n=input.nextInt();
             General G1=new General(n);
             System.out.println(G1.education_fees());
         }
         else if(num==2)
         {
             System.out.println("please,enter number of subjects you will study this year ");
             int n=input.nextInt();
             Bio B1=new Bio(n);
             System.out.println(B1.education_fees());
         }
         else if(num==3)
         {
             System.out.println("please,enter number of subjects you will study this year ");
             int n=input.nextInt();
             SE se1=new SE(n);
             System.out.println(se1.education_fees());
         }
            else
         System.out.println("not valid");
         
      //using equal method
     }
     else if(number==6)
     {
     if (s1.equals(s2)) 
            System.out.println("Equal ");
         else 
            System.out.println("Not Equal ");
     
     }
    }
     
     
  }
  