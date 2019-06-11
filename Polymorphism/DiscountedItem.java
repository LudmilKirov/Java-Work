package Polymorphism;

public class DiscountedItem extends Item {
    private int minNumberOfItems = 20;
    //For 20% discount
    private double discount=0.8;

    public double getDiscount() {
        return discount;
    }

    public DiscountedItem(String unitDescription, double costPerUnit, int numberOfItemsOnSale, int minNumberOfItems) {
        super(unitDescription, costPerUnit, numberOfItemsOnSale);
        this.minNumberOfItems = minNumberOfItems;
    }

    public int getMinNumberOfItems() {
        return minNumberOfItems;
    }

    public void setMinNumberOfItems(int minNumberOfItems) {
        this.minNumberOfItems = minNumberOfItems;
    }

    //If there is a discount returns true else false
    public boolean IsDiscount(){
        return minNumberOfItems<=getNumberOfItemsOnSale();
    }

    //If there is discount calculate the old cost and add
    // the discount if there is no discount print the old cold
    @Override
    public double calcCost(String unitDescription, double costPerUnit, int numberOfItemsOnSale) {
        if(IsDiscount()) {
            return super.calcCost(unitDescription, costPerUnit, numberOfItemsOnSale) * discount;
        }
        else{
            return super.calcCost(unitDescription,costPerUnit,numberOfItemsOnSale);
        }

    }

    @Override
    public String toString() {
        if(IsDiscount()){
       return String.format("There is discount of %.2f%%.",(1-discount)*100)+
        super.toString();
        }
        else {
            return String.format("Minimum amount is %d.",minNumberOfItems)+
             super.toString();
        }
    }
}
