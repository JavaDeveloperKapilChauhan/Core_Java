package Throws_Keyword;
import java.util.ArrayList ;
import java.util.List ;
import java.util.Arrays ;

import java.util.Collections;

class Demo{

    static{
        System.out.println("Static block of Demo class") ;
    }
    
    public void show() throws ClassNotFoundException{

            Class.forName("Throws_Keyword.Calc") ;
            
    }
}

public class Throws {

    static{
        System.out.println("Static block of Throws class") ;
    }

    final public static void show(){

        return ;

    }

    public static void main(String [] args) {

        System.out.println("throws keyword program") ;
        System.out.println("throws keyword is used declare a stated method can through a exception.")  ;



    }
    
}
