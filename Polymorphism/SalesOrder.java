package Polymorphism;

import java.util.LinkedHashMap;
import java.util.SortedMap;

public  class SalesOrder {

    public double totalCost;
    private int maxOrder=0;
    public LinkedHashMap<Integer,Item> orders = new LinkedHashMap<>();

    public int getMaxOrder() {
        return maxOrder;
    }

    public void setMaxOrder(int maxOrder) {
        this.maxOrder = maxOrder;
    }



    public SalesOrder() {

    }

    public void add(Item next){
        orders.put(maxOrder,next);
        maxOrder++;

    }

 public String[] getDetails(){
     return new String[]{
             orders.toString()
     };
    }


    //Using for each to iterate through the map and
    // very Items cost calculate the sum of the every Item
    public double calcTotalCost() {

        orders.forEach((key, value) -> {
            double cost = value.calcCost(value.getUnitDescription(), value.getCostPerUnit(), value.getNumberOfItemsOnSale());
            totalCost+=cost;
        });

       return totalCost;
    }

    //Find in every item if there is VAT in them if yes print it
    public void displayVATItems(){
        orders.forEach((key,value)->{
            if(value.toString().contains("VAT")){
                System.out.println(value);
            }
        });
    }
}