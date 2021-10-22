import java.util.*;

public class removeprime2 {
    public static void solution(ArrayList<Integer> a2){
    for(int i=0;i<a2.size();i++){
        int val = a2.get(i);
        boolean isthisprime =prime(val);
        if(isthisprime==true){
         a2.remove(i);
         i--;// its important line ;

        }
    }

    } 

  public static boolean prime(int num){
      boolean isprime=true;
      for(int div=2;div*div<=num;div++){
          if(num%div==0){
              isprime = false;
              break; //
          }
      }
      return isprime;
  }  







   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       ArrayList<Integer> a2 =new ArrayList<>();

       for(int i = 0; i < n; i++){
           a2.add(sc.nextInt());
       }
       solution(a2);
       System.out.println(a2);
   }    
}
