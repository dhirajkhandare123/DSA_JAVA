package special_algorithms.prefix_sum;

public class PS_02_Partioned {
    static void main(String[] args) {
        // can be partioned
        int[] arr = {1, 2, 3, 3, 2, 1};

        if(isPartioned(arr)){
            System.out.println("Partioned");
        }else {
            System.out.println("Not Partioned");
        }


        // not partioned

        int []arr2 = {11,33,67,78,42};
        if(isPartioned(arr2)){
            System.out.println("Partioned");
        }else {
            System.out.println("Not Partioned");
        }
    }

    static boolean isPartioned(int []arr){
        // prefix sum
        for(int i=1;i<arr.length;i++){
            arr[i] = arr[i] + arr[i-1];
        }

        // checked is it partioned
        for(int i=0;i<arr.length;i++){
            if(2 * arr[i] == arr[arr.length-1]){

                return true;
            }
        }

        return false;
    }
}
