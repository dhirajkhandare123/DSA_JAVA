/*
387. First Unique Character in a String

Given a string s, find the first non-repeating character in it and return its index. If it does not exist,
return -1.



Example 1:

Input: s = "leetcode"

Output: 0

Explanation:

The character 'l' at index 0 is the first character that does not occur at any other index.

Example 2:

Input: s = "loveleetcode"

Output: 2

Example 3:

Input: s = "aabb"

Output: -1

 */

// Here I have used LinkedHashMap

import java.util.LinkedHashMap;
import java.util.Map;

public class Java_12_FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        LinkedHashMap<Character, Integer> m = new LinkedHashMap<>();

        int n = s.length()-1;

        for(int i=0;i<=n;i++){
            if(m.containsKey(s.charAt(i))){
                m.put(s.charAt(i), m.get(s.charAt(i))+1);
            }
            else{
                m.put(s.charAt(i), 1);
            }
        }

        for(Map.Entry<Character,Integer> count: m.entrySet()){
            if(count.getValue()==1){
                return s.indexOf(count.getKey());
            }
        }

        return -1;
    }
}
