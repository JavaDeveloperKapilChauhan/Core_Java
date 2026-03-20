package _46_final_keyword;

class Calc{
    public final void show(){
        System.out.println("in Calc show") ;

    }

    public void add(int a , int b){
        System.out.println(a+b) ;
    }

}

class AdvCalc extends Calc{


}

public class Final {
    public static void main(String [] args){

        System.out.println("Final keyword can we used with class , variables and methods") ;
        System.out.println("By declaring a final with a class prevents it from inheriting by some other class") ;
        System.out.println("By declaring a final with a variable prevents it from ressigning") ;
        System.out.println("By declaring a final with method , it prevents method overriding of a method") ;

        final int a = 78 ;

        AdvCalc obj = new AdvCalc()  ;
        obj.show() ;
        

    }
    
}
