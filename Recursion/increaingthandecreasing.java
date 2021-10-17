import java.util.*;
public class increaingthandecreasing {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Printincdes(n);
    }

    public static void Printincdes(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        Printincdes(n-1);
        System.out.println(n);
    }
}
