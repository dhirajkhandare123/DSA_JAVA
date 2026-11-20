package Array;

public class Arr_03_Smallest {
    static void main(String[] args) {
        int []arr = {314, 422, 112, 532, 674, 132};

        int min = arr[0];

        for(int i=0;i<=arr.length-1;i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smallest: " + min);
    }
}
