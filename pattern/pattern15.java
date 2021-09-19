import java.util.*;

public class pattern15 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n / 2;
        int st = 1;
        int val = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            int sap = val;
            for (int j = 1; j <= st; j++) {

                System.out.print(sap + "\t");
                if (j <= st / 2) {
                    sap++;
                } else {
                    sap--;
                }

            }
            if (i <= n / 2) {
                val++;
            } else {
                val--;
            }

            if (i <= n / 2) {
                sp -= 1;
                st += 2;
            } else {
                sp += 1;
                st -= 2;

            }
            System.out.println();
        }
    }
}