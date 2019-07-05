import java.util.*;
//Make a program that prints only the unique characters
class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        //Input string
        String input = scanner.nextLine();
        //Create a List to put unique character from the input
        ArrayList<String> charactersInSentence = new ArrayList<>();
        //Make the string to array
        char[] stringToArray = input.toCharArray();
        //For every character in the array
        //if the list contain the character skip it, add only unique.*/
        for (char character : stringToArray) {
            if (!charactersInSentence.contains(String.valueOf(character))) {
                charactersInSentence.add(String.valueOf(character));
            }
        }
        //functional foreach
        charactersInSentence.forEach((k)-> System.out.print(k+" "));

    }
}
