import java.util.*;

public class IsomorphicStrings {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
       HashMap<Character,Character> hm=new  HashMap<Character,Character>();
       for(int i=0;i<s.length();i++){
       if(hm.containsKey(s.charAt(i))){
          if(!hm.get(s.charAt(i)).equals(t.charAt(i))){
               System.out.println(false);
          }
           
       }
       else{
           if(hm.containsValue(t.charAt(i))){
                System.out.println(false);
           }
           hm.put(s.charAt(i),t.charAt(i));
       }}
        System.out.println(true);
    }
}
