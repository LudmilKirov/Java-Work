package TutorialPolymorphism;

public class Motorcycles extends Vehicle{
    //Constructor
    public Motorcycles(String registrationNumber, double timeOfPayment, boolean haveATrailer) {
        super(registrationNumber, timeOfPayment, haveATrailer);
    }

    //Method for calculating the cost for motorcycle
    @Override
    public double calcCost() {
        if(getHaveATrailer()) {
            return 1.0*super.getTrailerCost();
        }
        return 1.0;
    }

    //Output for motorcycle
    @Override
    public String toString() {
        return super.toString();
    }
}
