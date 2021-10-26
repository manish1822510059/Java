
/* 1 2 3 4 5
11 12 13 14 15
21 22 23 24 25
16 17 18 19 20
6 7 8 9 10
 */
import java.util.*;

public class easypattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int val = 1;
        for (int i = 1; i <= n; i++) {
            int cval = val;
            for (int j = 1; j <= n; j++) {
                System.out.print(cval + "\t");
                cval++;
            }
            System.out.println();

            if (n % 2 == 0) {
                if (i <=n / 2) {
                    val +=2 * n;
                } else if (i == n / 2) {
                    val +=n;
                } else {
                    val -= 2 * n;
                }
            } else {

                if (i <=n / 2) {
                    val +=2 * n;
                } else if (i == n / 2+1) {
                    val = val - n;
                } else {
                    val -= 2 * n; 
                }

            }
        }
    }

}
