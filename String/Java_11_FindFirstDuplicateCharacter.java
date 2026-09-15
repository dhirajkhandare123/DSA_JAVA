import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

/*
Description:
Write a Java program to find the first duplicate character in a given string.
The program should count the occurrences of each character using a Map and then use
Java 8 Streams to identify the very first character that appears more than once based
on its initial position in the string.

Example 1:Input: "Rajmudra"Output: First duplicate occurrence: r
(Explanation: Both 'r' and 'a' are duplicates, but 'r' appears first in the string at index 0).

 */
public class Java_11_FindFirstDuplicateCharacter {
    static void main(String[] args) {
        String str = "Rajmudra";

        // Using LinkedHashMap to maintain insertion order
        Map<Character, Integer> res = new LinkedHashMap<>();

        for(Character ch : str.toLowerCase().toCharArray()){
            res.put(ch, res.getOrDefault(ch, 0)+1);
        }

        Optional<Character> firstDuplicate = res.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();

        if(firstDuplicate.isPresent()){
            System.out.println("First duplicate is: " + firstDuplicate);
        }
        else{
            System.out.println("Not found");
        }
    }
}
