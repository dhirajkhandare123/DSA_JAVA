package Array;

public class Arr_01_Basic {

    static void main(String[] args) {
        String []arr = new String[5];

        arr[0] = "Dhiraj";
        arr[1] = "Om";
        arr[2] = "Gajanan";
        arr[3] = "Ganesh";
        arr[4] = "Shankar";

        System.out.println(arr[4]);

        int []arr2 = new int[5];

        for(int i=0;i<arr2.length;i++){
            arr2[i] = i * 234 + 342;
        }

        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }
    }
}
