package _21_multidimensional_array;




public class Multidimensional {
    public static void main(String [] args){

        // int input = 0 ; 
        
        int nums[][]  = new int[3][4]   ;
        
        for(int i=0 ; i<nums.length; i++){
            
            for(int j=0 ; j<nums[0].length ; j++){
                   nums[i][j]  = (int)(Math.random()*10) ;
                  

            }
            
        }


        System.out.println("Array be by simple for loop:  ") ;

        for(int i=0 ; i<nums.length; i++){
            
            for(int j=0 ; j<nums[0].length ; j++){
  
                System.out.print(nums[i][j] + " ") ;
            }
            System.out.println() ;
            
        }


        System.out.println("Array by for each loop:   ") ;

        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ")  ;
            }
            System.out.println() ;
        }






    }
    
}
