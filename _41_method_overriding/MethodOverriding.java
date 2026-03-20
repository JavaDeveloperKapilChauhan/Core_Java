package _41_method_overriding;

class A{

    public void show(){
        System.out.println("in A show") ;
    }
    public void config(){
        System.out.println("in A config");
    }

}
class B extends A{
    public void show(){
        System.out.println("in B show") ;
        // return "Isskander Chauhan"  ;
    }
    public void how(){
        System.out.println("How is going on") ;
    }

}

public class MethodOverriding {
    public static void main(String [] args){
        System.out.println("This is a Method Overriding program") ;

        B obj = new B() ;
        obj.show() ;
        obj.config() ;
        obj.how() ;

    }
    
}
