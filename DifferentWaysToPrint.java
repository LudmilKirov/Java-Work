import java.util.Scanner;
/*Different ways to print on the console*/
public class DifferentWaysToPrint {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        String test="print that";
        System.out.println(test);
        System.out.printf("%s\n",test);
        System.out.print(test);

    }
}
