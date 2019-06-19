package TutorialPolymorphism;

public class Main {
    public static void main(String[] args) {
        Vehicle motor=new Motorcycles("SA1245AA",14.45,false);
        Vehicle car=new Car("A1111AA",13.13,false);
        Vehicle bus=new Coaches("M44444AM",14.11,false,25);
        Vehicle hgv=new HGV("V2255SS",13.01,true,5);
        Vehicle hgv1=new HGV("V2211SV",14.55,false,1);
        System.out.println(motor);
        System.out.println(car);
        System.out.println(bus);
        System.out.println(hgv);

        motor.add(motor);
        motor.add(car);
        motor.add(bus);
        motor.add(hgv);
        motor.add(hgv1);
        System.out.println(motor.allVehicle());
        System.out.println("Total income is : "+motor.getTotalCost());
        motor.getHGVInfo();
    }
}
