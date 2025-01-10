import java.util.Arrays;

public class Reverse_of_array {
    public static void main(String[] args) {
        int[] arr = {22,4,5,255,8,4,7,88,990,3};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

     static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
