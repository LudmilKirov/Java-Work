import java.util.*;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

class Main {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        String input = scanner.nextLine();//Input string
        HashMap<Character, Integer> charactersInSentence = new HashMap<>();//Create a Map for the input
        char[] stringToArray = input.toCharArray();//Make the string to array

        for (char character : stringToArray) {/*For every character in the array
                                               if the map contain the character increase the character count by one
                                               if it is not present add it and set the count by 1*/

            if (charactersInSentence.containsKey(character)) {
                charactersInSentence.put(character, charactersInSentence.get(character) + 1);
            }

            else {
                charactersInSentence.put(character, 1);
            }

        }

        Map<Character,Integer> sortedCharactersInSentence=/*Make a new map and sorted it by the value in increase order*/
                charactersInSentence
                .entrySet()
                .stream()
                .sorted(comparingByValue())
                        .collect(toMap(e->e.getKey(), e->e.getValue()
                                ,(e1, e2)->e2,LinkedHashMap::new));


        for (Map.Entry sorted:sortedCharactersInSentence.entrySet()) {/*Using foreach to iterate over
                                                                       every element and print the maps key and value*/
            System.out.println(sorted.getKey()+"->"+sorted.getValue());

        }
    }
}