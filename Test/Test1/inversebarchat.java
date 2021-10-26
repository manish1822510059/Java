import java.util.*;

public class inversebarchat {

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int [] arr = new int[n];
    for(int i=0;i<arr.length;i++) {
        arr[i] = scn.nextInt();
    }
    int max = arr[0];
    for(int i=1;i<arr.length;i++) {
        if(arr[i] > max)
        {
            max = arr[i];
        }
    }
   
   for(int floor=1; floor<=max;floor++) {
       for(int i=0;i<arr.length;i++) {
        if(arr[i]>=floor){ 
        System.out.print("*\t");
       } else { 
        System.out.print("\t");
       }

   }
   System.out.println();
 }
}
}






import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int [] arr = new int[n];
    for (int i = 0; i < arr.length; i++){
     arr[i] = sc.nextInt();
    }
    int lim =(1<<n);
    for(int i = 0; i < lim; i++){
        int dec =i;
        String str= " ";
        for(int j = 0; j <arr.length; j++)
        {
            int rem = dec%2;
            dec = dec/2;
            if(rem == 0){
                str = "-	"+str;
            }else{
                str = arr[arr.length-1-j] +"	"+str;
            }
        }
        System.out.println(str);
    }


 }

}