package _31_parameterized_constructor;

class Human{

    private int age ;
    private String name ;

    public Human(){
        age = 20 ;
        name = "Kapil Chauhan"  ;
    }
    public Human(int age , String name){
        this.age = age ;
        this.name = name ;
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

public class ParameterizedConstructor {
    public static void main(String [] args){

        Human obj1 = new Human()  ;
        Human obj2 = new Human(21 , "Isskander Chauhan") ;

        System.out.println(obj1.getName() + " : "+ obj1.getAge()) ;
        System.out.println(obj2.getName() + " : " + obj2.getAge()) ;



    }
    
}
