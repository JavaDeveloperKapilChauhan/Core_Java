package _73_Thread_Priority_Sleep;

class A extends Thread{

    public void run(){
        for(int i=0; i<100;i++){

            System.out.println("A ");

            try{
                Thread.sleep(10) ;
            }
            catch(InterruptedException e){
                System.out.println(e) ;
            }

        }
    }

}

class B extends Thread{

    public void run(){

        for(int i=0;i<100;i++){
            System.out.println("B") ;

            try{
                Thread.sleep(10);
            }
            catch(InterruptedException e){
                System.out.println(e) ;
            }



        }

    }

}

public class Thread_Priority_Sleep {
    public static void main(String [] args){

        System.out.println("Thread Priority program") ;

        A obj1 = new A() ;
        B obj2 = new B() ;

        // obj1.setPriority(Thread.MIN_PRIORITY) ;
        // obj2.setPriority(Thread.MAX_PRIORITY) ;
        // obj1.setPriority(Thread.NORM_PRIORITY-1) ;

        // System.out.println("obj1 Priority be: "+obj1.getPriority()) ;
        // System.out.println("obj2 Priority be: "+obj2.getPriority()) ;

        obj1.start() ;
        obj2.start() ;




    }
    
}
