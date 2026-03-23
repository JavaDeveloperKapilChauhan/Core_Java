package _66_Throw_Keyword ;

public class Throw {
    public static void main(String [] args){
        

        System.out.println("This is Throw keyword program") ;
        System.out.println("throw keyword is used to through custom error") ;
        

        int i = 20 ;
        int j ;

        try{
            j = 18 /i ;

            if(j==0){
                throw new ArithmeticException("Do not want to print zero") ;
            }
        }
        catch(ArithmeticException e){
            System.out.println("thats a default message: " +e ) ;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please check your array limit") ;

        }
        catch(Exception e){
            System.out.println("Something went wrong "+ e) ;
        }

        System.out.println("Program Ends") ;

    }
    
}
