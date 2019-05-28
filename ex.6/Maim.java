import java.util.Scanner;

public class Maim {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

//        double lenght=Double.parseDouble(scanner.nextLine());
//        double height=Double.parseDouble(scanner.nextLine());
//        double width=Double.parseDouble(scanner.nextLine());

        Box box=new Box(1,2,5);
        Box box1=new Box(2,2,2);
        box.setHeight(2);
        box.setWidth(1);
        box1.setWidth(0);
        box.setLength(1000);
        System.out.println(box);
        System.out.println(box1);
    }
}
