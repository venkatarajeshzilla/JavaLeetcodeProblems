public class Palindrome {
     public static void main(String args[]){ 
        String s = "A man, a plan, a canal: Panama";
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // fixed regex (A-Z not needed after toLowerCase)
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println(false);
                return; // exit early if not a palindrome
            }
            else{
            i++;
            j--;}
        }

        System.out.println(true);
    }
}
