import java.util.*;

public class pattern1 {
     public static void main(String[] args) {
         Scanner snc =  new Scanner(System.in);
         int n = snc.nextInt();
         for(int i = 0; i < n; i++) {
             for(int j = 0; j < i; j++) {
                 System.out.print("*");
             }
             System.out.println(" ");
         }
     }
    
}
