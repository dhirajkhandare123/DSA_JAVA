// Question: Length of the Longest Substring Without Repeating Characters
// Given a string, find the length of the longest substring that contains no repeated characters.
// Example
// Input:
// abcdabcebb
// Output:
// 5


import java.util.ArrayList;
import java.util.List;

public class Java_07_LengthOfLongestString {

    public static void main(String[] args) {
        String str= "abcdabcebb";
        int start = 0;
        int end = 0;
        int max_lenght=0;

        List<Character>list = new ArrayList<>();

        while(end!=str.length()){
            if(!list.contains(str.charAt(end))){
                list.add(str.charAt(end));
                end++;
                max_lenght=Math.max(max_lenght,list.size());
            }
            else{
                list.remove(Character.valueOf(str.charAt(start)));
                start++;
            }
        }

        System.out.println("max length: "+max_lenght);
    }
}