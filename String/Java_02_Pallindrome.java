

public class Java_02_Pallindrome{
    public static void main(String[] args) {
        String str = "level";

        System.out.println(isPallindrome(str));
    }

    public static boolean isPallindrome(String s){
        String s1 = s;

        StringBuilder sb = new StringBuilder(s1);

        sb.reverse();

        if(s1.equals(sb.toString())){
            return true;
        }


        return false;
    }
}