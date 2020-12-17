package HW4.CSLL;

/**
 *
 * @author khodor
 */
public class CSLL {
    private SLLNode head; 
    private SLLNode tail;
    private int size;
    
    public CSLL() {
         this.head = null;
         this.tail = null;
         this.size = 0;
     }
    
    public  boolean isEmpty() {
        return size == 0;
    }
    
    public int get(){
        return size;
    }
    
    public void remove(){
        if (isEmpty()) {
        System.out.println("List Empty !!");
    }
   
    }
    
    
}
