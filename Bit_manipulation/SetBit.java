package Bit_manipulation;

//Set the bit on ith position
public class SetBit {
    public static void main(String[] args) {
        int n = 5;
        int pos = 2;
        int bitmask = 1 << (pos-1);

        int number = n | bitmask;
        System.out.println(number);
    }
}
