import java.io.*;
import java.util.*;

public class permutation
{

public static void solution(String str)
    {
        // write your code here
       int n = factorial(str.length());
       for(int i=0;i<n;i++){
           StringBuilder sb = new StringBuilder(str);
           int dvd=i;
           for(int div=str.length();div>=1;div--){
               int q =dvd/div;
               int r =dvd%div;
               System.out.print(sb.charAt(r));
               dvd=q;
               sb.deleteCharAt(r);
           }
           System.out.println();
       }
       
    }

public static int factorial(int n)
    {
int val = 1;
for (int i = 2; i <=n; i++){
    val=val*i;
}
return val;
    }

public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }
}