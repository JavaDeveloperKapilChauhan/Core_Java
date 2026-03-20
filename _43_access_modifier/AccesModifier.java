package _43_access_modifier;
import _43_access_modifier.other.* ;

class C extends A{
    
    public void abc(){
        System.out.println(marks) ;
     }

}


public class AccesModifier extends A{
    public void bca(){
        System.out.println(marks) ;
    }
    public static void main(String [] args){

        // C obj1 = new C() ;
        AccesModifier obj1 = new AccesModifier() ;
        System.out.println("marks be: "+marks) ;

        B obj2 = new B()  ;
        System.out.println("obj2.marks be: "+obj2.marks) ;

    }
    
}
