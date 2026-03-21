package _55_enum;

enum Status{
    Runnings ,Failed , Pending , Success ; 
}

public class Enum {
    public static void main(String [] args){

        System.out.println("This is a enum program.") ;

        Status s = Status.Success ;

        System.out.println("s be: "+s) ;
        System.out.println("s.ordinal() be: "+s.ordinal()) ;

        Status[] ss = Status.values() ;
        System.out.println("ss be : " ) ;

        for(Status a: ss){
            System.out.println(a + " : " + a.ordinal() ) ;
 ;
        }

    }
    
}
