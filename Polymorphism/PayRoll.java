package Polymorphism;

import java.io.*;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class PayRoll {
    public List<Employee> list = new ArrayList<>();

    public void add(Employee employee) {
        if (!list.contains(employee)) {
            list.add(employee);
        }
    }

    public void compareTo() {
    }

    //The wages are sorted by descending order,to be sort
    // in ascending just remove the .reversed()
    public void sortByWages() {
        //   list.sort(Comparator.comparing(Employee::getMonthlyWage).reversed());
    }

    public void setContractHours(String name, int hours) {
        //Go through every employee and the given name is in ContractedEmployee
        // set the hours it worked
        for (Employee employee : list) {
            if (employee.matchName(name) && employee instanceof ContractEmployee) {
                ((ContractEmployee) employee).setHoursWorked(hours);
            }
        }

    }

    public void resetContractHours() {
        //For each employee of ConractEmployee class set it hours worked to 0
        for (Employee employee : list) {
            if (employee instanceof ContractEmployee) {
                ((ContractEmployee) employee).setHoursWorked(0);
            }
        }
    }

    public double getCompanyMonthlyWage() {
        //Go through whole company's employees to get
        // for each of them their salary and sum them
        double totalSalary = 0;
        for (Employee employee : list) {
            totalSalary += employee.getMonthlyWage();
        }
        return totalSalary;
    }

    public String getCompanyDetails() {
        //Using string builder to get a string of whole company
        StringBuilder sb = new StringBuilder();

        for (Employee employee : list) {
            sb.append(employee.toString() + "  ");
        }
        return sb.toString();
    }

    //Load a file,split it by rows,if the rows starts with 1
    // it means that the object is Salaried  Employee and the split
    // it by "," and set the name title and salary
    //if it starts with 2 it means that is Contract Employee set the name ,
    // job title hourly rate and hours worked
    //If it starts with 3 it means that is Bonus Contract Employee et the name ,
    // job title hourly rate and hours worked and the bonus.
    public void loadData() {

        try (BufferedReader in = new BufferedReader(new FileReader
                ("C:\\Users\\User\\IdeaProjects\\Sheets\\src\\Polymorphism\\employeeData.txt"))) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] pair = line.split(",");
                if (pair[0].equals("1")) {
                    Employee e = new SalariedEmployee(pair[1], pair[2], Double.parseDouble(pair[3]));
                    add(e);
                } else if (pair[0].equals("2")) {
                    Employee e1 = new ContractEmployee(pair[1], pair[2], Double.parseDouble(pair[3]), Double.parseDouble(pair[4]));
                    add(e1);
                } else {
                    Employee e2 = new ContractBonusEmployee(pair[1], pair[2], Double.parseDouble(pair[3]), Double.parseDouble(pair[4]), Double.parseDouble(pair[5]));
                    add(e2);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //Save the list into a txt file.
    public void saveData() throws IOException {
        //Set the file name
        File empltxt = new File("Employee.txt");
        FileOutputStream fos = new FileOutputStream(empltxt);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            bw.write(String.valueOf(list));
            bw.close();
    }

    @Override
    public String toString() {
        return "PayRoll{" +
                "list=" + list +
                '}';
    }
}

