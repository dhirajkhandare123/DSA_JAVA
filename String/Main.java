class Main{
    static void main(String[] args) {
        String str = "      The sky     is not  limit           ";

        StringBuilder sb = new StringBuilder();

        String []rev = str.split(" +");

        for(int i=rev.length-1;i>=0;i--){
            sb.append(rev[i]);
            sb.append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}