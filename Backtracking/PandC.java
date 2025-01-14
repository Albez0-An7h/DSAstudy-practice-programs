package Backtracking;

// Time complexity O(n*n!)

public class PandC {

    public static void pandc(String str,int idx, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }

        for(int i =0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            pandc(newStr,idx+1,perm+ch);
        }
    }

    public static void main(String[] args) {
        String str  = "abcd";
        pandc(str,0,"");
    }
}
