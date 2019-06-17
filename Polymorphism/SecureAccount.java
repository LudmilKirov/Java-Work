package Polymorphism;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class SecureAccount extends Account implements PINProtected{
    private String PIN="3A11";

    public SecureAccount(String name, double balance) {
        super(name, balance);

    }
    //Get the balance only if the pin match
    @Override
    public double getBalance() {
       if(checkPIN()) {
           return super.getBalance();
       }
       return -1;
    }

    @Override
    public void setBalance(double balance) {
        if(checkPIN()) {
            super.setBalance(balance);
        }
    }
    //Check if the PIN enter by the user is the same given by default
    @Override
    public boolean checkPIN() {
        System.out.println("Please enter you PIN:");
        Scanner scanner=new Scanner(System.in);
        String checkPin=scanner.nextLine();
        return (checkPin.equals(PIN));

    }

    @Override
    public String toString() {
        return super.toString();
    }

//    @Override
//    public String toString() {
//        return  String.format("%s has a $%.2f",getName(),getBalance());
//    }
}
