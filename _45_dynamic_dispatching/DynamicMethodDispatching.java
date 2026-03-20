package _45_dynamic_dispatching;

class A{
    public void show(){
        System.out.println("In A show") ;
    }
}
class B extends A{
     public void show(){
        System.out.println("In B show") ;
    }

}
class C extends B{
    public void show(){
        System.out.println("In C show") ;
    }
}

public class DynamicMethodDispatching {
    public static void main(String [] args){

        System.out.println("Dynamic dispatching is a Runtime Polymorphism.") ;

        A obj = new A() ;
        obj.show() ;

        obj = new B() ;
        obj.show() ;

        obj = new C() ;
        obj.show() ;


    }
    
}
