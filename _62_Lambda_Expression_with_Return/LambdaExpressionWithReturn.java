package _62_Lambda_Expression_with_Return;

@FunctionalInterface
interface A{
    int add(int a , int b ) ;
}

public class LambdaExpressionWithReturn {

    public static void main(String [] args){

        System.out.println("Lambda Expression with Return Type, Lambda Expression only work with functional interface") ;

        A obj = (a,b)->  a+b ;
        

        System.out.println(obj.add(7,10) );

    }
    
}
