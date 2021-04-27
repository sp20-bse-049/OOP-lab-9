
package lab9;

abstract class Shape {
    protected int lines;
    protected String pencolor;
    protected String fillcolor;

    public Shape(int lines, String pencolor, String fillcolor) {
        this.lines = lines;
        this.pencolor = pencolor;
        this.fillcolor = fillcolor;
    }
    
    abstract void draw();   
}
class Circle extends Shape{

    public Circle(int lines, String pencolor, String fillcolor) {
        super(lines, pencolor, fillcolor);
    }
    
   
     void draw(){
        System.out.println("There are "+ lines +" line in the circle  with "+pencolor+" pen color and "+fillcolor+" fillcolor");
    }
    
}
class Triangle extends Shape{

    public Triangle(int lines, String pencolor, String fillcolor) {
        super(lines, pencolor, fillcolor);
    }
    
     void draw(){
        System.out.println("There are " +lines + " line in the Triangle with "+ pencolor  + " pencolor and "+  fillcolor +" fillcolor");
    }
     
    
}
class Square extends Shape{

    public Square(int lines, String pencolor, String fillcolor) {
        super(lines, pencolor, fillcolor);
    }
    
     void draw(){
        System.out.println("there are "+lines +" line in the square with"+ pencolor+ " pencolor and "+ fillcolor+ "  fillcolor");
    } 
    
}
