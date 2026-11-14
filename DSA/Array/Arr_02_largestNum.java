package Array;

public class Arr_02_largestNum {
    static void main(String[] args) {
        int []nums = {132, 424, 112, 563, 233};

        int max = 0;

        for(int i=0;i<=nums.length-1;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        System.out.println("Largest: " + max);


    }
}
