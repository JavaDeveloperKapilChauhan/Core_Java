package _84_Stream_API;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Arrays ;
import java.util.stream.Stream ;

public class StreamAPI {
    public static void main(String [] args){

        System.out.println("Stream API program") ;

        List<Integer> list = Arrays.asList(4,5,7,3,2,6) ;

        System.out.println(list) ;

        System.out.println("list by forEach loop: ") ;
        list.forEach(n-> System.out.print(n + " ")) ;


        System.out.println() ;

        System.out.println("Stream is a interface.") ;
        System.out.println("We can only use stream once ") ;
        System.out.println("Streams be the copy of list") ;
        System.out.println("Streams provides various methods such as filter, map  ") ;


        // Stream<Integer> s1 = list.stream() ;
        // System.out.println("s1 be: ") ;
        // s1.forEach(n->System.out.print(n + " ") ) ;

        // Stream<Integer> s2  =s1.filter(n1 -> n1%2==0) ;

        // System.out.println("s2 be: ") ;
        // s2.forEach(n->System.out.print(n + " ") ) ;
        // Stream<Integer> s3 = s2.map(n-> n*2) ;

        // int result = s3.reduce(0, (c,e)-> c+e) ;
        // System.out.println("result be: " + result )  ;

        // s3.forEach(n-> System.out.print(n + " ")) ;

        int result = list.stream().filter(n-> n%2==0).map(n-> n*2).reduce(0,(c,e)-> c+e) ;

        System.out.println("result be: " + result ) ;

        


    




    }
    
}
