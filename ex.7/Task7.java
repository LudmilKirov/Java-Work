import java.util.Scanner;
//Make a application which calculate if the year is leap or not.
//And if it is bellow 1582 give a error.
public class Task7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int year=Integer.parseInt(scanner.nextLine());
        boolean flag=false;

//Check if the year is below 1582
    if (year < 1582) {

        System.out.printf("Year must be after 1582\n");
        flag=true;
    }

//If the year is after 1582
    if(flag==false) {
            //Check if the year is leap
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {

                System.out.printf("The year %d is leap\n", year);
            }

            else {
                System.out.printf("The year %d is not leap\n", year);
            }
        }

    }
}

