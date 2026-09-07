public class Java_01_ReverseString {
    static void main() {
        String str = "dhiraj";

        char[] original = str.toCharArray();
        String reversed = "";

        for(int i = original.length-1;i>=0;i--){
            reversed = reversed + original[i];
        }

        String rev = reversed.toString();

        System.out.println(rev);



    }
}
