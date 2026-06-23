

public class Main{
    public static void main(String[] args){
        Shape[] shapes={
            new Rectangle(10,5),
            new Circle(7),
            new Triangle(8,6)
        };
        AreaCalculate calculator =new AreaCalculate();
        double totalArea=calculator.calculateTotalArea(shapes);
        System.out.println("Total Area= "+totalArea);
    }
}



interface Shape{
    double calculateArea();
}

class Rectangle implements Shape{
    double length;
    double width;
    public Rectangle(double length, double width){
    this.length= length;
    this.width = width;
    }
@Override
public double calculateArea(){
    return length*width;
    }
} 

class Circle implements Shape{
    double radius;
    public Circle (double radius){
    this.radius = radius;
}
@Override
public double calculateArea(){
    return Math.PI*radius*radius;
    }
}

class Triangle implements Shape{
    double base;
    double height;
    public Triangle(double base, double height){
    this.base =base;
    this.height =height;
}
@Override 
public double calculateArea(){
    return 0.5*base*height;
    }
}

class AreaCalculate{
    public double calculateTotalArea(Shape[] shapes){
        double totalArea =0;
        for(Shape shape: shapes){
            totalArea +=shape.calculateArea();
        }
        return totalArea;
    }
    
}
