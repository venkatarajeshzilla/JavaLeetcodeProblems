import java.util.*;

public class DifferenceOfStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int total = 0;

        for (int i = 0; i < t.length(); i++) {
            total = total + t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            total = total - s.charAt(i);
        }

        System.out.println((char) total);
    }
}
