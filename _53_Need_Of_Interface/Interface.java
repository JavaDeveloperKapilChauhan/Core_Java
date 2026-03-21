package _53_Need_Of_Interface;

interface Computer{
    void code() ;
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Coding on Laptop") ;
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("Coding on Desktop") ;
    }
}

class Developer{
    public void devApp(Computer lap){
        lap.code() ;
    }
}

public class Interface {
    public static void main(String [] args){

        System.out.println("Need of Interface") ;

        Computer lap = new Laptop() ;
        Computer desk = new Desktop() ;

        Developer obj1 = new Developer() ;
        obj1.devApp(lap) ;
        obj1.devApp(desk) ;


    }
    
}
