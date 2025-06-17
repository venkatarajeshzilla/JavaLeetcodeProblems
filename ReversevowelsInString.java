public class ReversevowelsInString{
    public static void main(String[] args) {
        String s = "ramaieost";
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length - 1;

        while (start < end) {
            if (!vowel(ch[start])) {
                start++;
            } else if (!vowel(ch[end])) {
                end--;
            } else {
            
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }

        System.out.println(String.valueOf(ch));
    }

    static boolean vowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
               ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
}
