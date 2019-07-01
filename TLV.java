import java.util.Scanner;

public class TLV {

    private static int length;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String tlv = scanner.nextLine();
        String tlvWithoutSpaces = tlv.replace(" ", "");
        recursive(tlvWithoutSpaces);

    }

    //Recursive function for BER-TLV Parser
    private static void recursive(String tlvWithoutSpaces) {
        final int FIRST_BYTE = 0;
        String newString = tlvWithoutSpaces;
        length = tlvWithoutSpaces.length() / 2;

        //This is the base case when the length is equal or below zero return;
        if (length <= 0) {
            return;
        }

        //Make input to byte array
        byte[] tlvByteArray = hexStringToByteArray(tlvWithoutSpaces);
        //Get the first 3 bits and the last 5 in the byte array
        byte first3BitsOfTheFirstByte = (byte) (tlvByteArray[FIRST_BYTE] & 0x20);
        byte last5BitsOfTheFirstByte = (byte) (tlvByteArray[FIRST_BYTE] & 0x1F);

        //Check if the last of the first 3 bits is 1
        if ((first3BitsOfTheFirstByte & 0x20) == 32) {
            System.out.println("Constructed");
            //Check if the last 5 bits are 1
            if (byteToHex(last5BitsOfTheFirstByte).equals("1f")) {
                //So the tag is 2 byte,make the string start after that
                System.out.printf("Tag is :%s,%s \n", byteToHex(tlvByteArray[0]), byteToHex(tlvByteArray[1]));
                newString = tlvWithoutSpaces.substring(10);
                length -= 3;

            } else {
                //The tag is one byte
                System.out.printf("Tag is :%s \n", byteToHex(tlvByteArray[0]));
                newString = tlvWithoutSpaces.substring(4);
                length -= 2;

            }
        } else {
            //If it is primitive have to print tag length and value check again the last five bits
            if (byteToHex(last5BitsOfTheFirstByte).equalsIgnoreCase("1f")) {

                System.out.println("Primitive");
                //Tag is the first two bytes
                System.out.printf("Tag is :%s,%s  ", byteToHex(tlvByteArray[0]), byteToHex(tlvByteArray[1]));
                //Length is the third
                System.out.printf("Length : %s", getDecimal(byteToHex(tlvByteArray[2])));
                //Value starts after the first 3 bytes and goes to the end of the value plus  the other 3 bytes
                System.out.printf("Value : %s\n", tlvWithoutSpaces.substring(6, 6 + (getDecimal(byteToHex(tlvByteArray[2]))) * 2));
                //The new length is 4 for the 2 tags and the length
                length -= getDecimal(byteToHex(tlvByteArray[2])) + 4;
                //The new string is from the end of the value till the end
                newString = tlvWithoutSpaces.substring(6 + (getDecimal(byteToHex(tlvByteArray[2]))) * 2);
            }
            else {
                //Same as the previous,but here is only tag and
                // the substring,length and the new string are with 2 less
                System.out.println("Primitive");
                System.out.printf("Tag is :%s ", byteToHex(tlvByteArray[0]));
                System.out.printf("Length : %s ", getDecimal(byteToHex(tlvByteArray[1])));
                System.out.printf("Value : %s\n", tlvWithoutSpaces.substring(4, 4 + (getDecimal(byteToHex((tlvByteArray[1])))) * 2));

                length -= (getDecimal(byteToHex(tlvByteArray[1]))) + 2;
                newString = tlvWithoutSpaces.substring(4 + (getDecimal(byteToHex((tlvByteArray[1])))) * 2);

            }
        }

        recursive(newString);
    }

    //This function return Hex for given byte
    public static String byteToHex(byte b) {
        int i = b & 0xFF;
        return Integer.toHexString(i);
    }

    //This function returns decimal for given Hex
    public static int getDecimal(String hex) {
        //This is the Hex values
        String digits = "0123456789ABCDEF";
        //Make it to upper case
        hex = hex.toUpperCase();
        int val = 0;
        //Until the end of the string
        for (int i = 0; i < hex.length(); i++) {
            char c = hex.charAt(i);
            val = digits.indexOf(c);
        }
        return val;
    }

    //Return byteArray from hex
    public static byte[] hexStringToByteArray(String hexString) {
        //Get the length of the string
        int len = hexString.length();
        byte[] data = new byte[len / 2];
        //Until the end of the length for step by 2
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hexString.charAt(i), 16) << 4)
                    + Character.digit(hexString.charAt(i + 1), 16));
        }
        return data;
    }

}
