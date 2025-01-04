package Bit_manipulation;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println(state(n));
    }

    private static String state(int n) {
        if((n &1) == 1){
            return "odd";
        }
        else{
            return "even";
        }
    }
}
