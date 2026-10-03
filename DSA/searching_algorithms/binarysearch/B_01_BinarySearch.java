package searching_algorithms.binarysearch;

public class B_01_BinarySearch {
    static void main(String[] args) {
        int []arr = {1,2,3,4,55,66,77,122,144,231,345};
        int target = 55;

        int idx = binarySearch(arr, target);

        if(idx>=0){
            System.out.println("Found at: " + idx);
        }
        else{
            System.out.println("Not found");
        }
    }

    static int binarySearch(int []arr, int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low <= high){
            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid -1;
            }
        }
        return -1;
    }
}
