package Polymorphism;

public class ContractBonusEmployee extends ContractEmployee{
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public ContractBonusEmployee(String name, String jobTitle, double hourlyRate, double hoursWorked, double bonus) {
        super(name, jobTitle, hourlyRate, hoursWorked);
        this.bonus = bonus;
    }

    @Override
    public double getMonthlyWage() {
        return super.getMonthlyWage()+bonus;
    }

    @Override
    public String toString() {
        return super.toString()+String.format("  %s has a bonus of : %.2f\n",getName(),bonus);
    }
}
