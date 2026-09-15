import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java_10_FindDuplicateCharacters {
    static void main(String[] args) {
        String s = "Rajmudra";

        Map<Character, Integer> result = new HashMap<>();

        for(Character ch : s.toLowerCase().toCharArray()){
            result.put(ch, result.getOrDefault(ch, 0) + 1);
        }

        Map<Character, Integer> ans = result.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Result: " + ans);
    }
}
