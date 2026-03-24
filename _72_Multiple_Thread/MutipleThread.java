package _72_Multiple_Thread;

class A extends Thread{

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("A is running") ;
        }
    }

}

class B extends Thread{

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("B is running") ;
        }

    }


}

public class MutipleThread {
    public static void main(String [] args){

        System.out.println("It is a Multiple thread program");

        A obj1 = new A() ;
        B obj2 = new B() ;

        obj1.start() ;
        obj2.start() ;

    }
    
}
