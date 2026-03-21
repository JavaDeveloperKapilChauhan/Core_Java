package _50_Abstract_Keyword;

abstract class Car{

    public abstract void drive();
    public abstract void fly() ;

    public void playMusic(){
        System.out.println("play music") ;
    }

}

abstract class WagonR extends Car{

    public void drive(){
        System.out.println("Driving ...") ;
    }

}
class UpdatedWagonR extends WagonR{

    public void fly(){
        System.out.println("Flying car") ;

    }

}

public class AbstractKeyword {
    public static void main(String [] args){

        System.out.println("A class is declared with abstract keyword known to be abstract class.") ;
        System.out.println("Abstract method does not have body") ;
        System.out.println("We cannot create object of Abstract class") ;

        Car c = new UpdatedWagonR()  ;
        c.fly() ;





    }
    
}
