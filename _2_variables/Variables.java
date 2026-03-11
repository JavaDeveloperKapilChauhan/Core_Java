package _2_variables;

public class Variables {

    // Types of variables 
    // class variable ,instance variable , local variable 

    static int num1 = 12 ; // class variable (it has scope for whole code )
    int num2 = 13 ; // instance variable  (it has scope till object of class)

    public static void main(String [] args){
        
        int num3 = 14   ; // local variable (it has scope within a block in which it is declared)

        System.out.println("Class variable be: " + num1)  ;
        Variables obj = new Variables()  ;

        System.out.println("Instance variable be: " + obj.num2) ;

        System.out.println("Local variable be: " + num3)  ;


    }
    
}
