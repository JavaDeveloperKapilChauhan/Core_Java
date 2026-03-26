package _88_Method_Reference;

import java.util.List ;
import java.util.Arrays ;

public class Method_Reference {

    public static void main(String [] args){
        System.out.println("It is a method reference program..") ;


        List<String> list1 = Arrays.asList("isskander chauhan" , "hammir chauhan") ;

        System.out.println("list be: " + list1) ;

        // List<String> list2 = list1.stream().map(n-> n.toUpperCase()).toList() ;
        List<String> list2 = list1.stream().map(String::toUpperCase).toList();
        System.out.println("list2 be: " + list2) ;

        System.out.println("list2 one by one: ") ;

        // list2.forEach(n-> System.out.println(n + " ")) ;
        list2.forEach(System.out::println) ;


    }

    
}
