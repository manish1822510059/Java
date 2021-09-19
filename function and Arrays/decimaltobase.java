import java.util.*;

public class decimaltobase {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int rv = getValueInBase(n, b);
    System.out.println(rv);
  }

  public static int getValueInBase(int n, int b) {
    // write code here
    int rv = 0;
    int p = 1;
    while (n >0) {
      int dig = n % b;
      n = n / b;
      rv = rv + dig * p;
      p = p * 10;
    }
    return rv;
  }
}