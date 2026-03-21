package _52_Abstract_Anonymous_Inner_Class;

abstract class A{

    public abstract void show()  ;
    public abstract void config() ;
}
// class B extends A{


//     public void show(){
//         System.out.println("In B show") ;
//     }

    
// }

public class AbstractAnonymousInnerClass {
    public static void main(String [] args){

        System.out.println("It is abstract anonymous Inner Class") ;

        A obj = new A(){

            public void show(){
                System.out.println("Anonymous Inner class have show") ;
            }
            public void config(){
                System.out.println("Anonymous Inner Class have config") ;
            }

        } ;
        obj.show() ;
        obj.config() ;
    }
    
}
