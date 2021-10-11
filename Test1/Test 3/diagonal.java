import java.util.*;

public class diagonal {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [][]arr= new int[n][n];
        for(int i=0; i<arr.length; i++) {
           for(int j=0; j<arr[0].length;j++){
              arr[i][j] = scn.nextInt();
           }
        }
        for(int dig=0;dig<2*n;dig++) {
            int i ;
            int j ;
            if(dig<n-1){
                if(dig%2==0){
                    i=n-1-dig;
                    j=0;
                }else{
                    i=n-1;
                    j=dig;
                }
            }else if(dig>=n){
                if(dig%2==0){
                    i=0;
                    j=dig-(n-1);
                }else{
                    i=2*n-2-dig;
                    j=n-1;
                }
            }else{
                if(n%2==0){
                    i=n-1;
                    j=n-1;
                }else{
                    i=0;
                    j=0;
                }
            }
        
            if(dig%2==0){
                while(i<n && j<n){
                    System.out.println(arr[i][j]);
                    i++;
                    j++; 
                }
                }else{
                    while(i>=0 && j>=0){
                        System.out.println(arr[i][j]);
                        i--;
                        j++;
                    }
                }
            }


        }



    }