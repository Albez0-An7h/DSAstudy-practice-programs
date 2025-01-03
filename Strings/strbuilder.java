package Strings;

public class strbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("An7h"); 
        sb.setCharAt(2,'s');
        System.out.println(sb);

        sb.insert(4,'0');
        System.out.println(sb);
        
        sb.delete(2,3);
        System.out.println(sb);

        sb.append('k');
        System.out.println(sb);

    }
}
