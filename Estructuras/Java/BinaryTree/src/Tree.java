public class Tree {
    private Node root;

}
class Node <T>{
    private T object;
    private Node left;
    private Node right;

    public Node() {
    }

    public Node(T object) {
        this.object = object;
    }
    //Getters and setters

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

}
