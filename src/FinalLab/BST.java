
package FinalLab;



public class BST {

    private BSTNode root;

    public BST() {
        this.root = null;
    }

    public BST(BSTNode root) {
        this.root = root;
    }

    public BST(Object value) {
        this.root = new BSTNode(value);
    }

    public BSTNode getRoot() {
        return this.root;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void makeEmpty() {
        this.root = null;
    }

    //Left => Node => Right
    public void printInOrder() {
        if (root == null) {
            System.out.println("Binary Tree is empty");
        } else {
            printInOrder(root);
        }
    }

    //recursive function, defined as private
    private void printInOrder(BSTNode root) {
        if (root.getLeft() != null) {
            printInOrder(root.getLeft());
        }

        System.out.print(root.getValue() + "\t");

        if (root.getRight() != null) {
            printInOrder(root.getRight());
        }
    }

    public boolean add(Object value) {
        if (root == null) {
            root = new BSTNode(value);
            return true;
        }

        return add(root, value);
    }

    // recursive helper
    private boolean add(BSTNode root, Object value) {
        if (root.getValue().equals(value)) {
            return false;
        } else if ((int) value < (int) root.getValue()) {
            if (root.getLeft() == null) {
                root.setLeft(value);
                return true;
            } else {
                return add(root.getLeft(), value);
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(value);
                return true;
            } else {
                return add(root.getRight(), value);
            }
        }
    }

    public boolean search(int value) {
        if (root == null) {
            return false;
        }

        return search(root, value);
    }

    private boolean search(BSTNode root, int value) {
        if ((int) value == (int) root.getValue()) {
            return true;
        } else if ((int) value < (int) root.getValue()) {
            if (root.getLeft() == null) {
                return false;
            } else {
                return search(root.getLeft(), value);
            }
        } else if ((int) value > (int) root.getValue()) {
            if (root.getRight() == null) {
                return false;
            } else {
                return search(root.getRight(), value);
            }
        }
        return false;
    }

    public int findMin() {
        if (root == null) {
            throw new RuntimeException();
        }

        return findMin(root);

    }

    // Recursive helper for FindMin() - Method 2
    private int findMin(BSTNode root) {
        if (root.getLeft() != null) {
            return findMin(root.getLeft());
        }

        return (int) root.getValue();
    }

    public int findMax() {
        if (root == null) {
            throw new RuntimeException();
        }

        return findMax(root);

    }

    // Recursive helper for FindMax() - Method 2
    private int findMax(BSTNode root) {
        if (root.getRight() != null) {
            return findMax(root.getRight());
        }

        return (int) root.getValue();
    }
    
    //Q1
    
    public static void PrintSortedUsingBST (ArrayList list){
        {
            BST Tree2 = new BST();
            
        for(int i=0;i<list.getNumberOfOccurences(Tree2);i++){
            Tree2.add(list);
        }
        Tree2.printInOrder();

        }
}
    
}
