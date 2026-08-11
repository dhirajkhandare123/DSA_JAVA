// Problem Statement: Reverse Words in a String
// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s 
// will be separated by at least one space.

// Return a string of the words in reverse order concatenated by a single space.

// Example 1:
// Input: s = "  The sky is not  limit  "
// Output: "limit not is sky The"

public class ReverseWordsInString {
    public static void main(String[] args) {
        String str = "  The sky is not  limit  ";
        System.out.println(reverseWords(str));
    }

    public static String reverseWords(String str){

        String[] words = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
      
    }
}
