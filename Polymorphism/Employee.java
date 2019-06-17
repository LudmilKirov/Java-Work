package Polymorphism;
import java.io.*;



public abstract class Employee implements Serializable/* implements java.lang.Comparable<Employee> */{
    private String name;
    private String jobTitle;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public boolean matchName(String name){
        return getName()==name;
    }
    public double getMonthlyWage(){
        return 0;
    }


  /*  @Override
    public int compareTo(Employee o) {
        if(o.getMonthlyWage() == getMonthlyWage()){
            return  0;
        }else if(o.getMonthlyWage() > getMonthlyWage()){
            return 1;
        }
        return -1;
    }*/

    @Override
    public String toString() {
        return "Employee" +
                " name = " + name +
                ", jobTitle = " + jobTitle+" ,"
                ;
    }

//    public void S_Wrong_Principle(Employee e){
//        if(e instanceof ContractEmployee){
//            System.out.println();
//        }
//        else{
//            System.err.printf("");
//        }
//    }
//
//
//    public abstract String Speak();


}
