package HW4.CSLL;

/**
 *
 * @author khodor
 */
public interface CSLLInterface {

    
    int size();

    
    boolean isEmpty();

    
    Object get(int index);

    
    int indexOf(Object element);

    
    void add(Object newElement);

    
    void remove();

    
    Object remove(int index);

    
    Object remove(Object element);
    
    
    void print();
}

