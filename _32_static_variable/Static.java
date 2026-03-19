package _32_static_variable;

class Mobile{
    String brand ;
    int price;
    static String name ;

    public void show(){
        System.out.println(brand + " , " + price + " , " + name) ;
    }
}

public class Static {
    public static void main(String [] args){

        // static variable 
        // a variable which is declared with static keyword known as static variable
        System.out.println("Static variable is shared by all variables") ;
        System.out.println("We can call static variable by class Name also.") ;


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


    }
    
}
