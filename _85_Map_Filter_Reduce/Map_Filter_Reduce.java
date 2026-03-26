package _85_Map_Filter_Reduce;
import java.util.List ;
import java.util.Arrays ;
import java.util.stream.Stream ;



public class Map_Filter_Reduce {
    public static void main(String [] args){

        System.out.println("Map ,Filter ,Reduce program");

        List<Integer> nums = Arrays.asList(4,5,7,3,2,6) ;
        System.out.println("nums be: " + nums) ;

        // int result = nums.stream().filter(n-> n%2==0).map(n-> n*2).reduce(0, (c,e)->c+e) ;
        // System.out.println("Result be : " + result) ;

        Stream<Integer> s1 = nums.stream().filter(n-> n%2==0).map(n-> n*2).sorted() ;

        System.out.println("s1 be: " + s1) ;
        s1.forEach(n-> System.out.print(n + " ")) ;


    }
    
}
