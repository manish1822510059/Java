import java.util.*;

public class anybasetoanybase {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase = scn.nextInt();
        int dn = getvalue(n, sourceBase, destBase);
        System.out.println(dn);
    }

    public static int getvalue(int n, int sourceBase, int destBase) {
        int ad = getValueIndecimal(n, sourceBase);
        int dn = getValueInBase(ad, destBase);
        return (dn);

    }

    public static int getValueInBase(int n, int b) {
        // write code here
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % b;
            n = n / b;
            rv = rv + dig * p;
            p = p * 10;
        }
        return rv;
    }

    public static int getValueIndecimal(int n, int b) {
        // write your code here
        int rv = 0;
        int p = 1;
        while (n > 0) {
            int dig = n % 10;
            n = n / 10;
            rv = rv + dig * p;
            p = p * b;

        }
        return rv;

    }
}
