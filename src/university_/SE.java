
package university_;

public class SE implements fees{
     int number_of_subject;
     final double price_of_subject=1000;
 //primary constractor

    public SE(int number_of_subject) {
        this.number_of_subject=number_of_subject;
    }
   
     //setter methods
    public void setNumber_of_subject(int number_of_subject) {
        this.number_of_subject = number_of_subject;
    }

    //getter methods
    public int getNumber_of_subject() {
        return number_of_subject;  
    }
    public double getPrice_of_subject() {
        return price_of_subject;
    }
    
    @Override
    public double education_fees()
    {
    return number_of_subject*price_of_subject;
    }
}
