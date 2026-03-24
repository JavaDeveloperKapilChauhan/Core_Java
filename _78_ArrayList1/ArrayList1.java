package _78_ArrayList1;
import java.util.ArrayList ;
import java.util.Collection ;
import java.util.List ;



public class ArrayList1 {
    public static void main(String [] args){


        List<Integer> list = new ArrayList<>() ;
        list.add(6) ;
        list.add(5) ;
        list.add(8) ;
        // list.add("2") ;


        System.out.println(list) ;
        System.out.println(list.get(2)) ;
        System.out.println(list.indexOf(6)) ;
        for(Object s :list){
            int num = (Integer)s  ;
            System.out.print(num*2 + " ") ;
        }





    }
    
}
