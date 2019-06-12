package Polymorphism;

import java.util.ArrayList;

public class PayRoll {
    public ArrayList<Employee> list=new ArrayList<>();

    public void add(Employee employee){
        if(!list.contains(employee)){
            list.add(employee);
        }
    }

    public void setContractHours(String name,int hours) {
            //Go through every employee and the given name is in ContractedEmployee
            // set the hours it worked
            for (Employee employee : list) {
                if(employee.matchName(name)&&employee instanceof ContractEmployee){
                    ((ContractEmployee) employee).setHoursWorked(hours);
                }
            }

        }
        public  void resetContractHours(){
            //For each employee of ConractEmployee class set it hours worked to 0
            for (Employee employee : list) {
                if(employee instanceof ContractEmployee) {
                    ((ContractEmployee)employee).setHoursWorked(0);
                }
            }
        }
        
        public double getCompanyMonthlyWage(){
            //Go through whole company's employees to get
            // for each of them their salary and sum them
        double totalSalary=0;
            for (Employee employee : list) {
                totalSalary+=employee.getMonthlyWage();
            }
            return totalSalary;
        }
        
        public String getCompanyDetails(){
            //Using string builder to get a string of whole company
            StringBuilder sb=new StringBuilder();

            for (Employee employee : list) {
                sb.append(employee.toString()+"  ");
            }
            return sb.toString();
        }



    @Override
    public String toString() {
        return "PayRoll{" +
                "list=" + list +
                '}';
    }
}
