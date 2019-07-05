package TutorialInterfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Date implements Comparable<Date> {
    private int day;
    private int month;
    private int year;
    public ArrayList<Date> list = new ArrayList<>();

    //Constructor
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //Getters and setters
    public int getDay() {
        return day;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    //Add elements in the list
    public void add(Date date) {
        if (!list.contains(date)) {
            list.add(date);
        }
    }

    //Method the compare dates
    //Iterate between dates and sort them ascending order
    @Override
    public int compareTo(Date date) {

        if(date.getYear() == getYear()&&date.getMonth()==getMonth()&&date.getDay()==getDay()){
            return  0;
        }else if(date.getYear() > getYear()){
            return 1;
        }
        //if the years equal,check the months,
        // if they are equal too,check the date
        else if(date.getYear()==getYear()){
            if(date.getMonth()>getMonth()) {
                return 1;
            }
            if(date.getMonth()==getMonth()){
                if(date.getDay()>getDay()){
                    return 1;
                }
            }
        }

        return -1;
    }

    //Output for the Date
    @Override
    public String toString() {
        return " Date{" +
                "day=" + day +
                ", month=" + month +
                ", year= " + year +
                '}'+"\n";
    }
}
