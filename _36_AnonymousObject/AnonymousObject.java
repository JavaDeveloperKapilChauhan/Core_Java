package _36_AnonymousObject;

class A{

    public A(){
        System.out.println("a constructor") ;
    }
    public void show(){
        System.out.println("a show method") ;
    }



}

public class AnonymousObject {
    public static void main(String [] args){

        new A() ; // anonymous object 
        new A().show()  ;


    }
    
}
