package inheritance;

import static java.lang.Math.PI;

public class Circle extends Point {
    double radius;
    //First constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    //Second constructor
    public Circle(double xCordinate, double yCordinate, double radius) {
        super(xCordinate, yCordinate);
        this.radius = radius;
    }
    //Getters and setters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
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
    //Output for the circle
    @Override
    public String toString() {
        return "Circle: " + super.toString()+" radius=" + radius ;
    }
}
