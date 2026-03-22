package _65_Try_MutipleCatch;

public class TryMutipleCatch {
    public static void main(String [] args){
        System.out.println("This is Try Multiple catch program") ;

        int i = 9 ;
        int j ;
        String s = null ;

        int [] nums = new int[5] ;
        
        try{
            j = 18/i ;
            System.out.println(s.length()) ;
            System.out.println(nums[2]) ;
            System.out.println(nums[5]) ;
        }
        catch(ArithmeticException e){
            System.out.println("cannot divide by zero") ;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please check array limit") ;
        }
        catch(Exception e){
            System.out.println("Something went wrong:--  "+e) ;
        }
        System.out.println("End of Program") ;

    }
    
}
