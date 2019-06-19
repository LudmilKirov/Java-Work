package TutorialPolymorphism;

public class Motorcycles extends Vehicle{
    public Motorcycles(String registrationNumber, double timeOfPayment, boolean haveATrailer) {
        super(registrationNumber, timeOfPayment, haveATrailer);
    }

    @Override
    public double calcCost() {
        if(getHaveATrailer()) {
            return 1.0*super.getTrailerCost();
        }
        return 1.0;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
