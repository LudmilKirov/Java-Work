package Polymorphism;

import java.text.DecimalFormat;

public  class Item{
   private String unitDescription;
   private double costPerUnit;
   private int numberOfItemsOnSale;
    //Constructor
    public Item(String unitDescription, double costPerUnit, int numberOfItemsOnSale) {
        this.unitDescription = unitDescription;
        this.costPerUnit = costPerUnit;
        this.numberOfItemsOnSale = numberOfItemsOnSale;
    }
    //Getters and setters
    private String getUnitDescription() {
        return unitDescription;
    }
    private void setUnitDescription(String unitDescription) {
        this.unitDescription = unitDescription;
    }
    private double getCostPerUnit() {
        return costPerUnit;
    }
    private void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }
    private int getNumberOfItemsOnSale() {
        return numberOfItemsOnSale;
    }
    private void setNumberOfItemsOnSale(int numberOfItemsOnSale) {
        this.numberOfItemsOnSale = numberOfItemsOnSale;
    }

    //Calculate the cost of the items on sale and the cost per unit
    public double calcCost(String unitDescription,double costPerUnit,int numberOfItemsOnSale){
        double cost=numberOfItemsOnSale*costPerUnit;
        return cost;
    }

    //Prints the item and the cost formatted by 2
    @Override
    public String toString() {
        return String.format("Total : %s cost -> %.2f",getUnitDescription(),calcCost(unitDescription,costPerUnit,numberOfItemsOnSale));
    }


}
