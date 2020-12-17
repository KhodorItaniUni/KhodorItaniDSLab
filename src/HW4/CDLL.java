package HW4;

/**
 *
 * @author khodor
 */
public  class CDLL implements DLLInterface {
    
     private DLLNode head;
     private DLLNode tail;
     private int size;


     public CDLL() {
         this.head = null;
         this.tail = null;
         this.size = 0;
     }
     
     public CDLL(DLLNode head) {
         this.head = this.tail = head;
         this.size = 1;

     }
     
     public CDLL(Object headValue) {
         this.head = this.tail = new DLLNode(headValue);
         this.size = 1;
     }
     
     @Override
     public int size() {
         return this.size;
     }
     
     public void makeEmpty(){
         this.head=this.tail=null;
         this.size=0; //Since it is Int
    }
     
    @Override
     public boolean isEmpty() {
         return this.head == null;
     }
     
     public DLLNode getHeadNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch head.");
        } else {
            return this.head;
        }
    }
     
     public Object getHeadValue() {
         return this.getHeadNode().getValue();
     }
     
     public DLLNode getTailNode() {
         if (isEmpty()) {
             throw new RuntimeException("List is empty! Can't fetch tail.");
         } else {
             return this.tail;
         }
     }
     
     public Object getTailValue() {
         return this.getTailNode().getValue();
     }
     
     
     public DLLNode getNode(int index) {
         if (index < 0 || index >= size()) {
             throw new ArrayIndexOutOfBoundsException();
         } else if (isEmpty()) {
             throw new RuntimeException("Cannot fetch node, list is empty!");
         } else {
             DLLNode currentNode = this.head;
             int counter = 0;
             while (currentNode != this.tail) { 
                 if (counter == index) {
                     return currentNode;
                 }
                 counter++;
                 currentNode = currentNode.getNext();
             }
             throw new RuntimeException("Object at given index is not found!");
         }
     }
     
     @Override
    public Object get(int index) {
        return this.getNode(index).getValue();
    }
    
    @Override
     public int indexOf(Object element) {
         DLLNode currentNode = this.head;
         int counter = 0;
         while (currentNode != this.tail) {
             if (currentNode.getValue().equals(element)) {
                 return counter;
             }
             currentNode = currentNode.getNext();
             counter++;

         }
         return -1;
     }
     
   
     @Override
     public void insertAtFront(Object newElement) {
         if (isEmpty()) {
             this.head = this.tail = new DLLNode(newElement);
             
         } else {
             
             DLLNode nodeToAdd = new DLLNode(newElement, this.head, this.tail);
             tail.setNext(nodeToAdd);
             head.setPrevious(nodeToAdd);
             head = nodeToAdd;
         }
         this.size++;
     }
     
      @Override
    public void insertAtBack(Object newElement) {
        if (isEmpty()) {
             this.head.setValue(newElement);
             this.tail.setValue(newElement);
             
        } else {
            
            DLLNode nodeToAdd = new DLLNode(newElement, this.head, this.tail);
             tail.setNext(nodeToAdd);
             head.setPrevious(nodeToAdd);
             tail = nodeToAdd;
        }
    }
    
    @Override
    public void removeFromFront() {
        if (isEmpty()) {
            throw new RuntimeException("Cannot remove from empty list");
        } else if (this.head.getNext() == null) { 
            makeEmpty();
            
        } else {
            head = head.getNext();
	    head.setPrevious(tail);
	    tail.setNext(head);              
        }
        this.size--;
    }

    @Override
     public void removeFromBack() {
         if (isEmpty()) {
             throw new RuntimeException("Cannot remove from empty list");
         } else if (this.head.getNext() == null) { 
             makeEmpty();
         } else {
             tail = tail.getPrevious();
	     tail.setNext(head);
	     head.setPrevious(tail); 

         }
        this.size--;
     }
    
     public void print() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            DLLNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " --> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("");
        }
    }
}
