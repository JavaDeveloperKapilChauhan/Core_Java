package _60_Functional_Interface;


@FunctionalInterface
interface A{
    void show()  ;
   
}
// class B implements A{
//     public void show(){
//         System.out.println("In B show") ;
//     }
// }

public class MyFunctionalInterfaces {
    public static void main(String [] args){
        System.out.println("It is a Functional Interface program..") ;


        A obj = new A(){
            public void show(){
                System.out.println("in show") ;
            }
        } ;
        obj.show() ;



    }
    
}

