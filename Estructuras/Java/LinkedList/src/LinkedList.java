import java.util.Iterator;

/**
 * @author Santiago Maldonado Rojasn
 */
public class LinkedList implements List,Cloneable {
    private Node head;
    private Node tail;
    int size = 0;
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
                    size++;
                    return true;
                }else {
                    tail.setNext(newNode);
                    newNode.setPrev(tail);
                    tail = newNode;
                    size++;
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
                size++;
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
                size++;
                return true;
            }else {
                node.setNext(nextNode);
                size++;
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
                        size++;
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
                size++;
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
                    size++;
                    return true;
                }else {
                    return false;
                }
            }else {
                if(object != null){
                    add(object);
                    size++;
                    return true;
                }else {
                    return false;
                }
            }
        }catch (Exception ValueError){
            System.out.println("Error: " +  ValueError);
            return false;
        }
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
            if(tail != null){
                if(head == tail){
                    Object object = tail.getObject();
                    tail = head = null;
                    return object;
                }else {
                    Object object = tail.getObject();
                    tail = tail.getPrev();
                    return object;
                }
            }else {
                return null;
            }
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
    }

    @Override
    public boolean remove(Object object) {
        try{
            Node node = head;
            while (node != null) {
                if (node.getObject().equals(object)) {
                    if(node == head && node == tail){
                        head = null;
                        tail = null;
                    }else if(node == head){
                        head = node.getNext();
                        head.setPrev(null);
                    }else if (node == tail){
                        tail = node.getPrev();
                        tail.setNext(null);
                    }else {
                        Node prev = node.getPrev();
                        Node next = node.getNext();
                        prev.setNext(next);
                        next.setPrev(prev);
                    }
                    return true;
                }
                node = node.getNext();
            }
            return false;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return false;
        }
    }

    @Override
    public boolean remove(NodeI nodeI) {
        if (!(nodeI instanceof Node)) {//Verifica que sea un nodo valido  de la lista
            return false;
        }
        Node nodeToRemove = (Node) nodeI;
        Node node = head;
        while (node != null) {
            if (node.equals(nodeToRemove)) {
                if (node == head && node == tail) {
                    head = null;
                    tail = null;
                } else if (node == head) {
                    head = node.getNext();
                    head.setPrev(null);
                } else if (node == tail) {
                    tail = node.getPrev();
                    tail.setNext(null);
                } else {
                    Node prev = node.getPrev();
                    Node next = node.getNext();
                    prev.setNext(next);
                    next.setPrev(prev);
                }
                return true;
            }
            node = node.getNext();
        }
        return false;
    }



    @Override
    public boolean removeAll(Object[] objects) {
        try{
            int removeObjects = 0;
            for (int i = 0; i < objects.length; i++){
                if(remove(objects[i])){
                    removeObjects++;
                }
            }
            if(removeObjects == objects.length){
                return true;
            }else {
                return false;
            }
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return false;
        }
    }

    @Override
    public boolean retainAll(Object[] objects) {
        try{
            boolean modified = false;
            Node node = head;
            Node nodePreve = null;
            while (node != null) {
                boolean found = false;
                for (Object obj : objects) {
                    if (obj.equals(node.getObject())) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    if (nodePreve == null) {
                        head = node.getNext();
                    } else {
                        nodePreve.setNext(node.getNext());
                    }
                    modified = true;
                } else {
                    nodePreve = node;
                }
                node = node.getNext();
            }
            return modified;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return false;
        }
    }

    @Override
    public boolean set(NodeI nodeI, Object object) {
        try{
            if (!(nodeI instanceof Node)) {//Verifica que sea un nodo valido  de la lista
                return false;
            }
            Node node = head;
            Node nodeSet = (Node) nodeI;
            while (node != null) {
                if (node.equals(nodeSet)) {
                    node.setObject(object);
                    return true;
                }
                node = node.getNext();
            }
            return false;
        }catch (Exception ValueError){
            System.out.println(" Error: " +  ValueError);
            return false;
        }
    }

    @Override
    public int size() {
        try {
            return size;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
        }
        return 0;
    }

    @Override
    public List subList(NodeI from, NodeI to) {
        try{
            Node head = (Node)from;
            Node tail = (Node) to;
            Node node = this.head;
            while (node != null){
                if (node.equals(head)){
                    head = node;
                    break;
                }
                node = node.getNext();
            }

        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
        return null;
    }

    @Override
    public Object[] toArray() {
        try{
            Node node = head;
            Object[] objects = new Object[size()];
            for (int i = 0; node != null; i++){
                if(node.getObject() != null){
                    objects[i] = node.getObject();
                }
                node = node.getNext();
            }
            return objects;
        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return null;
        }
    }

    @Override
    public boolean orderBy(char c) {
        try{
            LinkedList integers = new LinkedList();
            LinkedList characters = new LinkedList();
            LinkedList strings = new LinkedList();
            LinkedList booleans = new LinkedList();
            LinkedList others = new LinkedList();

            Node current = head;
            while (current != null) {
                Object obj = current.getObject();
                if (obj instanceof Integer) {
                    integers.add(obj);
                } else if (obj instanceof Character) {
                    characters.add(obj);
                } else if (obj instanceof String) {
                    strings.add(obj);
                } else if (obj instanceof Boolean) {
                    booleans.add(obj);
                } else {
                    others.add(obj);
                }
                current = current.getNext();
            }

            LinkedList sortedList = new LinkedList();
            sortedList.addAll(integers);
            sortedList.addAll(characters);
            sortedList.addAll(strings);
            sortedList.addAll(booleans);
            sortedList.addAll(others);

            head = sortedList.getHead();
            return true;

        }catch (Exception ValueError){
            System.out.println(" Error: " + ValueError);
            return false;
        }
    }

    private void addAll(LinkedList otherList) {
        Node current = otherList.getHead();
        while (current != null) {
            add(current.getObject());
            current = current.getNext();
        }
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