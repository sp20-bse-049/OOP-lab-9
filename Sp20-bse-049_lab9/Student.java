
package lab9;

abstract class Student {
    abstract void Takeexams();
    
}
class PHDStudents extends Student{
    public void Takeexams(){
        System.out.println("PhD students take exams by giving his final defense presentation");
        
    }
}
class GradStudent extends Student{
     public void Takeexams(){
        System.out.println("Graduate students gives a written paper");
        
    }
    
}
