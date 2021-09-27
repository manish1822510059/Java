import java.util.*;

public class primetilln {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int low = scn.nextInt();
        int high = scn.nextInt();

        for (int n = low; n <= high; n++) {
            boolean isprime = true;
            int div = 2;
            while (div * div <= n) {
                int rem = n % div;
                if (rem == 0) {
                    isprime = false;
                    break;
                }
                div++;
            }
            if (isprime == true) {
                System.out.println(n);
            }
        }

    }
}
