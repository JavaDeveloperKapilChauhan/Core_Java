package _29_this_keyword;

class Human{
    private int age ;
    private String name ;
    public int getAge() {
        return age;
    }
    public void setAge(int age, Human obj) {
        Human obj1 = obj ;
        obj1.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
}

public class This {
    public static void main(String [] args){

        // this is a current object 
        // this differentiate netween instance and local variables 

        Human obj = new Human()  ;
        obj.setAge(20 , obj) ;
        obj.setName("Hammir Chauhan") ;

        System.out.println(obj.getAge() + " : " + obj.getName()) ;
        System.out.println("Isskander Chauhan is studying this keyword") ;
    }
    
}
