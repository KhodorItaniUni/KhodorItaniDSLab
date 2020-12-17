package HW4;
/**
 *
 * @author khodor
 */
    public interface DLLInterface {

    
    int size();

    
    boolean isEmpty();

    
    Object get(int index);

    
    int indexOf(Object element);

    
    void insertAtBack(Object newElement);
    
    
    void insertAtFront(Object newElement);

    
    void removeFromBack();
    
    
    void removeFromFront();

    
    void print();
}

