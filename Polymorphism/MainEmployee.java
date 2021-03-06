package Polymorphism;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class MainEmployee {
    public static void main(String[] args) throws IOException {

        Employee pesho = new SalariedEmployee("Pesho", "Bog", 12002);
        Employee gosho = new ContractEmployee("Gosho", "Prezident", 99.99, 160);
        Employee ivan = new ContractEmployee("Ivan", "Vice", 49.99, 160);
        Employee blago = new ContractBonusEmployee("Blago","Rob",2,200,1.5);

        PayRoll pay = new PayRoll();

        pay.add(ivan);
        pay.add(gosho);
        pay.add(pesho);
        pay.add(blago);


        pay.setContractHours("Gosho", 1);
        System.out.println(String.format("Total sum: %.2f", pay.getCompanyMonthlyWage()));
        System.out.println(pay.getCompanyDetails());

        pay.resetContractHours();
        System.out.println(pay.getCompanyDetails());
        //pay.sortByWages();

        Collections.sort(pay.list, new test());
        System.out.println(pay.list);

        pay.loadData();
        System.out.println(pay.list);
        pay.saveData();

        Account account=new Account("Pesho",222.95);
        Account secure=new SecureAccount("Pro",22);

        System.out.println(account);
        System.out.println(secure);
    }

}
