import java.util.Iterator;

/**
 * @author Santiago Maldonado Rojasn
 */
public class LinkedList implements List {
    Node head;
    Node tail;
    @Override
    public boolean add(Object object) {
        Node newNode = new Node(object);
        if(isEmpty()){
            head = newNode;
            tail = newNode;
            return true;
        }else {
            tail.setNext(newNode);
            tail = newNode;
            return true;
        }
    }

    @Override
    public boolean add(NodeI nodeI, Object object) {
        return false;
    }

    @Override
    public boolean add(NodeI nodeI, NodeI next) {
        return false;
    }

    @Override
    public boolean add(Object[] objects) {
        return false;
    }

    @Override
    public boolean add(NodeI nodeI, Object[] objects) {
        return false;
    }

    @Override
    public boolean addFirst(Object object) {
        return false;
    }

    @Override
    public boolean addFirst(Object[] objects) {
        return false;
    }

    @Override
    public boolean addLast(Object object) {
        return false;
    }

    @Override
    public boolean addLast(Object[] objects) {
        return false;
    }

    @Override
    public boolean clear() {
        return false;
    }

    @Override
    public List clone() {
        return null;
    }

    @Override
    public boolean contains(Object object) {
        return false;
    }

    @Override
    public boolean contains(Object[] objects) {
        return false;
    }

    @Override
    public NodeI nodeOf(Object object) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public Object get(NodeI nodeI) {
        return null;
    }

    @Override
    public Object getPrevious(NodeI nodeI) {
        return null;
    }

    @Override
    public Object getNext(NodeI nodeI) {
        return null;
    }

    @Override
    public Object getFirst() {
        return null;
    }

    @Override
    public Object[] getFirst(int n) {
        return new Object[0];
    }

    @Override
    public Object getLast() {
        return null;
    }

    @Override
    public Object[] getLast(int n) {
        return new Object[0];
    }

    @Override
    public Object pop() {
        return null;
    }

    @Override
    public boolean remove(Object object) {
        return false;
    }

    @Override
    public boolean remove(NodeI nodeI) {
        return false;
    }

    @Override
    public boolean removeAll(Object[] objects) {
        return false;
    }

    @Override
    public boolean retainAll(Object[] objects) {
        return false;
    }

    @Override
    public boolean set(NodeI nodeI, Object object) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public List subList(NodeI from, NodeI to) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean orderBy(char c) {
        return false;
    }

    @Override
    public void print() {

    }

    @Override
    public Iterator<NodeI> iterator() {
        return null;
    }
    public static void main(String [] args){
    }
}
class Node <T> implements NodeI{
    private T Object;
    private Node prev;
    private Node next;

    //Constructores
    public Node(T object) {
        this.Object = null;
        this.next = null;
        this.prev = null;
    }

    public Node(T objeto, Node next) {
        this.Object = objeto;
        this.prev = null;
        this.next = next;
    }
    public Node(T objeto, Node prev, Node next) {
        this.Object = objeto;
        this.prev = prev;
        this.next = next;
    }

    //Metodo
    @Override
    public boolean isEquals(Object object) {
        if(Object.equals(object)){
            return true;
        }else{
            return false;
        }
    }

    //Getters and Setters
    @Override
    public boolean setObject(Object object) {
        if(object != null){
            this.Object = (T) object;
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object getObject() {
        return Object;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}