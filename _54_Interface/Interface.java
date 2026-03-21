package _54_Interface;

interface A{

    int age = 21 ; // final and static by default
    String city = "Jaipur"  ; // final and static by default

    void show() ;    // public and abstract by default
    void config() ;  // public and abstract by default

}
interface B{
    void run() ;
}
interface X extends A{
    
}

class C implements A,B{
    public void show(){
        System.out.println("in C show") ;
    }
    public void config(){
        System.out.println("in C config") ;
    }
    public void run(){
        System.out.println("run in C") ;
    }
    // System.out.println(age) ;
}

public class Interface {
    public static void main(String [] args){
        System.out.println("Interface Program") ;
        System.out.println("Interface is like class which have all methods as public and abstract by default") ;
        System.out.println("All the variables in interface are final and static") ;

        A obj ; 
        obj = new C() ;
        obj.show() ;
        obj.config() ;
        

        System.out.println(A.age) ;


    }
    
}
