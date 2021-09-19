import java.io.*;
import java.util.*;

public class differencearray{

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);

        // firt array ready
        int n1 = scn.nextInt();
        int[] one = new int[n1];
        for(int i = 0; i < one.length; i++){
            one[i] = scn.nextInt();
        }

        // second array ready
        int n2 = scn.nextInt();
        int[] two = new int[n2];
        for(int i = 0; i < two.length; i++){
            two[i] = scn.nextInt();
        }

        // Difference
        int[] diff = new int[n2];

        int i = one.length - 1;
        int j = two.length - 1;
        int k = diff.length - 1;

        int c = 0;
        while(k >= 0){
            int d = two[j] - c;
            if(i >= 0){
                d = d - one[i];
            }

            if(d < 0){
                d = d + 10;
                c = 1;
            } else {
                // nothing with d
                c = 0;
            }

            diff[k] = d;

            i--;
            j--;
            k--;
        }

        // don't print leading zeroes
        int idx = 0;
        while(idx < diff.length){
            if(diff[idx] != 0){
                break;
            } else {
                idx++;
            }
        }
        
        while(idx < diff.length){
            System.out.println(diff[idx]);
            idx++;
        }

    }

}