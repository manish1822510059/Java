import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // here is my code 
     int num=0;
     int tp=1;
     while(n2>0){
         int d2=n2%10;
         n2/=10;
         int sp=getNum(d2,n1,b);
         num=getSum(num,sp*tp,b);
         tp*=10;
     }
        return num;  }
    public static int getNum(int d2,int n1,int b){
        int c=0;
        int sum=0;
        int tp=1;
        while(n1>0 || c>0){
            int d1=n1%10;
            n1/=10;
            int d=d1*d2+c;
            c=d/b;
            d=d%b;
            sum+=d*tp;
            tp*=10;
        }
        return sum;
        
    }
      public static int getSum(int n2,int n1,int b){
         int c=0;
        int sum=0;
        int tp=1;
        while(n1>0 ||n2>0|| c>0){
            int d1=n1%10;
            n1/=10;
            int d2=n2%10;
            n2/=10;
            int d=d1+d2+c;
            c=d/b;
            d=d%b;
            sum+=d*tp;
            tp*=10;
        }
        return sum;
        
    }
     
}

