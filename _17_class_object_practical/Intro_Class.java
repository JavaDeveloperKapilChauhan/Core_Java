package _17_class_object_practical;



public class Intro_Class {
    public int add(int n1 , int n2 ){
    System.out.println("add") ;
    int result = n1 + n2 ;
    return result ;
}
    public static void main(String [] args){
        Intro_Class obj = new Intro_Class()  ;
        int result = obj.add(4,5) ;
        System.out.println(result) ;


    }
    
}
