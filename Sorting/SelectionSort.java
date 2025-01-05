package Sorting;

// -Here we first find out the minimum value and swap the 0 index with it
// -Time complexity is O(n^2)

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {55,43,2,32,11,92,10,1};

        for(int i=0;i<arr.length-1;i++){
            int min = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
