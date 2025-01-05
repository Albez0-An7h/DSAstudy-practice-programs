package Sorting;

import java.util.Arrays;

// -Here we assume that one half of the array is sorted and other half is not.
// -We compare last element of first half with all the elements of other half and push them if
//  the element is small

public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {77,65,33,24,98,4,1};


        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }

            //Inserting
            arr[j+1] = key;
        }

        System.out.println("Sorted Array" + Arrays.toString(arr));
    }
}
