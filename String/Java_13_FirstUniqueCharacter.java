public class Java_13_FirstUniqueCharacter {
    static void main(String[] args) {
        String str = "eeetcode";

        System.out.println(firstUniqueChar(str));
    }

    static int firstUniqueChar(String s){
        int[] freq = new int[26];

        char[] chars = s.toCharArray();

        for(char c : chars){
            freq[c - 'a']++;
        }

        for(int i=0;i <= chars.length-1;i++){
            if(freq[chars[i]-'a']==1){
                return s.indexOf(chars[i]);
            }
        }

        return -1;
    }
}
