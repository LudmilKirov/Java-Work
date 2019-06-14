package Polymorphism;

public class ContractEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public ContractEmployee(String name, String jobTitle, double hourlyRate, double hoursWorked) {
        super.setName(name);
        super.setJobTitle(jobTitle);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //To get the monthly salary multiply the
    // hours pay rate and the hours worked in the current month
    @Override
    public double getMonthlyWage() {
        return hourlyRate * hoursWorked;
    }


    @Override
    public String toString() {
        return super.toString() + String.format("Monthly salary %.2f\n", getMonthlyWage());
    }

//    @Override
//    public String Speak() {
//        return " ss";
//    }
}

