package _27_Encapsulation;
class Human{
    private int age = 24 ;
    private String name = "Isskander Chauhan" ;

    public int getAge(){
        return age ;
    }
    public String getName(){
        return name ;
    }

    public void setAge(int age){
        this.age = age ;
    }
    public void setName(String name){
        this.name = name ;
    }
}

public class Encapsulation {
    public static void main(String [] args){

        Human obj = new Human() ;
        // obj.age = 11 ;
        // obj.name = "Isskander Chauhan"  ;
        obj.setAge(23) ;
        obj.setName("Kapil Chauhan") ;
        System.out.println(obj.getName() + " : " + obj.getAge())  ;
    }
    
}
