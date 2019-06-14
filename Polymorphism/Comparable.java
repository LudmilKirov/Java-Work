package Polymorphism;

import java.util.Comparator;

class test implements Comparator<Employee> {


    //This is used when we have random objects that
    // can be from different class,etc.To change the order
    // rearrange one minus two and two minus one
    @Override
    public int compare(Employee o1, Employee o2) {
        int one = (int) o1.getMonthlyWage();
        int two = (int) o2.getMonthlyWage();
        return  two - one;
    }
}
