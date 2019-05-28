import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("For subtraction press 1.\nFor sum press 2.\nFor division press 3.\nFor multiply press 4.\n");
        int choice=Integer.parseInt(scanner.nextLine());

       while(choice<1||choice>4)//If the value is incorrect
        {
            System.out.println("Enter e value between 1-4");
            choice=Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Enter the two numbers"); //Get the two numbers
        double firstNumber=Double.parseDouble(scanner.nextLine());
        double secondNumber=Double.parseDouble(scanner.nextLine());
        double result=0;

        switch (choice) { //Switch case for the possible cases
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

        if (secondNumber == 0 && choice == 3) { //If it is division by 0
            System.out.println("Impossible division");
        } else {
            System.out.printf("Result: %.2f", result);
        }

    }
}
