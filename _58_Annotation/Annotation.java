package _58_Annotation;

class A{
    public void show(){
        System.out.println("in A show") ;
    }

}
class B extends A{
    
    @Override
    public void show(){
        System.out.println("in B show") ;
    }

}

public class Annotation {
    public static void main(String [] args){
        System.out.println("This is a Annotation program") ;
        System.out.println("Annotation is a extra information given to a compiler ar runtime") ;

        A obj = new B() ;
        obj.show() ;
    }
    
}
