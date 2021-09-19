import java.util.*;
public class pattern13{

    public static void main(String args[]){
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int osp=n/2;
      int oip=-1;
      for(int i = 1; i <= n; i++){
          for(int j = 1; j <=osp; j++){
              System.out.print("\t");
          }
          System.out.print("*\t");
          for(int j = 1; j <= oip; j++){
            System.out.print("\t");
          }
          if(i>1 && i<n)
          {
            System.out.print("*\t");
          }
          if(i<=n/2)
          {
              osp--;
              oip+=2;
          }else{
              osp++;
              oip-=2;
          }
          System.out.println();
      }
    }
}