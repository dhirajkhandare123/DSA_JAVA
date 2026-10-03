package special_algorithms.prefix_sum;

public class PS_01_running_sum {
    static void main(String[] args) {
        int []arr = {1, 1, 2, 4, 8};
        int []run = runningSum(arr);

        for(int ele:run){
            System.out.print(ele + " ");
        }
    }

    static int []runningSum(int []arr){
        int n = arr.length;
        int []run = new int[n];
        run[0] = arr[0];
        for(int i=1;i<n;i++){
            run[i] = arr[i] + run[i-1];
        }
        return run;
    }
}
