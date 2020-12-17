
package HW4.CSLL;

/**
 *
 * @author khodor
 */
public class SLLNode {
    

    private Object value;
    private SLLNode next;
    
    

    public SLLNode() {
    }

    public SLLNode(Object value) {
        this.value = value;
    }

    public SLLNode(Object value, SLLNode next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public SLLNode getNext() {
        return next;
    }

    public void setNext(SLLNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" + "value=" + value + ", next=" + next + '}';
    }
}

