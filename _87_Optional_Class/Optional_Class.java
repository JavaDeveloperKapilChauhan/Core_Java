package _87_Optional_Class;
import java.util.List ;
import java.util.Arrays ;
import java.util.Optional ;


public class Optional_Class {
    public static void main(String [] args){
        System.out.println("Optional Class Program") ;

        List<String> list = Arrays.asList("Isskander Chauhan" , "Hammir Chauhan" , "Prithviraj Chauhan") ;

        Optional<String> name = list.stream().filter(n-> n.contains("a1")).findFirst()  ;

        System.out.println("list be: "+list) ;

        System.out.println("Optional Class is used to prevent NullPointerException") ;

        System.out.println("name be : " + name.orElse("Not found")) ;
    }

    
}



