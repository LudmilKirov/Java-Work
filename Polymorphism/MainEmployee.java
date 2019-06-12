package Polymorphism;

public class MainEmployee {
    public static void main(String[] args) {

        Employee pesho=new SalariedEmployee("Pesho","Bog",12002);
        Employee gosho=new ContractEmployee("Gosho","Prezident",99.99,160);
        Employee ivan=new ContractEmployee("Ivan","Vice",49.99,160);

        PayRoll pay=new PayRoll();

        pay.add(pesho);
        pay.add(gosho);
        pay.add(ivan);

        pay.setContractHours("Gosho",55);
        System.out.println(String.format("Total sum: %.2f",pay.getCompanyMonthlyWage()));

        System.out.println(pay.getCompanyDetails());

        pay.resetContractHours();
        System.out.println(pay.getCompanyDetails());
    }

}
