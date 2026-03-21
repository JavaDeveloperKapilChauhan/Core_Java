package _56_enum_if_and_switch;

enum Status{
    Running , Failed , Pending , Success ; 
}

public class Enum_if_and_switch {
    public static void main(String [] args){
        System.out.println("This is enum if and switch program") ;


        Status s = Status.Pending ;

        System.out.println(s) ;

        if(s==Status.Running){
            System.out.println("Goes on") ;
        }
        else if(s==Status.Failed){
            System.out.println("Try again") ;
        }
        else if(s==Status.Pending){
            System.out.println("Please Wait") ;
        }
        else{
            System.out.println("Done") ;
        }

        

        switch(s){

            case Running:
                System.out.println("Going on") ;
                break ;
            case Failed:
                System.out.println("Try again ") ;
                break ;
            case Pending:
                System.out.println("Please wait") ;
                break ;

            default:
                System.out.println("Done") ;
                break ;

        }

        
    }
    
}
