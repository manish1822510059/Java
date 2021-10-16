import java.io.*;
import java.util.*;

public class removeprime {
       
    public static boolean isPrime(int num){
        boolean isPrime= true;
        for(int div=2;div*div<=num;div++){
            if(num%div==0){
                isPrime=false;
                break;
            }
        }
		return isPrime;
    }

	public static void solution(ArrayList<Integer> a1){
		// write your code here
     for(int i =a1.size()-1;i>=0;i--){
         int val = a1.get(i);
         boolean isThisValPrime = isPrime(val);
         if(isThisValPrime==true){
             a1.remove(i);
         }
     }
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int i = 0; i < n; i++){
            a1.add(scn.nextInt());
        }
        solution(a1);
        System.out.println(a1);
	}

}