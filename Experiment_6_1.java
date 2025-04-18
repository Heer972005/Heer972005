abstract class Shape {
    abstract void area();
}
class Circle extends Shape {
    void area() {
        System.out.println("Area of Circle=3.14*r*r");
    }
}
class Rectangle extends Shape {
    void area() {
        System.out.println("Area of Rectangle=length*breadth");
    }
}
public class Experiment_6_1 {
    public static void main(String[] args) {
        Shape c=new Circle();
        Shape r=new Rectangle();
        c.area();  
        r.area(); 
    }
}
