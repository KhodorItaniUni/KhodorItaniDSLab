package HW3;


public class LinkedList implements ListInterface {

    private Node head;

    public LinkedList() {
        this.head = null;
    }

    public LinkedList(Node head) {
        this.head = head;
    }

    public LinkedList(Object nodeValue) {
        this.head = new Node(nodeValue);
    }

    @Override
    public int size() {
        if (isEmpty()) {
            return 0;
            //you can also check here if head.getNext() == null to return 1
            //but it's not necessary as it will be checked in the loop
        } else {
            Node currentNode = this.head;
            int count = 0;
            while (currentNode != null) {
                currentNode = currentNode.getNext();
                count++;
            }
            return count;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.head == null;
 
    }

    
    public void makeEmpty() {
        this.head = null;
    }

    @Override
    public void add(Object newElement) {
        if (head == null) { 
            head = new Node(newElement);
        } else {
            Node currentNode = head;
            while (currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(new Node(newElement));
        }
    }

    public Node getHeadNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch head.");
        } else {
            return this.head;
        }
    }

    public Object getHeadValue() {
        return this.getHeadNode().getValue();
    }

    public Node getTailNode() {
        if (isEmpty()) {
            throw new RuntimeException("List is empty! Can't fetch tail.");
        }
        Node currentNode = head;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        return currentNode;
    }

    public Object getTailValue() {
        return this.getTailNode().getValue();
    }

    
    public Node getNode(int index) {
  
        Node currentNode = this.head;
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

    @Override
    public Object get(int index) {
        return this.getNode(index).getValue();
    }

    
    @Override
    public int indexOf(Object element) {
        Node currentNode = this.head;
        int index = 0;
        while (currentNode != null) {
            if (currentNode.getValue().equals(element)) {
                return index;
            }
            index++;
            currentNode = currentNode.getNext();
        }
        return -1;
    }

    
    @Override
    public void remove() {
        if (isEmpty()) {
            throw new RuntimeException("Empty List :)");
        }
         else
         {
             Node currentNode = head;
             while(currentNode != null)
                 {
                     if(currentNode.next == null)
                         {
                             currentNode = null;
                         }
                     currentNode = currentNode.next;

             }
        }
    }

    @Override
    public Object remove(int index) {
           if(index >= size()){
             } else {
             Node currentNode = head;
             for(int i=0; i<index-1;i++){ //For Loop
             currentNode=currentNode.getNext();
             }
             currentNode.setNext(currentNode.getNext().getNext());
          
     }
       throw new UnsupportedOperationException("Not supported yet.");    
    }

    @Override
    public boolean remove(Object element) {
     Node currentNode = head;
         Node pastNode;
         while(currentNode != null) //While Loop
         {
             if(currentNode.value.equals(element))
             {
                 pastNode = currentNode.next;
                 currentNode = null;
                 return true; 
             }
             currentNode=currentNode.next;
         }

         return false;
     }


    
    public static LinkedList merge(LinkedList list1, LinkedList list2) {
        //TODO: add logic here
        
        //list1: 1 => 2 => 3
        //list2: 4 => 5 => 6
        //list3: 1 => 2 => 3 => 4 => 5 => 6
        
        if (list1.isEmpty()) //if list1.head == null
        {
            return list2;
        }
        if (list2.isEmpty()) {
            return list1;
        }

        if (list1.isEmpty() && list2.isEmpty()) {
            throw new RuntimeException();
        }
        
        //first way
//        LinkedList mergedList1 = new LinkedList();
//
//        Node head1 = list1.head; //or list1.getHeadNode();
//        Node head2 = list2.head; //or list2.getHeadNode();
//
//        Node tail1 = list1.getTailNode();
////        Node tail2 = list2.getTailNode(); I didn't use it
//
//        mergedList1.head = head1;
//        tail1.setNext(head2);

        //second way
        LinkedList mergedList2 = list1;
        mergedList2.getTailNode().setNext(list2.head);

        return mergedList2; //or uncomment first way, comment second way, and return mergedList1 to test first way;
    }

    void print() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            Node currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getValue() + " --> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("");
        }
    }
}
