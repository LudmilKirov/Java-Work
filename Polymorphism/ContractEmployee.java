package Polymorphism;
import java.io.Serializable;

public class ContractEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;
    //Constructor
    public ContractEmployee(String name, String jobTitle, double hourlyRate, double hoursWorked) {
        super.setName(name);
        super.setJobTitle(jobTitle);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    //Getters and setters
    private double getHourlyRate() {
        return hourlyRate;
    }
    private void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    private double getHoursWorked() {
        return hoursWorked;
    }
    private void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //To get the monthly salary multiply the
    // hours pay rate and the hours worked in the current month
    @Override
    public double getMonthlyWage() {
        return hourlyRate * hoursWorked;
    }
    //Give the Contract employee proper output
    @Override
    public String toString() {
        return super.toString() + String.format("Monthly salary %.2f\n", getMonthlyWage());
    }

}

