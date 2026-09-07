public class Java_05_CountNumberOfCharacters {
    public static void main(String[] args) {
        String str= "Hello World";

        System.out.println(countCharachters(str));
    }

    public static int countCharachters(String str){
        int count = 0;
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        return count;
    }
}
