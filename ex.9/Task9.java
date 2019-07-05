
import java.util.*;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

//Make a program that calculate the frequency
// of the each letter of the given input
public class Task9 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Input string
        String input = scanner.nextLine();
        //Create a Map for the input
        HashMap<Character, Integer> charactersInSentence = new HashMap<>();
        //Make the string to array
        char[] stringToArray = input.toCharArray();

        //For every character in the array
        //if the map contain the character increase the character count by one
        // if it is not present add it and set the count by 1
        for (char character : stringToArray) {
            if (charactersInSentence.containsKey(character)) {
                charactersInSentence.put(character, charactersInSentence.get(character) + 1);
            } else {
                charactersInSentence.put(character, 1);
            }
        }
        //Make a new map and sorted it
        //by the value in increase order
        LinkedHashMap<Character, Integer> sortedCharactersInSentence =
                charactersInSentence
                        .entrySet()
                        .stream()
                        .sorted(comparingByValue())
                        .collect(toMap(e -> e.getKey(), e -> e.getValue(),
                                (e1, e2) -> e2, LinkedHashMap::new));

        sortedCharactersInSentence.forEach((k, v) -> System.out.println(k + " " + createAsterisk(v)));//functional foreach

    }

    //Using to string builder to replace
    // the count occurrences with asterisk
        private static String createAsterisk(int number) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < number; i++)
                sb.append("*");
            return sb.toString();
        }
    }

