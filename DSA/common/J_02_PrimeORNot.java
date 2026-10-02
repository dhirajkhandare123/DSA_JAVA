// Write a program to check whether a number is prime or not.

package common;

import java.util.Scanner;

public class J_02_PrimeORNot {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = sc.nextInt();

        if(isPrime(n)){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not prime");
        }

    }

    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }

        for(int i=2;i<n;i++){
            if(n%i == 0){
                return false;
            }
        }

        return true;
    }
}
