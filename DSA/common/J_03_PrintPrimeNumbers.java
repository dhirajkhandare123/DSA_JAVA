// Write a program to print prime numbers from 1 to N.

package common;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J_03_PrintPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first: ");
        int first = sc.nextInt();
        System.out.println("Enter second: ");
        int second = sc.nextInt();

        List<Integer> list = printPrimeNumbers(first, second);

        System.out.println(list);
    }

    public static List<Integer> printPrimeNumbers(int first, int second){
        ArrayList<Integer> primes = new ArrayList<>();

        for(int i=first; i<=second; i++){
            if(isPrime(i)){
                primes.add(i);
            }
        }

        return primes;
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
