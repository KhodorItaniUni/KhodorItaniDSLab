package HW2;


public class LLNode {
    
      Object value;
      LLNode next;
    

    public LLNode() {
    }

    public LLNode(Object value) {
        this.value = value;
    }

    public LLNode(Object value, LLNode next) {
        this.value = value;
        this.next = next;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public LLNode getNext() {
        return next;
    }

    public void setNext(LLNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "LLNode{" + "value=" + value + ", next=" + next + '}';
    }
    
    
    
}
