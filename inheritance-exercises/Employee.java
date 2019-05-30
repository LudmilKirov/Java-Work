package inheritance;

public class Employee extends Person {

    private int yearOfService;

    private int getYearOfService() {
        return yearOfService;
    }

    private void setYearOfService(int yearOfService) {
        this.yearOfService = yearOfService;
    }

    public Employee(String name, int age, long insuranceNumber, int yearOfService) {
        super(name, age, insuranceNumber);
        this.yearOfService = yearOfService;
    }


    public int getHoliday(int yearOfService) {
        int holiday = 15;
        //Until year of service five or above
        while (yearOfService >= 5) {

           holiday++;

            //To get round up value,eg for 7 years of service it is 1 additional
            // holiday day,but for 8 or 9 years of service there are 2 additional days.
            if (yearOfService==8||yearOfService==9) {
                holiday++;
            }

            yearOfService -= 5;
        }

        return holiday;
    }
    public String toString(){
        return super.toString()+" Holiday: " + getHoliday(yearOfService);
    }

}


