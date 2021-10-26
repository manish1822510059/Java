// You are given an array A of n unique integers.
// You have to find 2nd maximum and 2nd minimum numbers in this array.

// If A = [3, 7, -1, 2, 4, 9]

// 2nd max is 7
// 2nd min is 2

import java.util.*;

public class secondgreater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
      
        for (int i = 0; i < arr.length; i++) {
        int temp ;
        for (int j = i+1; j < arr.length; j++) {
            if(arr[i]<arr[j]) {
                temp = arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }

        }
        }

        System.out.print(arr[1]);
        System.out.print(" "+arr[n-2]);
            

    }
}
