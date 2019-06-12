package Polymorphism;

public abstract class Employee {
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

    @Override
    public String toString() {
        return "Employee" +
                " name = " + name +
                ", jobTitle = " + jobTitle+" ,"
                ;
    }
}
