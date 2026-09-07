public class Java_03_Pallindrome {
    public static void main(String[] args) {
        String str = "Levell";

        System.out.println(isPallindrome(str));
    }

    public static boolean isPallindrome(String str){
        String lowerStr = str.toLowerCase();
        String rev="";

        for(int i=lowerStr.length()-1;i>=0;i--){
            rev=rev+lowerStr.charAt(i);
        }

        if(lowerStr.equals(rev)){
            return true;
        }
        return false;
    }
}
