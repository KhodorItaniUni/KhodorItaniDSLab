package HW3;


public class Test {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        System.out.println("LinkedList1:");
        ll.print();
        
        LinkedList ll2 = new LinkedList();
        ll2.add(5);
        ll2.add(6);
        ll2.add(7);
        ll2.add(8);
        System.out.println("LinkedList2:");
        ll2.print();
        
        System.out.println("Merged Lists:");
        LinkedList mergedList = LinkedList.merge(ll, ll2);
        mergedList.print();
    }
    
}
