import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        System.out.printf("Enter your message");
        String message=scanner.nextLine();

        System.out.printf("Enter the number of rotates");
        int rotate=Integer.parseInt(scanner.nextLine());

        if(rotate>25){
            rotate-=26;
        }

        System.out.printf("Before encryption: %s\n",message);
        System.out.printf("After encryption: %s \n",encryption(message,rotate));
        message=encryption(message,rotate);
        System.out.printf("After decryption: %s",decryption(message,rotate));


    }



    private static String  encryption(String message,int rotate) {

        char[] newMessage=message.toCharArray();

        for (int i = 0; i <message.length() ; i++) {

            //Check if it is lower case
            if(newMessage[i]>='a'&& newMessage[i]<='z') {

                /*Subtract 26 so we can start from a*/
                if (newMessage[i] + rotate > 122) {
                    newMessage[i] = (char) (newMessage[i] + rotate - 26);
                }

                /*If it is from a-z just add the key value*/
                else {
                    newMessage[i] = (char) (newMessage[i] + rotate);
                }
            }
            //If it is a Capital letter
            else{

                //Check if the rotate plus ASCII value of the letter is above the last letter Z
                if(newMessage[i]+rotate>90)
                {
                    //Subtract 26 so we can start from A
                    newMessage[i]=(char)(newMessage[i]+rotate-26);
                }
                else{
                    //If it is from A-Z just add the rotate value
                    newMessage[i]=(char)(newMessage[i]+rotate);
                }
            }

        }
        return message.copyValueOf(newMessage);
    }

    //Same as the encryption method
    private static String decryption(String message,int rotate) {
        char[] newMessage=message.toCharArray();

        for (int i = 0; i <message.length() ; i++) {

            //Check if it is lower case
            if(newMessage[i]>='a'&& newMessage[i]<='z') {

                //Check if the key plus ASCII value of the letter is bellow the first letter a
                if (newMessage[i] - rotate < 97) {
                    newMessage[i] = (char) (newMessage[i] - rotate + 26);
                }

                /*If it is from a-z just subtract the rotate value*/
                else {
                    newMessage[i] = (char) (newMessage[i] - rotate);
                }
            }
            //If it is a Capital letter
            else{

                //Check if the rotate plus ASCII value of the letter is bellow the first letter A
                if(newMessage[i] - rotate < 65)
                {
                    //Add 26 so we can start from A
                    newMessage[i]=(char)(newMessage[i] - rotate + 26);
                }
                else{
                    //If it is from A-Z just subtract the rotate value
                    newMessage[i]=(char)(newMessage[i] - rotate);
                }
            }

        }

        return message.copyValueOf(newMessage);
    }
}
