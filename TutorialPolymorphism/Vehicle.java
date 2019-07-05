package TutorialPolymorphism;

import java.util.ArrayList;

public abstract class Vehicle {
    private String registrationNumber;
    private double timeOfPayment;
    private boolean haveATrailer;
    private ArrayList<Vehicle> list=new ArrayList<>();

    //Constructor
    public Vehicle(String registrationNumber, double timeOfPayment, boolean haveATrailer) {
        this.registrationNumber = registrationNumber;
        this.timeOfPayment = timeOfPayment;
        this.haveATrailer = haveATrailer;
    }

    //Getters and setters
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }
    public double getTimeOfPayment() {
        return timeOfPayment;
    }
    public void setTimeOfPayment(double timeOfPayment) {
        this.timeOfPayment = timeOfPayment;
    }
    public boolean getHaveATrailer() {
        return haveATrailer;
    }
    public void setHaveATrailer(boolean haveATrailer) {
        this.haveATrailer = haveATrailer;
    }

    //Method for calculating the cost for Trailer
    //If have a trailer multiply by 1.5
    public double getTrailerCost() {
        double trailerCost = 1.5;
        return trailerCost;
    }

    public abstract  double calcCost();

    //Add a vehicle in the list if it is not already there
    public void add(Vehicle vehicle) {
        if (!list.contains(vehicle)) {
            list.add(vehicle);
        }
    }

    //Iterate through all of the vehicles
    // in the list and print the information for them
    public String allVehicle() {
        //Using string builder to get a string of whole company
        StringBuilder sb = new StringBuilder();
        for (Vehicle vehicle : list) {
            sb.append(vehicle.toString() + "\n");
        }
        return sb.toString();
    }

    //Go through whole vehicle's taxes to get
    // cost and sum them
    public double getTotalCost() {

        double totalCost = 0;
        for (Vehicle vehicle : list) {
            totalCost += vehicle.calcCost();
        }
        return totalCost;
    }

    //Print all HGV vehicles
    public void getHGVInfo() {
        //For each vehicle of HGV class prints it's info
        for (Vehicle vehicle : list) {
            if (vehicle instanceof HGV) {
                System.out.println(((HGV) vehicle).toString());
            }
        }
    }

    //Output for the Vehicle
    @Override
    public String toString() {
        return
                "Registration Number='" + registrationNumber + '\'' +
                ", time Of payment=" + timeOfPayment +
                ", have A Trailer ? =" + haveATrailer +" Cost is "+calcCost();
    }
}
