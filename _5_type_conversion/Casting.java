package _5_type_conversion ;

public class Casting{

    public static void main(String [] args){

        byte a = 12 ;
        int b ;
        b = (int) a  ;


        float c = 7.8f ;

        int d = (int) c ;

        System.out.println(d) ;

        // Type promotion 

        byte num1 = 10 ;
        byte num2 = 30 ;

        int result = num1*num2 ;

        System.out.println("result be: " + result)   ;
        



    }
}