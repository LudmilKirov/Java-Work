package TutorialPolymorphism;

public class HGV extends Vehicle{
    private int tonnes;

    public HGV(String registrationNumber, double timeOfPayment, boolean haveATrailer, int tonnes) {
        super(registrationNumber, timeOfPayment, haveATrailer);
        this.tonnes = tonnes;
    }
//Costs 10 for up to 3 tonnes,15 otherwise
    @Override
    public double calcCost() {
        if(tonnes>3&&getHaveATrailer()) {
            return 15*super.getTrailerCost();
        }
        else if(getHaveATrailer()) {
            return 10*super.getTrailerCost();
        }
        else if(tonnes>3){
            return 15;
        }
        return 10;
    }

    @Override
    public String toString() {
        return super.toString()+" Tonnes are - "+tonnes;
    }
}
