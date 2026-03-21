package _49_Wrapper_Class;

public class WrapperClass {
    public static void main(String[] args) {

        System.out.println(
                "Java is not purely Object Oriented Language\nbecause it support primitive data tyeps such as integer");
        System.out.println(
                "Every primitive data type(int , char , double) extends a class called Wrapper Class\n(such as int extends Integer and Integer extends Object class");
        int num = 45;

        // Integer n = new Integer(num) ; // boxing
        Integer n = num; // boxing
        System.out.println(n);

        // int n1 = n.intValue() ; // unboxing
        int n1 = n;  // Auto-unboxing

        System.out.println("n1 be: " + n1);

        String s = "12" ;
        int s1 = Integer.parseInt(s) ;
        System.out.println("s1 be: "+ s1) ;

    }

}
