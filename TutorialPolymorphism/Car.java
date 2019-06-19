package TutorialPolymorphism;

public class Car extends Vehicle{
    public Car(String registrationNumber, double timeOfPayment, boolean haveATrailer) {
        super(registrationNumber, timeOfPayment, haveATrailer);
    }

    @Override
    public double calcCost() {
        if(getHaveATrailer()) {
            return 2.5*super.getTrailerCost();
        }
        return 2.5;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
