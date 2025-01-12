package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c=0;
        int n = sc.nextInt();

        int[] arr = {11,23,5,3,77,54,78,9,100};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                System.out.println(i);
                c++;
            }
        }

        if (c==0) {
            System.out.println(-1);
        }
    }
}
