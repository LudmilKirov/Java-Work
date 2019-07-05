package Polymorphism;
import java.io.Serializable;
public class ContractBonusEmployee extends ContractEmployee{
    private double bonus;
    //Constructor
    public ContractBonusEmployee(String name, String jobTitle, double hourlyRate, double hoursWorked, double bonus) {
        super(name, jobTitle, hourlyRate, hoursWorked);
        this.bonus = bonus;
    }
    //Getters and setters
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    //Add the bonus
    @Override
    public double getMonthlyWage() {
        return super.getMonthlyWage()+bonus;
    }
    //Output for contract employee with bonus
    @Override
    public String toString() {
        return super.toString()+String.format("  %s has a bonus of : %.2f\n",getName(),bonus);
    }
}
