package _28_getters_setters;

class Human{
    private int age ;
    private String name ;

    public int aAge(){
        return age ;
    }
    public String aName(){
        return name ;
    }

    public void sAge(int age){
        this.age = age ;
    }
    public void sName(String name){
        this.name = name ;
    }

}

public class Getters_Setters {
    public static void main(String [] args){

        Human obj = new Human() ;
        obj.sAge(20) ;
        obj.sName("Isskander Chauhan") ;
        System.out.println(obj.aAge() + " : " + obj.aName()) ;

        System.out.println("Isskander Chauhan is studying getters and setter") ;


    }
    
}
