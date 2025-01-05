package Sorting;

// - In bubble sort we compare the two neighbouring elements and swap them if needed
// - The time complexity of this is O(n^2)

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {66,45,10,22,40,1,4};
        System.out.print("before sorting: "+printarr(arr));
        System.out.println();
        for(int i=0;i<arr.length-1;i++){
            for(int j = 0; j < arr.length - i -1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("after sorting: "+ printarr(arr));
    }

    public static String printarr(int[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + " ";
        }
        return str;
    }
}
