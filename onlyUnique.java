import java.util.*;

class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();//Input string
        ArrayList<String> charactersInSentence = new ArrayList<>();//Create a List to put unique character from the input
        char[] stringToArray = input.toCharArray();//Make the string to array

        for (char character : stringToArray) {/*For every character in the array
                                               if the list contain the character skip it, add only unique.*/
            if (!charactersInSentence.contains(String.valueOf(character))) {

                charactersInSentence.add(String.valueOf(character));
            }

        }

        charactersInSentence.forEach((k)-> System.out.print(k+" "));//functional foreach

    }
}
