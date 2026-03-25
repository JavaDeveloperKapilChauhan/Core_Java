package _80_Map;
import java.util.Map ;
import java.util.HashMap ;

public class Maps {
    public static void main(String [] args){

        System.out.println("It is Map program") ;
        System.out.println("Map is a interface ") ;
        System.out.println("Map is a collection of Key and value pairs") ;
        
        Map<String,Integer> students = new HashMap<>() ;

        students.put("Isskander Chauhan" ,12 ) ;
        students.put("Hammir Chauhan" , 13) ;
        students.put("Prithviraj Chauhan" ,14) ;
        students.put("Vighayraj chauhan" , 1) ;
        students.put("Isskander Chauhan", 90) ;
        students.put("Hammir Chauhan", 90) ;

        System.out.println(students) ;

        System.out.println("Fetching on value of Map--") ;
        System.out.println(students.get("Isskander Chauhan")) ;

        System.out.println("All Keys of Map are--") ;
        System.out.println(students.keySet()) ;

        System.out.println() ;
        System.out.println("Looping on Keys of Map ") ;
        for(String key: students.keySet()){
            System.out.println(key+ " : " + students.get(key)) ;
        }

        System.out.println("Values of Map") ;
        System.out.println(students.values()) ;

        System.out.println("Looping to values of Map") ;
        for(int value : students.values()){
            System.out.print(value + " ") ;

        }




    }
    
}
