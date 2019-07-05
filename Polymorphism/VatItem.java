package Polymorphism;

public class VatItem extends Item {
    //For 20% VAT in Bulgaria
    private double VAT=0.8;

    //Constructor
    public VatItem(String unitDescription, double costPerUnit, int numberOfItemsOnSale) {
        super(unitDescription, costPerUnit, numberOfItemsOnSale);
    }
    //Getter
    public double getVAT() {
        return VAT;
    }
    //Calculate the cost by multiplying the VAT with the old price
    @Override
    public double calcCost(String unitDescription, double costPerUnit, int numberOfItemsOnSale) {
        return super.calcCost(unitDescription, costPerUnit, numberOfItemsOnSale)*VAT;
    }
    //Print the price with without VAT
    @Override
    public String toString() {
        return "Without VAT "+super.toString()+String.format("\nWith VAT -> %.2f",calcCost(getUnitDescription()
                ,getCostPerUnit(),getNumberOfItemsOnSale())*1.25);
    }


}
