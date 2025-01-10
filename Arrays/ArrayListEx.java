import java.util.ArrayList;

// -We use arraylist when we don't know how big our array will be.
// -Basically Dynamic array.

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>(3);

        arr.add("A");
        arr.add("B");
        arr.add("C");
        arr.add("D");
        arr.add("E");
        arr.add("F");
        arr.add("G");
        arr.add("H");

        System.out.println(arr);
        System.out.println(arr.contains("H"));
        arr.set(0,"X");
        System.out.println(arr);
        arr.remove(0);
        System.out.println(arr);
        System.out.println(arr.get(5));
    }
}
