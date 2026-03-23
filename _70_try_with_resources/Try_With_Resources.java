package _70_try_with_resources;
import java.io.InputStreamReader ;
import java.io.BufferedReader ;
import java.io.IOException;

public class Try_With_Resources {
    public static void main(String [] args) throws NumberFormatException, IOException{
        System.out.println("It is a Try With Resources program") ;

        int num = 0 ;

        // BufferedReader br = null ;

        // try{

        //     // InputStreamReader in = new InputStreamReader(System.in) ;
        //     // br = new BufferedReader(in) ;

        //     br = new BufferedReader(new InputStreamReader(System.in)) ;
        //     System.out.print("Enter a number: ") ;
        //     num = Integer.parseInt(br.readLine()) ;
        //     System.out.println("Your entered number be: "+num) ;

        // }
        
        // finally{
        //     // System.exit() ;
        //     System.out.println("Finally Always execute, We are closing connection in Finally")  ;
        //     br.close() ;
        // }

        System.out.println("Try with Resources") ;

        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.print("Enter your number: ") ;
            num = Integer.parseInt(br.readLine())  ;
            System.out.println("Your number be: " + num) ;

        }
        System.out.println("Ends") ;

    }
    
}
