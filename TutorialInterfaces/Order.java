package TutorialInterfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Order implements Comparable<Order> {
    private int number;
    private String description;
    private double cost;
    private Date date;
    public static final Comparator<Order> BY_COST = new ByCost();

    public ArrayList<Order> list = new ArrayList<>();

    //Constructor
    public Order(int number, String description, double cost, Date date) {
        this.number = number;
        this.description = description;
        this.cost = cost;
        this.date = date;
    }

    //Getters and setters
    private int getNumber() {
        return number;
    }
    private void setNumber(int number) {
        this.number = number;
    }
    private String getDescription() {
        return description;
    }
    private void setDescription(String description) {
        this.description = description;
    }
    private double getCost() {
        return cost;
    }
    private void setCost(double cost) {
        this.cost = cost;
    }
    private Date getDate() {
        return date;
    }
    private void setDate(Date date) {
        this.date = date;
    }

    //Method that add orders
    public void add(Order order) {
        if (!list.contains(order)) {
            list.add(order);
        }
    }

    //Compare orders
    @Override
    public int compareTo(Order o) {
        if(o.getNumber() == getNumber()){
            return  0;
        }else if(o.getNumber() > getNumber()){
            return 1;
        }
        return -1;
    }

    //Check the the cost of the two objects and compare them
    //Because its double and if the two and one are equal in
    // integer and one is bigger in double increase the int value of one
    private static  class ByCost implements Comparator<Order> {
        @Override
        public int compare(Order o1, Order o2) {
            double one = o1.getCost();
            double two = o2.getCost();
            int newOne=(int)Math.round(one);
            int newTwo=(int)Math.round(two);
            if(two<one&&newOne==newTwo){
            newOne++;}

            return newTwo - newOne;
        }
    }

    //Output for the orders
    @Override
    public String toString() {
        return "Order " +
                "number=" + number +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                date
                ;
    }
}
