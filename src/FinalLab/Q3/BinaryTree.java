
package FinalLab.Q3;


public class BinaryTree {

    private BinaryNode root;

    public BinaryTree() {
        this.root = null;
    }

    public BinaryTree(BinaryNode root) {
        this.root = root;
    }

    public BinaryTree(Object value) {
        this.root = new BinaryNode(value);
    }

    public BinaryTree(Object value, Object leftValue, Object rightValue) {
        this.root = new BinaryNode(value, new BinaryNode(leftValue), new BinaryNode(rightValue));
    }

    public BinaryNode getRoot() {
        return this.root;
    }

    public boolean isEmpty() {
        return this.root == null;
    }

    public void makeEmpty() {
        this.root = null;
    }

    //Node => Left => Right
    public void printPreOrder() {
        if (root == null) {
            System.out.println("Binary Tree is empty");
        } else {
            printPreOrder(root);
        }
    }

    //Left => Node => Right
    public void printInOrder() {
        if (root == null) {
            System.out.println("Binary Tree is empty");
        } else {
            printInOrder(root);
        }
    }

    //Left => Right => Node
    public void printPostOrder() {
        if (root == null) {
            System.out.println("Binary Tree is empty");
        } else {
            printPostOrder(root);
        }
    }

    //recursive function, defined as private
    private void printPreOrder(BinaryNode root) {
        System.out.print(root.getValue() + "\t");

        if (root.getLeft() != null) {
            printPreOrder(root.getLeft());
        }

        if (root.getRight() != null) {
            printPreOrder(root.getRight());
        }
    }

    //recursive function, defined as private
    private void printInOrder(BinaryNode root) {
        if (root.getLeft() != null) {
            printInOrder(root.getLeft());
        }

        System.out.print(root.getValue() + "\t");

        if (root.getRight() != null) {
            printInOrder(root.getRight());
        }
    }

    //recursive function, defined as private
    private void printPostOrder(BinaryNode root) {
        if (root.getLeft() != null) {
            printPostOrder(root.getLeft());
        }

        if (root.getRight() != null) {
            printPostOrder(root.getRight());
        }

        System.out.print(root.getValue() + "\t");
    }

    public int sum() {
        if (root == null) {
            return -1;
        } else {
            return sum(root);
        }
    }

    //first method
    private int sum1(BinaryNode root) {

        if (root == null) {
            return 0;
        }
        return (int) root.getValue() + sum1(root.getLeft())
                + sum1(root.getRight());
    }

    //second method
    private int sum(BinaryNode root) {
        int sum = 0;

        sum += (int) root.getValue();

        if (root.getLeft() != null) {
            sum += sum(root.getLeft());
        }

        if (root.getRight() != null) {
            sum += sum(root.getRight());
        }
        return sum;
    }

    public int size() {
        return size(root);
    }

    //recursive function, defined as private
    private int size(BinaryNode root) {
        if (root == null) {
            return 0;
        } else {
            return 1 + size(root.getLeft()) + size(root.getRight());
        }
    }

    public int count(Object x) {
        if (root == null) {
            return 0;
        }

        return count(root, x);
    }

    //recursive function, defined as private
    private int count(BinaryNode root, Object x) {
        int c = 0;

        if (root.getValue().equals(x)) {
            c++;
        }

        if (root.getLeft() != null) {
            c += count(root.getLeft(), x);
        }

        if (root.getRight() != null) {
            c += count(root.getRight(), x);
        }

        return c;
    }

    public int height() {
        return height(root);
    }

    //recursive function, defined as private
    private int height(BinaryNode root) {
        if (root == null) {
            return -1;
        } else {
            return 1 + Math.max(height(root.getLeft()), height(root.getRight()));
        }
    }

    public int getMin() {
        if (root == null) {
            System.out.println("Tree is empty");
            throw new RuntimeException();
        }
        return getMin(root);
    }

    //recursive function, defined as private
    private int getMin(BinaryNode N) {
        int min = (int) N.getValue();
        int minL, minR;

        if (N.getLeft() != null) {
            minL = getMin(N.getLeft());
            if (minL < min) {
                min = minL;
            }
        }

        if (N.getRight() != null) {
            minR = getMin(N.getRight());
            if (minR < min) {
                min = minR;
            }
        }

        return min;
    }

    public int getMax() {
        if (root == null) {
            System.out.println("Tree is empty");
            throw new RuntimeException();
        }
        return getMax(root);
    }

    //recursive function, defined as private
    private int getMax(BinaryNode N) {
        int max = (int) N.getValue();
        int maxL, maxR;

        if (N.getLeft() != null) {
            maxL = getMax(N.getLeft());
            if (maxL > max) {
                max = maxL;
            }
        }

        if (N.getRight() != null) {
            maxR = getMax(N.getRight());
            if (maxR > max) {
                max = maxR;
            }
        }

        return max;
    }

    public boolean isBST() {
        if (root == null) {
            return true;
        }

        return isBST(root);
    }

    private boolean isBST(BinaryNode root) {
        if (root.getLeft() != null) {
            if ((int) root.getValue() > (int) root.getLeft().getValue()) {
                if (isBST(root.getLeft()) == false) {
                    return false;
                }
            } else {
                return false;
            }
        }

        if (root.getRight() != null) {
            if ((int) root.getValue() < (int) root.getRight().getValue()) {
                if (isBST(root.getRight()) == false) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return true;
    }
    
    //Final exam starts here
    //Q3
    
    public int CountOneChildNodes() {
        
        return CountOneChildNodes(root);
    }

    public int CountOneChildNodes(BinaryNode K) {
        if (K == null) {
            return 0;
        }

           int x = 0;
           if ((K.getLeft()!=null && K.getRight() == null) || (K.getLeft()==null && K.getRight() != null))
        {
            x++;
            x = x + CountOneChildNodes(K.getLeft()) + CountOneChildNodes(K.getRight());
        }

        return x;
    }
    
    
    //Q2
    
    public BinaryNode MirrorTree()
       {
           MirrorTree(root);
        return null;
       }
       private BinaryNode MirrorTree(BinaryNode K){
           if(K == null)
               
               return K;
           
           BinaryNode x = K;
           x.setLeft(MirrorTree(K.getRight()));
           
           x.getRight(MirrorTree ( K.getLeft()));
           
           x.setElement(x.getElement());
       }
           return x;
           
       }

    
    
    
}
