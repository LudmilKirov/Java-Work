package TutorialPolymorphism;

public class Car extends Vehicle{
    //Constructor
    public Car(String registrationNumber, double timeOfPayment, boolean haveATrailer) {
        super(registrationNumber, timeOfPayment, haveATrailer);
    }
    //Method that calculate the cost of the Car
    @Override
    public double calcCost() {
        if(getHaveATrailer()) {
            return 2.5*super.getTrailerCost();
        }
        return 2.5;
    }
    //Output for the car
    @Override
    public String toString() {
        return super.toString();
    }
}
