package HW2;


public class LinkedList {
    
    LLNode head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(LLNode head) {
        this.head = head;
    }
    
    public LinkedList(Object nodeValue) {
        this.head = new LLNode(nodeValue);
    }
    
    /****************************************************///isEmpty
    public boolean isEmpty() // Returns if list is empty
  	{
  	return this.head == null; 
  	}
    /****************************************************///makeEmpty
    
    public void makeEmpty() // Clear list
	{
		this.head = null;
	}
    /****************************************************///Size
    public int size() {
        if (isEmpty())
	  return 0;
        
        LLNode currentNode = this.head;
        int counter=1;
		while(currentNode.getNext()!=null)
		{
	          currentNode=currentNode.getNext();
		  counter++;
                }
          return counter;
     }
    /****************************************************///Add
    public void add(Object newElement) {
         
          if(isEmpty()) {
          head = new LLNode(newElement);
          } else {
                 LLNode currentNode = head;
                 while (currentNode.getNext() != null) {
                 currentNode = currentNode.getNext();
             }
                 currentNode.setNext(new LLNode(newElement));
         }
    }
    /****************************************************///getHeadNode
    public LLNode getHeadNode() {
         if (isEmpty()) {
             throw new RuntimeException("List is empty! Can't fetch head.");
         } else {
             return this.head;
         }
     }
    /****************************************************///getHeadValue
    public Object getHeadValue() {
         return this.getHeadNode().getValue();
     }
    /****************************************************///getTailNode
    public LLNode getTailNode() {
         if (isEmpty()) {
             throw new RuntimeException("List is empty! Can't fetch tail.");
         }
         //initialize
         LLNode currentNode = head;
         while (currentNode.getNext() != null) {
             currentNode = currentNode.getNext();
         }
         return currentNode;
     }
    /****************************************************///getTailValue
    public Object getTailValue() {
         return this.getTailNode().getValue();
     }
    /****************************************************///getNode
    public LLNode getNode(int index) {
         if (index < 0 || index >= size()) {
             throw new ArrayIndexOutOfBoundsException();
         } else if (isEmpty()) {
             throw new RuntimeException("Cannot fetch node, list is empty!");
         } else {
             LLNode currentNode = this.head;
             int i = 0;
             while (currentNode != null) {
                 if (i == index) {
                     return currentNode;
                 }
                 i++;
                 currentNode = currentNode.getNext();
             }
             throw new RuntimeException("Object at given index is not found!");
         }
     }
    /****************************************************/
    public Object get(int index) {
         return this.getNode(index).getValue();
     }
    /****************************************************/
    public int indexOf(Object element) {
         LLNode currentNode = this.head;
         int index = 0;
         while (currentNode != null) {
             if(currentNode.getValue().equals(element)) {
                 return index;
             }
             index++;
             currentNode= currentNode.getNext();
         }
         throw new RuntimeException("Index of given object is not found!");

     }
    /****************************************************/
    public Object remove(int index) {
         if(index >= size()){
             } else {
             LLNode currentNode = head;
             for(int i=0; i<index-1;i++){
             currentNode=currentNode.getNext();
             }
             currentNode.setNext(currentNode.getNext().getNext());
          
     }
       throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /****************************************************///Print
    public void Print() 
  	{
  		if (this.isEmpty()) 
  		System.out.println("The list is empty.");
  		else
  		{
                LLNode currentNode = this.head;
  		while (currentNode != null) 
  			{
  				System.out.print(currentNode.getValue().toString() + " --> ");
  				currentNode = currentNode.getNext();
  			}
  			System.out.println("");
  		}
  	} 	
    
    
}
    

