
package lab9;


public class Movie {
    protected int IDNum;
    protected String Title;

    public Movie(int I , String s) {
        this.IDNum = I;
        this.Title = s;
    }

    public void setIDNum(int IDNum) {
        this.IDNum = IDNum;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getIDNum() {
        return IDNum;
    }

    public String getTitle() {
        return Title;
    }

    @Override
    public boolean equals(Object obj) {
        final Movie other = (Movie) obj;
        if (this.IDNum != other.IDNum) {
            System.out.println("id number are notidentical");
            return false;
        }
        System.out.println("id num are identical");
        return true;
    }
   public void Display(){
       System.out.println("ID number of the movie is " + IDNum+" Title of the movie is " + Title);
   }
    
}

class Action extends Movie{
    private int Days;
    private int fee;
    public Action(int a, String b){
        super(a,b);
        fee = 3;
        
    }
    public int Calcfee(int a){
        Days = a;
        int s = Days *fee;
        //System.out.println("fee is " + s);
        return s;
    }
    public void Display(){
        super.Display();
        System.out.println("late Days are " + Days+ " fee per day is " + fee + "and total fee is " + Calcfee(Days));
        
    }

    
}
class Drama extends Movie{
    private int Days;
    private int fee = 2;
    public Drama(int a, String b){
        super(a,b);
        fee = 2;
        
    }
    public int Calcfee(int a){
        Days = a;
        int s = Days *fee;
        return s;
    }
     public void Display(){
        super.Display();
        System.out.println("late Days are " + Days+ " fee per day is " + fee + "and total fee is " + Calcfee(Days));
        
    }

    
}
class Comedy extends Movie{
    private int Days;
    private double fee = 2;
    public Comedy(int a, String b){
        super(a,b);
        fee = 2.5;
        
    }
    public double Calcfee(int a){
        Days = a;
        double s = Days *fee;
        return s;
    }
     public void Display(){
        super.Display();
        System.out.println("late Days are " + Days+ " fee per day is " + fee + " and total latefee is " + Calcfee(Days));
        
    }

    
}
