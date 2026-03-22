package _61_Lambda_Expression;


@FunctionalInterface
interface A{
    void show(int i, int j) ;
}

public class LambdaExpression {
    public static void main(String [] args){
        System.out.println("Lambda expression program") ;

        System.out.println("Lambda Expression is used with Functional Interface") ;


        // A obj = new A(){

        //     public void show(){
        //         System.out.println("in show") ;
        //     }
        // } ;

        A obj =(i ,  j)-> System.out.println("in show " + i + " : " + j) ;
        obj.show(7, 8) ;



    } 
    
}
