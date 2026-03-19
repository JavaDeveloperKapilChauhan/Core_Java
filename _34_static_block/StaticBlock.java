package _34_static_block;

class Mobile{
    String brand ;
    int price ;
    static String name ;


    public Mobile(){
        brand = ""  ;
        price = 200 ;
        System.out.println("I am a constructor") ;
        // name = "Phone"  ;
    }

     static {
        name = "Phone"  ;
        System.out.println("Static block") ;

    }

    public void show(){
        System.out.println(brand + " : " + price + " : " + name) ;
    }

}

public class StaticBlock {
    public static void main(String [] args) throws ClassNotFoundException {


        System.out.println("In static variable we initialize the static variable.") ;
        System.out.println("Static variables called only once, irrespective of number of objects") ;

        // Mobile obj = new Mobile()  ;
        // obj.brand = "Apple"  ;
        // obj.price = 1700 ;
        // Mobile.name = "SmartPhone" ;

        // Mobile obj2 = new Mobile() ;

        Class.forName("_34_static_block.Mobile") ; // This .forName method is used to load the class 
         
    }
    
}
