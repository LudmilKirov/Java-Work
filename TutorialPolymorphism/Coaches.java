package TutorialPolymorphism;

import Polymorphism.PayRoll;

public class Coaches extends Vehicle{
    private int passengersNumber;

    public Coaches(String registrationNumber, double timeOfPayment, boolean haveATrailer, int passengersNumber) {
        super(registrationNumber, timeOfPayment, haveATrailer);
        this.passengersNumber = passengersNumber;
    }

    public int getPassengersNumber() {
        return passengersNumber;
    }

    public void setPassengersNumber(int passengersNumber) {
        this.passengersNumber = passengersNumber;
    }


//Costs 5 up to 20 passengers,10 for above
    @Override
    public double calcCost() {
        if(passengersNumber>20&&getHaveATrailer()) {
            return 10*super.getTrailerCost();
        }
        else if(getHaveATrailer()) {
            return 5*super.getTrailerCost();
        }
        else if(passengersNumber>20){
            return 10;
        }
        return 5;
    }

    @Override
    public String toString() {
        return super.toString()+" Passenger number is - "+passengersNumber;
    }

}
