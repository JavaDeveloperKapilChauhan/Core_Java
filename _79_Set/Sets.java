package _79_Set;
import java.util.Set ;
import java.util.HashSet ;
import java.util.TreeSet ;
import java.util.Collection ;
import java.util.Iterator ;


public class Sets {
    public static void main(String [] args){
        System.out.println("It is a set program") ;
        System.out.println("Set is a interface, Set contains only unique values.") ;


        Set<Integer> set1 = new HashSet<>() ;
        set1.add(1) ;
        set1.add(2) ;
        set1.add(32) ;
        set1.add(4) ;
        set1.add(300) ;

        System.out.println("set1 be: ") ;

        for(Integer s: set1){
            System.out.print(s + " ") ;
        }

        Collection<Integer> set2 = new TreeSet<>() ;
        set2.add(1) ;
        set2.add(2) ;
        set2.add(32) ;
        set2.add(4) ;
        set2.add(300) ;

        System.out.println() ;
        System.out.println("set2 be: ") ;

        for(int s: set2){
            System.out.print(s + " ") ;
        }
        System.out.println() ;


        System.out.println("Iterator interface: ") ;
        System.out.println("Collection interface implement Iterator interface") ;

        System.out.println("set2 by iterator method---") ;

        Iterator<Integer> it = set2.iterator() ;

        while(it.hasNext()){
            System.out.print(it.next() + " ") ;
        }

        

    


    }
    
}
