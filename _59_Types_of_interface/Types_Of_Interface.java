package _59_Types_of_interface;

interface Normal_interface{
    void show() ;
    void config() ;
}
interface Functional_interface{
    void show() ;

}

interface Marker_interface{
    
}

public class Types_Of_Interface {
    public static void main(String [] args){

        System.out.println("Types of interface program") ;

        System.out.println("Interface are of three types--") ;
        System.out.println("1. Normal Interface\n2. Functional/Sam Interface\n3. Marker Interface") ;

        System.out.println("Normal interface have two or more public abstract methods.") ;
        System.out.println("Functional interface can have only one public abstract methods.") ;
        System.out.println("Marker interface can not have any methods and field , mark interface is used to mark a class and provides meta data about class ") ;
    

    }

    
}
