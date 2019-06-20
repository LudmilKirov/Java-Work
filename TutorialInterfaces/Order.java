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

    public void add(Order order) {
        if (!list.contains(order)) {
            list.add(order);
        }
    }
    public Order(int number, String description, double cost, Date date) {
        this.number = number;
        this.description = description;
        this.cost = cost;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Order " +
                "number=" + number +
                ", description='" + description + '\'' +
                ", cost=" + cost +
                date
                ;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

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
    private static  class ByCost implements Comparator<Order> {
        @Override
        public int compare(Order o1, Order o2) {
            double one = o1.getCost();
            double two = o2.getCost();
            int newOne=(int)Math.round(one);
            int newTwo=(int)Math.round(two);
            return newTwo - newOne;
        }
    }
}
