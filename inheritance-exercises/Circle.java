package inheritance;

import static java.lang.Math.PI;

public class Circle extends Point {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double xCordinate, double yCordinate, double radius) {
        super(xCordinate, yCordinate);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle: " + super.toString()+" radius=" + radius ;
    }
    //Function that calculate area of circle
    public double calculateArea (){
        double area=PI*radius*radius;
        return area;
    }
    //Function that calculate circumference of circle
    public double calculateCircumference(){
        double circumference = PI*2*radius;
        return circumference;
    }
}
