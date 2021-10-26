import java.util.*;
public class easyodd{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = getsum(n);
        System.out.println(ans);
    }

    public static int getsum(int n) {
        if(n==0){
            return 0; 
        }
        int rem =n%10;
        n/=10;
        int val =getsum(n);
        if(rem%2!=0){
            return rem+val; 
        }else{
            return val;
        }
    }

}