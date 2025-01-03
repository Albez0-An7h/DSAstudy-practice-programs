/*
Q. Take an array as input from the user. Search for a given number x 
and print the index at which it occurs
 */

import java.util.Scanner;

class Linear_Search{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the number to be searched: ");
        int num = sc.nextInt();
        
        boolean flag = false;

        for (int j = 0; j < size; j++) {
            if (arr[j] == num) {
                flag = true;
            }
        }

        if (flag == true) {
            System.out.println("Number Found");
        } else {
            System.out.println("Number Not Found");

        }

        sc.close();
    }
}
