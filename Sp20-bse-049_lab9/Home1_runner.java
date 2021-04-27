
package lab9;

import java.util.Scanner;
public class Home1_runner {
     public static void main(String[]args){
        int d;
        Scanner iput = new Scanner(System.in);
        System.out.println("enter days");
        d = iput.nextInt();
        
        Action a = new Action(3,"Avengers");
        Action b = new Action(2,"Triple Frontier");
        Comedy c = new Comedy(2,"Golmal");
        Comedy w = new Comedy(3,"carry on jatta");
        w.Calcfee(d);
        w.Display();
        w.equals(c);
        
        
}
    
}
