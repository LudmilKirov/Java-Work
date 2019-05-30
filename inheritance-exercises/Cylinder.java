package inheritance;

import static java.lang.Math.PI;

public class Cylinder extends Circle{
    double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public Cylinder(double xCordinate, double yCordinate, double radius, double height) {
        super(xCordinate, yCordinate, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cylender" + super.toString()+" height:"+height;
    }
    //TODO implement a logic for the area and the volume


    @Override
    //Overriding the calculate area of circle
    public double calculateArea() {
        return super.calculateArea()*2 +2*PI*radius*height;
    }

    public double calculateVolume (){
        double volume=PI*radius*radius*height;
        return volume;
    }
}
