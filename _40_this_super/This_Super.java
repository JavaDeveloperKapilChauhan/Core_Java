package _40_this_super;

class A{
    public A(){
        System.out.println("in A") ;
    }
    public A(int n){
        System.out.println("in A int") ;
    }

}
class B extends A{

    public B(){
        // super() keyword reference on parent class constructor 
        super(6) ;
        System.out.println("in B") ;
    }
    public B(int N){
        this() ;  // this() keyword reference to current class constructor
        System.out.println("in B int") ;
    }

}

public class This_Super {
    public static void main(String [] args){
        B obj = new B(4)  ;



    }
    
}
