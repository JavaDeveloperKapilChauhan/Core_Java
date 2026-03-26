package _86_Parallelism_Stream;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Random ;


public class ParallelismStream {
    public static void main(String [] args){

        System.out.println("ParallelismStream program") ;


        int size = 10_000 ;
        List<Integer> nums = new ArrayList<>(size) ;

        Random ran = new Random() ;

        for(int i=1 ; i<=size ; i++){
            nums.add(ran.nextInt(100)) ;
        }


        System.out.println("Sum of a list: ") ;
        // int sum1 = nums.stream().map(n-> n*2).reduce(0,(c,e)-> (c+e)) ;
        long startSeq2 = System.currentTimeMillis() ;
        int sum2 = nums.stream().map(n-> n*2).mapToInt(n->n).sum() ;
        long endSeq2 = System.currentTimeMillis() ;

        long startSeq3 = System.currentTimeMillis() ;
        int sum3 = nums.parallelStream().map(n->n*2).mapToInt(n->n).sum() ;
        long endSeq3 = System.currentTimeMillis() ;

        // System.out.print(nums + " ") ;
        // System.out.println("Sum of nums list sum1 be: "+ sum1) ;
        System.out.println("Sum of nums list sum2 be: " + sum2 + " , time it takes - " + (endSeq2 - startSeq2)) ;
        System.out.println("Sum of nums list sum3 be: "+ sum3 + "  time it takes - " + (endSeq3-startSeq3) ) ;






    }
    
}
