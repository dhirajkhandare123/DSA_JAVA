package SlidingWindow;

public class SW_01 {
    static void main(String[] args) {
        int []arr = {100,200,300,400,500,600,700,800};
        int n = arr.length;
        int k = 3;

        int windowSum = 0;

        // first window
        for(int i=0;i<k;i++){
            windowSum = windowSum + arr[i];
        }

        System.out.println("Sub Array Sum: " + windowSum);

        // traverse through all windows
        for(int i=1;i<=n - k;i++){
            windowSum = windowSum - arr[i-1] + arr[i+2];
            System.out.println("Sub Array Sum: " + windowSum);
        }
    }
}
