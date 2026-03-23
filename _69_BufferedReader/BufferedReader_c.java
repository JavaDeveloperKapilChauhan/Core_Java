package _69_BufferedReader;
import java.io.BufferedReader ;
import java.io.InputStreamReader ;
import java.io.IOException ;
import java.util.Scanner ;

public class BufferedReader_c {
    public static void main(String [] args) throws IOException{
        System.out.println("BufferedReader program") ;

        // InputStreamReader in = new InputStreamReader(System.in) ;
        // BufferedReader obj = new BufferedReader(in) ;
        // System.out.println("Enter a number") ;
        // int num = Integer.parseInt(obj.readLine()) ;
        // System.out.println(num)  ;
        // obj.close() ;

        // Taking input through Scanner Class

        Scanner sc = new Scanner(System.in) ;
        System.out.println("Please enter a number") ;
        int num = sc.nextInt() ;
        System.out.println("Enter your name") ;
        Scanner sc1 ;
        sc1 = new Scanner(System.in) ;
        String name = sc1.nextLine() ;
        System.out.println("Your number be: " + num) ;
        System.out.println("Your name be: " + name) ;
        sc.close() ;
        sc1.close() ;


        


        
    }
    
}
