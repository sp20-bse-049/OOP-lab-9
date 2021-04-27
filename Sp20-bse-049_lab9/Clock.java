
package lab9;

public class Clock {
    protected int hr;
    protected int min;
    protected int sec;

    public Clock(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

    public void setHr(int hr) {
        this.hr = hr;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
    
    public void Display(){
        if(hr>24||min>60||sec>60){
            System.out.println("time is invalid");
        }
        else{
        System.out.println("time is "+hr+":"+min+":"+sec);
    }
    
}
}
class Child extends Clock{
    
    public Child(int hr, int min, int sec) {
        super(hr, min, sec);
    }
    public void Display(){
        super.Display();
         if(hr>24||min>60||sec>60){
            System.out.println("time is invalid");
        }
         else if(hr>=12){
            int h = 0;
            h = hr-12;
            System.out.println("time is "+h+":"+min+":"+sec+"PM");
            
        }
        else{
            System.out.println("time is "+hr+":"+min+":"+sec+"AM");
        }
        
    }
    
    
}
