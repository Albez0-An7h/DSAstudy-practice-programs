package Bit_manipulation;

//Find the element in array which does not repeat

public class NonRepeatElement {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,1,6,4,3,4};
        System.out.println(Unique(arr));
    }

    private static int Unique(int[] arr) {

        int unique = 0;

        for (int n : arr){
            unique ^= n;
            //xor the number and store in unique.
            //This way we xor every number with each other.
        }

        return unique;
    }
}
