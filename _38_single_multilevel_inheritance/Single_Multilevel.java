package _38_single_multilevel_inheritance;

public class Single_Multilevel {
    public static void main(String[] args) {
        VeryAdvCalc obj = new VeryAdvCalc();

        int r1 = obj.add(4, 5);
        int r2 = obj.sub(7, 3);
        int r3 = obj.multi(5, 3);
        int r4 = obj.div(15, 4);
        double r5 = obj.power(4 ,1) ;

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5) ;
        System.out.println("It is a single level and mutilvel inheritance program.");

    }

}
