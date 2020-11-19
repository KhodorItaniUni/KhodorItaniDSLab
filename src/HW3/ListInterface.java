package HW3;


public interface ListInterface {
    
    int size();
    
    
    boolean isEmpty();
    
    void add (Object newElement);
    
    
    Object get(int index);
    
    
    int indexOf(Object element);
    
    
    void remove();
    
    
    Object remove (int index);
    
  
    boolean remove (Object element);
}

