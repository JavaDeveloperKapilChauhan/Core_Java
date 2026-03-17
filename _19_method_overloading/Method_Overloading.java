package _19_method_overloading;

class Calculator{
    public int add(int n1 , int n2){
        return n1+n2 ;
    }
    public int add(int n1 , int n2 , int n3){
        return n1+n2+n3  ;
    }
    public double add(double n1 , double n2){
        return n1+n2 ;

    }
}

public class Method_Overloading {
    public static void main(String [] args){

        Calculator obj = new Calculator() ;
        int result = obj.add(3,4) ;
        System.out.println(result)  ;

        String s1 = "Isskander"   ;
        String s2 = "Chauhan"  ;
        System.out.println(s1+s2)   ;

    }

    
}






