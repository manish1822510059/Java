import java.util.*;
public class arraylist {
    public static void main(String[] args){
        ArrayList<Integer> list ;
        list = new ArrayList<>();
        System.out.println(list.size()+" -> "+list);
        list.add(10);   //adding new values in array List  -> list.add() 
        list.add(20);
        list.add(30);
        System.out.println(list.size()+" -> "+list);
        list.set(1,200);
        System.out.println(list.size()+" -> "+list);
        list.add(2,5000);
        System.out.println(list.size()+" -> "+list);
        int val =list.get(1);
        System.out.println(val);
        System.out.println(list.size()+" -> "+list);
        for(int i = 0; i < list.size(); i++){
            int val1 = list.get(i);
            System.out.println(val1);
        }
        
        for(int val2: list){
            System.out.println(val2);
        }
     

    }
    
}
