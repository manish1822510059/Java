
import java.util.*;
public class intoductionofstring{
    public static void main(String[] args) {
        String s1 = "Manish";
        System.out.println(s1);
        
        for (int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            System.out.println(ch);
        }

        
        
        
        
        
        String s = "hello";
        System.out.println(s.substring(1,3));
        System.out.println(s.substring(0,4));
        System.out.println(s.substring(0,5));
        System.out.println(s.substring(0));
        System.out.println(s.substring(3));
    }
}