package String;

class Main{
    public static void main(String []args){
        String s = "The    sky       is not    limit";

        String res = reverseWord(s);
        System.out.println(res);

    }

    static String reverseWord(String str){

        String []arr = str.split(" +");

        StringBuilder sb = new StringBuilder();

        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}