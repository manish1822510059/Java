import java.io.*;
import java.util.*;

public class lastandfirst {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        int left = 0;
        int right = ar.length - 1;
        int fi = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data > ar[mid]) {
                left = mid + 1;
            } else if (data < ar[mid]) {
                right = mid - 1;
            } else {
                fi = mid;
                right = mid - 1;

            }

        }
        System.out.println(fi);
        left = 0;
        right = ar.length - 1;

        int li = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (data > ar[mid]) {
                left = mid + 1;
            } else if (data < ar[mid]) {
                right = mid - 1;
            } else {
                li = mid;
                left = mid + 1;

            }

        }

        System.out.println(li);
    }
}