import java.util.Iterator;

/**
 * @author Santiago Maldonado Rojasn
 */
public class LinkedList implements List,Cloneable {
    private Node head;
    private Node tail;
    //Constructores
    public LinkedList() {
    }

    //Metodos
    @Override
    public boolean add(Object object) {
        try{

            if(object != null){
                Node newNode = new Node(object);
                if(isEmpty()){
                    head = newNode;
                    tail = newNode;
                    return true;
                }else {
                    tail.setNext(newNode);
                    newNode.setPrev(tail);
                    tail = newNode;
                    return true;
                }
            }else {
                return false;
            }

        }catch (Exception ValueError){
            System.out.println("Error: " + ValueError);
            return false;
        }

    }

    @Override
    public boolean add(NodeI nodeI, Object object) {
        try {

            if(object != null){
                Node newNode = new Node<>(object);
                Node node = (Node) nodeI;
                node.setNext(newNode);
                newNode.setPrev(node);
                return true;
            }else {
                return false;
            }

        }catch (Exception ValueError){
            System.out.println("Error: " + ValueError);
            return false;
        }

    }

    @Override
    public boolean add(NodeI nodeI, NodeI next) {
        try{
            Node node = (Node) nodeI;
            Node nextNode = (Node) next;

            if(node.getNext() != null){
                Node aux = node.getNext();
                node.setNext(nextNode);
                nextNode.setNext(aux);
                nextNode.setPrev(node);
                aux.setPrev(nextNode);
                return true;
            }else {
                node.setNext(nextNode);
                return true;
            }

        }catch (Exception ValueError){
            System.out.println(" Error: \n" + ValueError);
            return false;
        }
    }

    @Override
    public boolean add(Object[] objects) {

        try{

            if(objects != null) {
                for (int i = 0; i < objects.length; i++) {
                    add(objects[i]);
                }
                return true;
            }else {
                return false;
            }

        }catch (Exception ValueError){
            System.out.println(" Error: \n" + ValueError);
            return false;
        }

    }

    @Override
    public boolean add(NodeI nodeI, Object[] objects) {

        try{
            if (objects != null) {
                Node node = (Node) nodeI;
                Node aux = node.getNext();

                for (int i = 0; i < objects.length; i++) {
                    if(objects[i] != null){
                        Node newNode = new Node<>(objects[i]);
                        newNode.setPrev(node);
                        node.setNext(newNode);
                        node = newNode;
                    }
                }

                if (aux != null) {
                    aux.setPrev(node);
                    node.setNext(aux);
                }
                return true;

            } else {
                return false;
            }
        }catch (Exception ValueError){
            System.out.println("Error: " + ValueError);
            return false;
        }

    }


    @Override
    public boolean addFirst(Object object) {

        try{

            if(object != null){
                Node newFirts = new Node<>(object);
                head.setPrev(newFirts);
                newFirts.setNext(head);
                head = newFirts;
                return true;
            }else {
                return false;
            }

        }catch (Exception ValueError){
            System.out.println("Error: " + ValueError);
            return false;
        }

    }

    @Override
    public boolean addFirst(Object[] objects) {

        try{
            if(objects != null){
                int aux = objects.length - 1;
                for(int i = 0; i < objects.length; i++){
                    if(objects[aux] != null){
                        addFirst(objects[aux--]);
                    }
                }
                return true;
            }
            else {
                return false;
            }
        }catch (Exception ValueError){
            System.out.println("Error: " + ValueError);
            return false;
        }

    }

    @Override
    public boolean addLast(Object object) {
        try{

            if(tail != null){
                if (object != null){
                    Node newNode = new Node<>(object);
                    tail.setNext(newNode);
                    newNode.setPrev(tail);
                    tail = newNode;
                }else {
                    return false;
                }
            }else {
                    add(object);
            }
        }catch (Exception ValueError){
            System.out.println("Error: " +  ValueError);
            return false;
        }
        return false;
    }

    @Override
        public boolean addLast(Object[] objects) {
            try {

                if(objects != null){
                    for (int i = 0; i < objects.length; i++){
                        if (objects != null){
                            addLast(objects[i]);
                        }
                    }
                }else {
                    return false;
                }

            }catch (Exception ValueError){
                System.out.println("Error: " + ValueError);
                return false;
            }
            return false;
        }

    @Override
    public boolean clear() {
        try{
            if(!isEmpty()){
                head = null;
                tail = null;
                return true;
            }else {
                return true;
            }

        }catch (Exception ValueError){
            System.out.println("Error: " + ValueError);
            return false;
        }
    }

    @Override
    public List clone() {
        try{
            return (LinkedList) super.clone();
        }catch (Exception ValueError){
            System.out.print("Error: " + ValueError);
            return null;
        }
    }

    @Override
    public boolean contains(Object object) {
        try{
            if(head != null){
                Node node = head;
                while(node != null){
                    if(node.getObject().equals(object)){
                        return true;
                    }else {
                        node = node.getNext();
                    }
                }
                return false;
            }else {
                return false;
            }

        }catch (Exception ValueError){
            System.out.println("Error: " + ValueError);
            return false;
        }
    }

    @Override
    public boolean contains(Object[] objects) {
        try{
            for (Object obj : objects) {
                if (obj != null && !contains(obj)) {
                    return false;
                }
            }
            return true;
        }catch (Exception ValueError){
            System.out.println("Error: " + ValueError);
        }
        return false;
    }

    @Override
    public NodeI nodeOf(Object object) {
        try{
            if(head != null){
                Node node = head;
                while(node != null){
                    if(node.getObject().equals(object)){
                        return node;
                    }else {
                        node = node.getNext();
                    }
                }
                return null;
            }else {
                return null;
            }
        }catch (Exception ValueError){
            System.out.println("Error: " + ValueError);
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public Object get() {
        try{
            return tail.getObject();
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
    }

    @Override
    public Object get(NodeI nodeI) {
        try{
            Node node = head;
            Node nodeAux = (Node) nodeI;
            while (node != null) {
                if (node == nodeAux) {
                    return node.getObject();
                }
                node = node.getNext();
            }
            return null;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
    }

    @Override
    public Object getPrevious(NodeI nodeI) {
        try {
            Node nodo = head;
            Node nodeAux = (Node) nodeI;
            while (nodo != null){
                if(nodo == nodeAux){
                    return nodo.getPrev().getObject();
                }
                nodo = nodo.getNext();
            }
            return null;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
    }

    @Override
    public Object getNext(NodeI nodeI) {
        try{
            Node node = head;
            Node nodeAux = (Node) nodeI;
            while (node != null){
                if(node == nodeAux){
                    return node.getNext().getObject();
                }
                node = node.getNext();
            }
            return null;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
    }

    @Override
    public Object getFirst() {
        try{
            return getHead().getObject();
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
    }

    @Override
    public Object[] getFirst(int n) {
        try{
            Node nodo = head;
            Object[] objects = new Object[n];
            for (int i = 0; i < n; i++) {
                if (nodo.getObject() != null) {
                    objects[i] = nodo.getObject();
                }
                nodo = nodo.getNext();
            }
            return objects;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
    }

    @Override
    public Object getLast() {
        return tail.getObject();
    }

    @Override
    public Object[] getLast(int n) {
        try{
            Object[] objects = new Object[n];
            Node node = tail;
            for(int i = 0; i < n; i++){
                if (node.getObject() != null ){
                    objects[i] = node.getObject();
                }
                node = node.getPrev();
            }
            return objects;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
    }

    @Override
    public Object pop() {
        try{
            Object object = tail.getObject();
            tail = tail.getPrev();
            return object;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
    }

    @Override
    public boolean remove(Object object) {
        try{
            Node nodo = head;
            while (nodo != null) {
                if (nodo.getObject().equals(object)) {
                    if(nodo == head){
                        Node nodeNext = nodo.getNext();
                        nodeNext.setPrev(null);
                        head = nodeNext;
                        return true;
                    }else if (nodo == tail){
                        Node nodePrev = nodo.getPrev();
                        nodePrev.setNext(null);
                        tail = nodePrev;
                        return true;
                    }else {
                        Node nodePrev = nodo.getPrev();
                        Node nodeNext = nodo.getNext();
                        nodePrev.setNext(nodeNext);
                        nodeNext.setPrev(nodePrev);
                        return true;
                    }
                }
                nodo = nodo.getNext();
            }
            return false;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return false;
        }
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

        try {
            Node node = head;
            if(node != null){
                while (node != null){
                    if(node == head){
                        System.out.print("[Head]: " + node.getObject());
                        node = node.getNext();
                    } else if (node == tail) {
                        System.out.print(" <-> " + node.getObject() + " :[Tail]");
                        node = null;
                    } else{
                        System.out.print(" <-> " + node.getObject());
                        node = node.getNext();
                    }
                }
            }else {
                System.out.println("\n Esta vacía");
            }

        }catch (Exception ValueError){
            System.out.println("Error: " + ValueError);
        }

    }
    @Override
    public Iterator<NodeI> iterator() {
        return null;
    }

    //Getters and setters
    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public static void main(String [] args){
    }
}


/*
   * Sub clase Nodo
 */
class Node <T> implements NodeI{
    private T Object;
    private Node prev;
    private Node next;

    //Constructores
    public Node(T object) {
        this.Object = object;
        this.next = null;
        this.prev = null;
    }

    public Node(T objeto, Node next) {
        this.Object = objeto;
        this.next = next;
        this.prev = null;
    }
    public Node(T objeto, Node prev, Node next) {
        this.Object = objeto;
        this.prev = prev;
        this.next = next;
    }

    //Metodos
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