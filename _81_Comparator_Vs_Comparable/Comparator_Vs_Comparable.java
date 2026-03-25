package _81_Comparator_Vs_Comparable;

import java.util.List ;
import java.util.ArrayList ;
import java.util.Collections ;
import java.util.Comparator ;



class Student{
    int id ;
    String name ;

    public Student(int id , String name){
        this.id = id;
        this.name = name ;
        
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }



    
    


    

}
public class Comparator_Vs_Comparable {

    public static void main(String [] args){

        System.out.println("This is a Comparator Vs Comparable program") ;


        // Comparator<String> com = new Comparator<String>(){

        //     public int compare(String i , String j){
        //         if(i.length() > j.length()){
        //             return 1 ;
        //         }
        //         else{
        //             return -1 ;
        //         }
        //     }

        // };

        Comparator<String> com = (i ,  j)-> i.length()>j.length() ? 1 : -1 ;

            

    

        List<String> list = new ArrayList<>() ;

        list.add("Hammir Chauhan") ;
        list.add("Isskander Chauhan") ;
        list.add("Himmat") ;

        System.out.println("List before sorting: ") ;
        System.out.println(list) ;

        Collections.sort(list,com ) ;
        System.out.println("List after sorting ") ;
        System.out.println(list) ;


        List<Student> students = new ArrayList<>() ;

        students.add(new Student(4,"Vasudev Chauhan")) ;
        students.add(new Student(2,"Viramdev Chauhan")) ;
        students.add(new Student(3,"Gobindraj Chauhan")) ;
        students.add(new Student(1, "Prithviraj Chauhan")) ;

        System.out.println("students be: ") ;
        System.out.println(students) ;



        for(Student s : students){
            System.out.println(s + " ") ;
        }

        Comparator<Student> com2 = new Comparator<Student>(){

            public int compare(Student s1 , Student s2){

                if(s1.id > s2.id){
                    return 1 ;
                }
                else{
                    return -1 ;
                }

            }
        } ;

        System.out.println("Students list after sorting on th id") ;

        Collections.sort(students , com2) ;

        for(Student s: students){
            System.out.println(s) ;
        }







    }
    
}
