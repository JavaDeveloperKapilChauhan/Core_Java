package _57_enum_class;

enum Status{
    Running , Pending , Failed , Success ;
}

enum Laptop{
    MacBook(2000) , HP , Dell(500) ;

    private int price ;

    private Laptop(){

    }

    private Laptop(int price){
        this.price = price ;
    }
    public void setPrice(int price){
        this.price = price ;
    }
    public int getPrice(){
        return this.price ;
    }


}

public class Enum_Class {
    public static void main(String [] args){

        System.out.println("This is enum class program") ;
        Status s1 = Status.Running ;

        Status[] s = Status.values() ;

        for(Status ss : s ){
            System.out.println(ss + " : " + ss.ordinal()) ;
        }

        switch(s1){
            case Running:
                System.out.println("Going on") ;
                break ;

            case Pending:
                System.out.println("Wait ") ;
                break ;
            case Failed:
                System.out.println("Try again") ;
                break ;
            case Success:
                System.out.println("Done") ;
                break ;
        }

        Laptop lap = Laptop.MacBook ;
        System.out.println(lap + " : " + lap.getPrice()) ;
        // System.out.println("price be: " + lap.getPrice()) ;

        Laptop lap1 = Laptop.Dell ;
        System.out.println(lap1 + " : " + lap1.getPrice()) ;
        lap1.setPrice(800) ;

        Laptop[] l = Laptop.values() ;


        for(Laptop la : l){
            System.out.println(la + " : " + la.getPrice()) ;

        }



    }
    
}
