package Strings;
import java.util.*;

public class Comp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String str1 = "An7h";

        if (str.compareTo(str1)==0){
            System.out.println("100% Match");
        }
        else{
            System.out.println("Not Matched");
        }
        sc.close();
    }
}
