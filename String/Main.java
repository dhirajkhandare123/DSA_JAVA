class Main{
    static void main() {
        String str = " dfasd wkmw wrtw      sfnawv  lkcn  ";
        System.out.println(lengthOflastWord(str));
    }

    public static int lengthOflastWord(String s){
        String res = s.trim();
        int count =0;
        for(int i=res.length()-1;i>=0;i--){
            if(res.charAt(i)!= ' '){
                count++;
            }
            else {
                break;
            }
        }
        return count;
    }
}