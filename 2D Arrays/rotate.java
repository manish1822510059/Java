import java.io.*;
import java.util.*;

public class rotate {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
  
        int [][]arr = new int[n1][n1];
        for(int i = 0; i <arr.length; i++){
            for(int j = 0; j <arr[0].length;j++){
               arr[i][j]= scn.nextInt();
            }

        }


        //transpose the arrays

        for(int i = 0;i<arr.length;i++){
            for(int j = i+1;j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse row arrays here
        for(int i = 0; i <arr.length; i++){
            int left = 0;
            int right = arr[i].length-1;
            while(left<right){
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
                left++;
                right++;
            } 
            // print
        display(arr);


        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}