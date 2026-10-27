package dynamicProgramming;

public class Main {
    static int[] dp;
    public static int fibo(int n){
        if(n<=1) return n;
        if(dp[n]!=0) return dp[n];
        int ans = fibo(n-1) + fibo(n-2);
        dp[n] = ans;
        return ans;
    }

    public static int nthFibonacci(int n){
        dp = new int[n+1];
        return fibo(n);
    }
    static void main(String[] args) {
        System.out.println("Fibonnacci Series: ");
        int res = nthFibonacci(6);
        System.out.println(res);
    }
}
