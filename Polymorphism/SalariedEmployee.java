package Polymorphism;

public class SalariedEmployee extends Employee {
    public double annualSalary;

    public SalariedEmployee(String name,String jobTitle,double annualSalary) {
        super.setName(name);
        super.setJobTitle(jobTitle);
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }
    //Divide the annual salary by 12 to get the monthly wage
    @Override
    public double getMonthlyWage() {
        return annualSalary/12;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("Monthly salary %.2f\n",getMonthlyWage());
    }


}
