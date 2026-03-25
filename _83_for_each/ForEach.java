package _83_for_each;

import java.util.List ;
import java.util.Arrays ;
import java.util.function.Consumer ;


public class ForEach {
    public static void main(String [] args){

        System.out.println("Stream API program") ;

        List<Integer> list = Arrays.asList(4,5,7,3,2,6) ;

        // Consumer<Integer> con = new Consumer<Integer>(){

        //     public void accept(Integer n){
        //         System.out.print(n + " ") ;
        //     }


        // };

        //  Consumer<Integer> con = (n)-> System.out.print(n + " ") ;
            

        // list.forEach(con) ;
        list.forEach(n-> System.out.print(n + " ")) ;

        // System.out.println(list) ;

    }
    
}
