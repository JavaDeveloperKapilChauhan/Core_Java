package _74_Runnable_Vs_Thread;

// class A implements Runnable{

//     public void run(){

//         for(int i=0 ; i<5;i++){
//             System.out.println("In A") ;
//         }
//     }
// }

// class B implements Runnable{
//     public void run(){
//         for(int i=0 ; i<5;i++){
//             System.out.println("In B") ;
//         }
//     }
// }

public class RunnableVsThread {
    public static void main(String [] args){
        System.out.println("Runnable Vs Thread") ;

        // Runnable obj1 = new A()  ;
        
        Runnable obj1 = ()->{
            for(int i=0 ; i<5;i++){
                System.out.println("In A") ;
                try{
                    Thread.sleep(10) ;
                }
                catch(InterruptedException e){
                    System.out.println(e) ;
                }
            }
            
        } ;
        // Runnable obj2 = new B() ;

        Runnable obj2 = ()->{
            for(int i=0;i<5;i++){
                System.out.println("In B") ;
                try{
                    Thread.sleep(10) ;
                }
                catch(InterruptedException e){
                    System.out.println(e) ;
                }
            }
        } ;
       
       
        Thread t1 = new Thread(obj1) ;
        Thread t2 = new Thread(obj2) ;
        
        t1.start() ;
        t2.start() ;
    }
    
}
