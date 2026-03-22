package _64_Exception_Handling;

public class ExceptionHandling {

    public static void main(String [] args){

        System.out.println("Handling Runtime errors are known to be Exception Handling") ;
        System.out.println("Exception are Runtime errors, and handling of Runtime errors known to be Exception Handling");
        
        
        int a = 29 ;
        int b = 0 ;

        try{
            int c = a/b ;
            System.out.println("c be: " + c) ;
        }
        catch(Exception e){
            System.out.println("Exception be: " + e) ;
        }

        System.out.println("Program ends") ;



    }
    
}
