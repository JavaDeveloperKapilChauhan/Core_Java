package _75_Race;

class Counter{
    int count ;

    public synchronized  void increment(){
        count++ ;
    }
}

public class RaceCondition {
    public static void main(String [] args) throws InterruptedException{
        System.out.println("RaceCondition program") ;

        Counter c = new Counter() ;

        Runnable obj1 = ()->{
            for(int i=0; i<1000;i++){
                c.increment() ;
                System.out.println("obj2.count be: " + c.count) ;

            }
        } ;

        Runnable obj2 = ()->{
            for(int i=0 ; i<1000 ;i++){
                c.increment() ;
                System.out.println("obj1.count be: " + c.count) ;

            }
        } ;

        Thread t1 = new Thread(obj1) ;
        Thread t2 = new Thread(obj2) ;

        t1.start() ;
        t2.start() ;

        t1.join() ;
        t2.join() ;
    
        System.out.println("Count be: " + c.count) ;

        
    } 

    
}
