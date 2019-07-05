package Polymorphism;

public class Account  {
    private String name;
    private double balance;
    //Constructor
    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    //Getters and setters
    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    private double getBalance() {
        return balance;
    }
    private void setBalance(double balance) {
        this.balance = balance;
    }
    //Output for the account
    @Override
    public String toString() {
        return  String.format("%s has a $%.2f",name,getBalance());
    }
}
