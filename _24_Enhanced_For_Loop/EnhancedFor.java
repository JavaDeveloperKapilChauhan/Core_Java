package _24_Enhanced_For_Loop;

class Student{
    int Rollno ;
    String name ;
    int marks ;
}

public class EnhancedFor {
    public static void main(String [] args){


        // Enhanced For Loop
        Student s1 = new Student()  ;
        s1.Rollno = 1 ;
        s1.name = "Hammir Chauhan"  ;
        s1.marks = 90 ;

        Student s2 = new Student() ;
        s2.Rollno = 2 ;
        s2.name = "Prithviraj Chauhan"  ;
        s2.marks = 89 ;

        Student s3 = new Student() ;
        s3.Rollno = 3 ;
        s3.name = "Isskander Chauhan"  ;
        s3.marks = 88 ;


        Student[] students = new Student[3] ;
        students[0]  = s1 ;
        students[1] = s2 ;
        students[2] = s3 ;


        System.out.println("Below is a for Each loop: ") ;

        for(Student s: students){
            System.out.println("Rollno be: " + s.Rollno + ", Name be: "+ s.name + ", marks be: " + s.marks) ;
        }


    }
    
}
