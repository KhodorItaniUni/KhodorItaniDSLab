
package Lab1;


public class ArrayExample {

    
    
    public static void contains(int value, int[] array){
        
        boolean found = false;
        for(int i=0; i<array.length;i++){
            if(value == array[i]){
                found = true;
                break;
                
            
        }  
        }
        
        if(found){
            System.out.println(value + "is found");
        }
        else {
            System.out.println(value + "is not found");
        }
    }
            
    public static void main(String[] args) {
        int [] array ={41, 6, 91, 24, 54, 78};
        
        contains(5,array);
        contains(54,array);
    }
    
}
