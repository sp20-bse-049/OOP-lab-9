
package lab9;


public class Simple {
    protected double Num1;
    protected double Num2;

    public Simple(double Num1, double Num2) {
        this.Num1 = Num1;
        this.Num2 = Num2;
    }

    public void setNum1(double Num1) {
        this.Num1 = Num1;
    }

    public void setNum2(double Num2) {
        this.Num2 = Num2;
    }

    public double getNum1() {
        return Num1;
    }

    public double getNum2() {
        return Num2;
    }
    
    public double Add(){
        double s = Num1+Num2;
        return s;
    }
     public double Sub(){
        double s = Num1-Num2;
        return s;
    }
      public double Mul(){
        double s = Num1*Num2;
        return s;
    }
       public double Devide(){
        double s = Num1/Num2;
        return s;
    }
}
class VerifiedSimple extends Simple{
    double s;
    public VerifiedSimple(double a, double b){
        super(a,b);
    }
     public double Add(){
         s = Num1+Num2;
        return s;
    }
     public double Sub(){
         s = Num1-Num2;
        return s;
    }
      public double Mul(){
         s = Num1*Num2;
        return s;
    }
       public double Devide(){
         s = Num1/Num2;
        return s;
    }
    public void Display(){
        if(Num1==0||Num2==0){
            System.out.println("Both number should be greater then 0 to call any function correctly");
        }
        else{
            System.out.println("result is : " + s);
        }
    }   

    
}
