package TutorialInterfaces;

import inheritance.Employee;

import java.util.Collections;
import java.util.Comparator;
//Make a program that add dates and orders and
// prints the orders by the date in ascending order

/*Pros and cons about Comparable and Comparator

*  Comparable - it is used only for one object
* ,comes intuitive for natural sorting order
*
*  Comparator - it can be used for two objects
* ,comes intuitive for customized sorting order*/

public class Main {
    public static void main(String[] args) {
        //Adding the date and the orders
        Date date=new Date(22,4,1992);
        Date date1=new Date(3,4,1992);
        Date date2=new Date(1,4,1992);

        Order order = new Order(22,"Sss",3.3,date);
        Order order1 = new Order(1,"OSses",2.4,date1);
        Order order2=new Order(3,"BOs",3.4,date2);


        date.add(date1);
        date.add(date2);
        date.add(date);

        date.list.sort(Date::compareTo);
        System.out.println(date.list);
        System.out.println();
        order.add(order);
        order.add(order1);
        order.add(order2);

        order.list.sort(Order::compareTo);
        System.out.println(order.list);

        order.list.sort(Order.BY_COST);
        System.out.println(order.list);

    }
}
