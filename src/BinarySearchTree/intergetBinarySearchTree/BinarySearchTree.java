package BinarySearchTree.intergetBinarySearchTree;

public class BinarySearchTree <E extends Comparable<E>> {
    private TreeNode<E> root;
    private int size = -1;

    public BinarySearchTree() {}

    public boolean search(E element){
        if (size == -1) {
            return false;
        }

        TreeNode<E> currentNode = root;

        while (root != null) {
            E currentElement = currentNode.getElement();
            if (element.compareTo(currentElement) < 0) {
                currentNode = currentNode.getLeft();
            } else if (element.compareTo(currentElement) > 0) {
                currentNode = currentNode.getRight();
            } else {
                return true;
            }
        }

        return false;
    }

    public boolean insert(E element){
        TreeNode<E> parentNode;
        TreeNode<E> currentNode;
        TreeNode<E> newTreeNode = new TreeNode<>(element);

        if (size == -1) {
            root = newTreeNode;
            return true;
        }

        parentNode = currentNode = root;
        while (currentNode != null) {
            E currentElement = currentNode.getElement();
            if (element.compareTo(currentElement) < 0) {
                parentNode = currentNode;
                currentNode = parentNode.getLeft();
            } else if (element.compareTo(currentElement) > 0) {
                parentNode = currentNode;
                currentNode = parentNode.getRight();
            } else {
                return false; // No equals
            }
        }

        E parentElement = parentNode.getElement();

        if (element.compareTo(parentElement) < 1) {
            parentNode.setLeft(newTreeNode);
        } else {
            parentNode.setRight(newTreeNode);
        }

        size++;
        return true;
    }

    public boolean delete(E element){
        return false;
    }

    public void inorder(){

    }

    public void preorder() {

    }

    public void postorder(){

    }

    public int getSize() {
        return size;
    }

}
