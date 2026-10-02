// Write a program to check whether a number is palindrome or not.
package common;

public class J_04_PallindromeNumber {
    static void main(String[] args) {
        int n = 1234;
        int original = n;
        int res = 0;

        while(n!=0){
            int last = n % 10;
            n = n / 10;
            res = res * 10 + last;

        }

        System.out.println(res);

        if(res == original){
            System.out.println("Pallindrome");
        }
        else{
            System.out.println("Not");
        }
    }
}
