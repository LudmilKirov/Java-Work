package inheritance;

import static java.lang.Math.PI;

public class Cylinder extends Circle{
    double height;
    //First Constructor
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }
    //Second Constructor
    public Cylinder(double xCordinate, double yCordinate, double radius, double height) {
        super(xCordinate, yCordinate, radius);
        this.height = height;
    }
    //Getters and setters
    private double getHeight() {
        return height;
    }
    private void setHeight(double height) {
        this.height = height;
    }

    @Override
    //Overriding the calculate area of circle
    public double calculateArea() {
        return super.calculateArea()*2 +2*PI*radius*height;
    }
    //Method that calculate the volume
    public double calculateVolume (){
        double volume=PI*radius*radius*height;
        return volume;
    }
    //Output for the cylender
    @Override
    public String toString() {
        return "Cylender" + super.toString()+" height:"+height;
    }
    //TODO implement a logic for the area and the volume


}
