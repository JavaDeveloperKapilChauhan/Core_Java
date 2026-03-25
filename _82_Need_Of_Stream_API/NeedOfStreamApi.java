package _82_Need_Of_Stream_API;

import java.util.List ;
import java.util.Arrays ;

public class NeedOfStreamApi {
    public static void main(String [] args){

        System.out.println("Stream is an interface ") ;
        System.out.println("Stream provides many methods such as filter , ") ;

        System.out.println("Need of Stream API Program") ;

        List<Integer> list = Arrays.asList(4,5,7,3,2,6) ;

        System.out.println("list by for Each loop") ;
        list.forEach(n-> System.out.print(n + " "))  ;
        int sum = 0; 

        for(int a : list){

            if(a%2==0) sum += a*2;

        
        }
        System.out.println() ;
        System.out.println("sum be: " + sum) ;
        
        System.out.println(list)  ;


    }
    
}
