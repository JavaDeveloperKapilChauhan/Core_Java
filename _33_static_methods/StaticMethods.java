package _33_static_methods;




class Mobile{
    String brand ;
    int price;
    static String name ;

    public void show(){
        System.out.println(brand + " , " + price + " , " + name) ;
    }

    public static void show1(Mobile obj){
        System.out.println("in static method " + obj.brand + " , "+ obj.price + " , "+ name) ;
    }
}

public class StaticMethods {

    public static void main(String [] args){

        System.out.println("In static method i can use static variables but we cannot use non static variable in static methods directly") ;

        Mobile obj = new Mobile()  ;
        obj.brand = "Apple"  ;
        obj.price = 1500 ;
        Mobile.name = "SmartPhone"  ;
        
        Mobile obj1 = new Mobile()  ;
        obj1.brand = "Samsung"  ;
        obj1.price = 1700 ;
        Mobile.name = "Phone"  ;
        
        obj.show() ; // obj.name also be Phone
        obj1.show() ;

        // Mobile.show1(obj) ;
        Mobile.show1(obj) ;


    }
    
    
}
