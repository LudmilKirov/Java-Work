package inheritance;

public class Manager extends Employee{

    public Manager(String name, int age, long insuranceNumber, int yearOfService) {
        super(name, age, insuranceNumber, yearOfService);
    }


    @Override
    //Multiply by 2 and subtract 15 to get the holiday addition days increased by 1
    public int getHoliday(int yearOfService) {
        return super.getHoliday(yearOfService)*2-15;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

