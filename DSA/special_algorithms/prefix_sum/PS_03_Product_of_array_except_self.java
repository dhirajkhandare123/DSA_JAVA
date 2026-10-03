package special_algorithms.prefix_sum;

public class PS_03_Product_of_array_except_self {
    static void main(String[] args) {
        int []arr = {-1,1,0,-3,3};
        int []ans = productExceptSelf(arr);

        for(int ele: ans){
            System.out.print(ele + " ");
        }
    }

    static int []productExceptSelf(int []arr){
        int n = arr.length;
        int []pre = new int[n];
        int []suf = new int[n];
        int []ans = new int[n];

        // prefix array
        pre[0] = 1;
        int p = arr[0];
        for(int i=1;i<n;i++){
            pre[i] = p;
            p = p * arr[i];
        }

        // suffix array
        suf[n-1] = 1;
        p = arr[n-1];
        for(int i=n-2;i>=0;i--){
            suf[i] = p;
            p = p * arr[i];
        }

        // ans array
        for(int i=0;i<n;i++){
            ans[i] = pre[i] * suf[i];
        }

        return ans;
    }
}
