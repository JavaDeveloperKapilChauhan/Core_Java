package _89_Constructor_Reference;
import java.util.List ;
import java.util.Arrays ;
import java.util.ArrayList ;


class Student{
    private String name ;
    private int age ;

    public Student(){

    }
    public Student(String name){
        this.name = name ;

    }

    public void setAge(int age){
        this.age = age ;
    }
    public void setName(String name){
        this.name = name ;
    }

    public int getAge(){
        return this.age ;
    }
    public String getName(){
        return this.name ;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    




}

public class Constructor_Reference {
    public static void main(String [] args){


        System.out.println("It is constructor reference program") ;


        List<String> list = Arrays.asList("Isskander Chauhan" ,"Hammir Chauhan" , "Veramdev Chauhan" , "Prithviraj Chauhan") ;
        System.out.println("List list be: " + list) ;

        // List<String>  list1 = list.stream().map(str->str.toUpperCase()).toList() ;

        // List<String> list1 = list.stream().map(String::toUpperCase).toList() ;
        // list1.forEach(System.out::println) ;

        // System.out.println("list1 be: " + list1) ;
        // list1.forEach(System::println) ;


        List<Student> students = new ArrayList<>() ;

        // for(String name: list1){
        //     students.add(new Student(name)) ;

        // }
        // System.out.println("students be: ") ;
        // System.out.println(students) ;

        // students.add(new Student("Isskander Chauhan")) ;

        // students = list.stream().map(str->new Student(str)).toList()  ;
        students = list.stream().map(Student::new).toList()  ;

        System.out.println("students be be: " + students) ;



    }
    
}
