package _18_methods;



class Computer{

    public void playMusic(){
        System.out.println("Playing Music") ;

    }

    public String getMePen(int cost){

        if(cost >= 10){
            return "Pen"  ;
        }
        
        return "Nothing"   ;
        
    }

}

public class Methods {


    public static void main(String [] args){

        Computer obj = new Computer()   ;
        obj.playMusic();
        String str = obj.getMePen(2);
        System.out.println(str);
        


    }
    
}
