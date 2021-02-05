
package FinalLab;


public class BSTNode {

    private Object value;
    private BSTNode left;
    private BSTNode right;

    public BSTNode(Object value) {
        this.value = value;
        this.left = this.right = null;
    }

    public BSTNode(Object value, BSTNode left, BSTNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Object getValue() {
        return value;
    }

    public BSTNode getLeft() {
        return left;
    }

    public void setLeft(BSTNode left) {
        this.left = left;
    }

    public void setLeft(Object value) {
        this.left = new BSTNode(value);
    }

    public BSTNode getRight() {
        return right;
    }

    public void setRight(BSTNode right) {
        this.right = right;
    }

    public void setRight(Object value) {
        this.right = new BSTNode(value);
    }

    public boolean isLeaf() {
        return this.left == null && this.right == null;
    }
}
