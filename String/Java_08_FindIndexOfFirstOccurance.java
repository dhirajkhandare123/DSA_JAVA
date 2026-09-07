// Question:
// Write a Java program to find the index of the first occurrence of a given substring 
// (needle) within a string (hayStack). If the substring is not found, return -1.

// Example:

// hayStack = "dhiraj"
// needle = "raj"
// Output: 3

// The solution should implement the search logic without directly using indexOf().


public class Java_08_FindIndexOfFirstOccurance {
    public static void main(String[] args) {
        String hayStack = "dhiraj";
        String needle = "raj";

        int n = firstOccurance(hayStack,needle);
        System.out.println(n);
    }

    public static int firstOccurance(String hayStack, String needle){
        

        for(int i=0;i<hayStack.length()-needle.length()+1;i++){
            if(hayStack.charAt(i)==needle.charAt(0)){
                if(hayStack.substring(i,needle.length()+i).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
}
