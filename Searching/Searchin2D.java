package Searching;
import java.util.Arrays;
public class Searchin2D {
    public static void main(String[] args) {

        int arr[][] = {
                {22,45,7,8954,3,21,4},
                {443,27,843,90,55},
                {3,58,2,8,9,0,55,32},
                {1,2,34,5}
        };

        int target = 8;

        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr, int target) {
        int rows = arr.length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1};
    }
}
