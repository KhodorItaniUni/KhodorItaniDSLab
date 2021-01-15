
package Quiz;


public interface StackInterface {

    boolean isEmpty();

    void makeEmpty();

    Object peek();

    //similar to insertAtFront
    void push(Object value);

    //similar to removeFromFront
    void pop();

    void print();

}