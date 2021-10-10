import java.io.*;
import java.util.*;

public class rotateshell {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] twod = new int[n][m];
        for (int i = 0; i < twod.length; i++) {
            for (int j = 0; j < twod[0].length; j++) {
                twod[i][j] = scn.nextInt();
            }
        }
        int s = scn.nextInt();
        int r = scn.nextInt();
        int[] oned = getonefromshell(twod, s);
        rotate(oned, r);
        filltwodshellfromoned(oned, twod, s);
        display(twod);
    }

    public static int[] getonefromshell(int[][] twod, int s) {
        int rows = twod.length;
        int cols = twod[0].length;

        int mir = s - 1;
        int mic = s - 1;
        int mar = rows - s;
        int mac = cols - s;
        int vwcount = mar - mir + 1;
        int hwcount = mac - mic + 1;
        int sz = 2 * vwcount + 2 * hwcount - 4;
        int[] oned = new int[sz];
        int idx = 0;
        // left wall
        for (int i = mir, j = mic; i <= mar; i++) {
            oned[idx] = twod[i][j];
            idx++;
        }
        mic++;
        // bottom wall
        for (int i = mar, j = mic; j <= mac; j++) {
            oned[idx] = twod[i][j];
            idx++;
        }
        mar--;
        // right wall
        for (int i = mar, j = mac; i >= mir; i--) {
            oned[idx] = twod[i][j];
            idx++;
        }
        mac--;
        for (int i = mir, j = mac; j >= mic; j--) {
            oned[idx] = twod[i][j];
            idx++;
        }
        mir++;

        return oned;

    }
public static void filltwodshellfromoned(int []oned,int [][]twod,int s){
    int rows = twod.length;
    int cols = twod[0].length;

    int mir = s - 1;
    int mic = s - 1;
    int mar = rows - s;
    int mac = cols - s;
   
    int idx = 0;
    // left wall
    for (int i = mir, j = mic; i <= mar; i++) {
        twod[i][j]=oned[idx];
        idx++;
    }
    mic++;
    // bottom wall
    for (int i = mar, j = mic; j <= mac; j++) {
       twod[i][j]= oned[idx] ;
        idx++;
    }
    mar--;
    // right wall
    for (int i = mar, j = mac; i >= mir; i--) {
         twod[i][j]=oned[idx];
        idx++;
    }
    mac--;
    for (int i = mir, j = mac; j >= mic; j--) {
         twod[i][j]=oned[idx];
        idx++;
    }
    mir++;
    
}


















    public static void rotate(int[] oned, int r) {
        r = r % oned.length;
        if (r < 0) {
            r = r + oned.length;
        }

        reverse(oned, 0, oned.length - r - 1);
        reverse(oned, oned.length - r, oned.length - 1);
        reverse(oned, 0, oned.length - 1);

    }

    public static void reverse(int[] oned, int left, int right) {
        while (left < right) {
            int temp = oned[left];
            oned[left] = oned[right];
            oned[right] = temp;
            left++;
            right--;
        }
    }

    public static void display(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}