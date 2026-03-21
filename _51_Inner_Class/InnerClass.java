package _51_Inner_Class;

class A{
    int age ;
    
    public void show(){
        System.out.println("in show") ;
    }

    static class B{
        public void config(){
            System.out.println("in config") ;
        }


    }
}

public class InnerClass {
    public static void main(String [] args){

        System.out.println("A class within a class known as inner class") ;

        A obj = new A() ;
        obj.show() ;

        // A.B obj1 =  obj.new B() ;  // if B is not static class 
        A.B obj1 =  new A.B() ;   // if B is a static class 
        obj1.config() ;    


    }
    
}
