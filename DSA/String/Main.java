package String;

class Main{
    static void main(String []args){
        String str = "  The  sky  is   limit        ";

        String res = reverseWord(str);
        System.out.println(res.trim());
    }

    static String reverseWord(String str){
        String []words = str.split(" +");
        StringBuilder sb = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            sb.append(words[i]);
            sb.append(" ");
        }
        return sb.toString();
    }
}