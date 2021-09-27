import java.util.*;

public class evenodd {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = scn.nextInt();

        int i = 0;
        while (i < n) {
            if (i % 2 == 0) {
                System.out.println(i + " => Even");
            } else {
                System.out.println(i + " => Odd");

            }
            i++;

        }

    }
}
