import java.util.*;

public class hailstonesequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
    
        print(n);
    }

    public static void print(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.print(n + " ");
        if (n % 2 == 0) {
            print(n / 2);
        } else {
            print(3 * n + 1);
        }

    }
}