package Polymorphism;

import java.text.DecimalFormat;

public class Item {
   private String unitDescription;
   private double costPerUnit;
   private int numberOfItemsOnSale;

    public Item(String unitDescription, double costPerUnit, int numberOfItemsOnSale) {
        this.unitDescription = unitDescription;
        this.costPerUnit = costPerUnit;
        this.numberOfItemsOnSale = numberOfItemsOnSale;
    }

    public String getUnitDescription() {
        return unitDescription;
    }

    public void setUnitDescription(String unitDescription) {
        this.unitDescription = unitDescription;
    }

    public double getCostPerUnit() {
        return costPerUnit;
    }

    public void setCostPerUnit(double costPerUnit) {
        this.costPerUnit = costPerUnit;
    }

    public int getNumberOfItemsOnSale() {
        return numberOfItemsOnSale;
    }

    public void setNumberOfItemsOnSale(int numberOfItemsOnSale) {
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
