import java.util.Scanner;
//Make a program that is like calculator.
// Give the user a option for sum,substract,divide and multiply.
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        //Give the user the options
        System.out.println(
                "For subtraction press 1." +
                "\nFor sum press 2." +
                "\nFor division press 3." +
                "\nFor multiply press 4.\n");
        int choice=Integer.parseInt(scanner.nextLine());
        //If the value is incorrect
       while(choice<1||choice>4)
        {
            System.out.println("Enter e value between 1-4");
            choice=Integer.parseInt(scanner.nextLine());
        }
        //Get the two numbers
        System.out.println("Enter the two numbers");
        double firstNumber=Double.parseDouble(scanner.nextLine());
        double secondNumber=Double.parseDouble(scanner.nextLine());
        double result=0;
        //Switch case for the possible cases
        switch (choice) {
            case 1:
                result = firstNumber - secondNumber;
                break;
            case 2:
                result = firstNumber + secondNumber;
                break;
            case 3:
                result = firstNumber / secondNumber;
                break;
            case 4:
                result = firstNumber * secondNumber;
                break;
            default:
                break;
        }
        //If it is division by 0
        if (secondNumber == 0 && choice == 3) {
            System.out.println("Impossible division");
        } else {
            System.out.printf("Result: %.2f", result);
        }

    }
}
