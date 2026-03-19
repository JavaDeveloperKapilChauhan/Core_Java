package _30_constructor;

class Human{

    private int age ; 
    private String name ;


    public Human(){
        age = 12 ;
        name = "John"  ;
        System.out.println("I am a constructor")  ;
    }


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

public class Constructor {
    public static void main(String [] args){

        Human obj = new Human()  ;
        System.out.println(obj.getName() + " : " + obj.getAge()) ;


    }
    
}
