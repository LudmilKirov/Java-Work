package Polymorphism;
//Make a program that add different type
// of items and add them to order and
// print the sum and the concrete type of item
import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Add tthe items
        Item baklava=new DiscountedItem("Baklava",2.2,22,4);
        Item pica=new Item("Pizza",5.2,22);
        Item caca=new VatItem("Caca",3.4,22);

        System.out.println(baklava);
        System.out.println(pica);
        System.out.println(caca);

        SalesOrder order=new SalesOrder();

        order.add(baklava);
        order.add(pica);
        order.add(caca);

        System.out.println(Arrays.toString(order.getDetails()));
        System.out.println("Total sum -> "+order.calcTotalCost());
        order.displayVATItems();


    }
}
