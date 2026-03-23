package _67_Custom_Exception;

class CustomBuiltException extends RuntimeException{
    public CustomBuiltException(String str){
        super(str) ;
        // System.out.println(str) ;

    }

}

public class CustomException {

    
    public static void main(String [] args){

        System.out.println("This is custom Exception program") ;


        int i = 20 ;
        int j ;

        try{
            j = 18/i ;

            if(j==0){
                throw new CustomBuiltException("I do not want to print zero")  ;
            
            }
        }
        catch(CustomBuiltException e){
            System.out.println("thats default exception: "+e) ;
        }
        // catch(ArithmeticException e){
        //     System.out.println("Cannot divide by zero "+ e) ;
        // }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Please check the size of array "+ e) ;
        }
        catch(Exception e){
            System.out.println("Something went wrong: " + e) ;
        }

        System.out.println("Program Ends") ;
        
    }
    
}
