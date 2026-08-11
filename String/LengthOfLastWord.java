// Problem Statement: Length of Last Word
// Given a string s consisting of words and spaces, return the length of the last word
//  in the string.
// A word is a maximal substring consisting of non-space characters only.

// Example 1:
// Input: s = " The color of moon     "
// Output: 4


public class LengthOfLastWord {
    public static void main(String[] args){
        String s = " The color of moon     ";
        System.out.println(lengthLastWord(s));
    }

    public static int lengthLastWord(String s){
        int count=0;
        String str = s.trim();

        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }

        return count;
    }

}