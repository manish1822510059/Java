import java.io.*;
import java.util.*;

public class asciidiff {

	public static String solution(String str){
		// write your code here
     
      StringBuilder sb = new StringBuilder();
            for(int i=0;i<str.length();i++){
          if(i==str.length()-1){ // using for last charater print asitis
              char chi =str.charAt(i);
              sb.append(chi);
          }else{
              char chi = str.charAt(i);
              char chi1 = str.charAt(i+1);
              sb.append(chi);
              sb.append(chi1-chi);


          }
      }

		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}