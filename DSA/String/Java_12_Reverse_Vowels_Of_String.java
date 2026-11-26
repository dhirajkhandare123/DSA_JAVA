package String;

public class Java_12_Reverse_Vowels_Of_String {
    static void main(String[] args) {
        String str = "Hello";

        System.out.println(reverseVowels(str));
    }

    static String reverseVowels(String s){

        char[] chars = s.toCharArray();

        int n = chars.length;

        int start = 0;
        int end = n-1;

        while(start < end){
            if(!isVowel(chars[start])){
                start++;
            } else if (!isVowel(chars[end])) {
                end--;
            }
            else{
                char temp = chars[start];
                chars[start] = chars[end];
                chars[end] = temp;

                start++;
                end--;
            }
        }

        return String.valueOf(chars);
    }

    static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ;
    }
}
