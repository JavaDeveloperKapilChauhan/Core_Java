package _22_Jagged_Array;

public class Jagged {

    public static void main(String [] args){
        // Jagged Array 
        // Jagged Array is a array in which we do not sure the size of columns in a row 

        int [][] nums = new int[3][]  ;

        nums[0]  = new int[3]  ;  // defining columns for each row 
        nums[1] = new int[4]  ;
        nums[2] = new int[2]  ;

        // System.out.println("Assigning values to the array:  ")  ;

        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums[i].length ; j++){
                nums[i][j]  = (int)(Math.random()*10) ;
            }

        }

        System.out.println("Array by for loop be: ") ;
        for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<nums[i].length ; j++){
                System.out.print(nums[i][j]+ " ") ;
            }
            System.out.println() ;
        }


        System.out.println("Array by for each loop be: ") ;

        for(int n[] : nums){
            for(int m : n){
                System.out.print(m + " ") ;
            }
            System.out.println() ;
        }


    }
    
}



