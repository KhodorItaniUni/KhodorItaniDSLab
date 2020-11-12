package HW2;

public class LLTest {

    
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println("LinkedList1:");
        ll.Print();
        
        LinkedList ll2 = new LinkedList();
        ll2.add(5);
        ll2.add(6);
        ll2.add(7);
        ll2.add(8);
        System.out.println("LinkedList2:");
        ll2.Print();
        
        
        
    }
    
   
    
   
    private LLNode head;
    public void merge(LinkedList ll1, LLNode ll2){
         
           LLNode currentNode = this.head;
           
           LinkedList ll = new LinkedList(this.head);
              while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
                ll.add(currentNode);
         }
         
          LLNode head2 = ll.getHeadNode();
          
          currentNode.setNext(new LLNode(head2));
              while (currentNode.getNext() != null){
                  currentNode = currentNode.getNext();
                  ll.add(currentNode);}
        
           //return ll;
     }
    
}
