
package inheritance;


public class Person {
    private  String name;
    private long insuranceNumber;
    private int age;
    //Constructor
    public Person(String name, int age, long insuranceNumber) {
        this.name = name;
        this.age = age;
        this.insuranceNumber = insuranceNumber;
    }
    //Getters and setters
    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    private int getAge() {
        return age;
    }
    private void setAge(int age) {
        this.age = age;
    }
    private long getInsuranceNumber() {
        return insuranceNumber;
    }
    private void setInsuranceNumber(long insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }

    //Output for the Person
    public String toString(){
            return "Name: "+name+ " " +" Age: "+ " " + age+ " Insurance Number:" +" "  +insuranceNumber;
}
}


