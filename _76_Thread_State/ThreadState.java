package _76_Thread_State;

public class ThreadState {

    public static void main(String [] args){

        System.out.println("Thread State Program") ;

        System.out.println("States of the Threads are: ") ;
        System.out.println("1.new State- Thread is created in nwe State") ;
        System.out.println("2.Runnable state-- In thread.start() method Thread is in running state, CPU or scheduler is not allocated to Thread in Runnable state") ;
        System.out.println("3.Running state -- In thread.start() method thread is in Running state and a CPU or scheduler is allocated to a thread") ;
        System.out.println("4.Waiting State-- In thread.sleep() method , thread is in Waiting State") ;
        System.out.println("5.Dead State-- In thread.stop() method or when thread execution is complete it is in Dead state") ;
        System.out.println("new state\nRunnable state\nRunning state\nWaiting State\nDead State") ;
    }
    
}
