package HW1;

public class ArrayIsAscending {

   
    
    public static boolean isAscending(int[] khodor){
    for(int i = 1; i < khodor.length; i++){
        if(khodor[i-1] > khodor[i]){  //I check if index 1 is greater than index i-1
            return false;            
        }
    }
    return true;
}
     public static void main(String[] args) {
        int [] khodor ={41, 6, 91, 24, 54, 78}; //previous array
         System.out.println(isAscending(khodor)); //isAscending is my function
    }
}
