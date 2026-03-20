package _48_Upcasting_Downcasting;


class A{
    public void show1(){
        System.out.println("in show A") ;

    }

}

class B extends A{

    public void show2(){
        System.out.println("in show B") ;

    }
    
}

public class UpcastingDowncasting {
    public static void main(String [] args){

        System.out.println("It is a Upcasting and downcasting program") ;

        A obj = (A)new B()  ;  // Upcasting 
        obj.show1() ;  

        B obj1 =  (B)obj  ;  // Downcasting 
        obj1.show2() ;




    }
    
}
