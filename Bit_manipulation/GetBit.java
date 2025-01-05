package Bit_manipulation;

//Get the bit on ith position
public class GetBit {
    public static void main(String[] args) {
        int n = 5;
        int index = 2;


        System.out.println(bitget(n,index));
    }

    private static int bitget(int n,int index) {
        int bitmask = 1 << index;

        if ((bitmask & n) == 0){
            return 0;
        }
        else{
            return 1;
        }
    }
}
