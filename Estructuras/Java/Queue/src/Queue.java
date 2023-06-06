import DataStructure.LinkedList;

public class Queue {
    LinkedList queue = new LinkedList();

    public Queue() {
    }

    public void clear(){
        queue.clear();
    }

    public Object extract(){
        Object object = queue.getFirst();
        queue.remove(queue.getHead());
        return object;
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }
    public void insert(Object element){
        queue.add(element);
    }

    public int size(){
        return queue.size();
    }

    public boolean search(Object object){
        return queue.contains(object);
    }

    public void sort(){
        queue.orderBy('a');
    }
    public void reverse(){
        Stack stack = new Stack();
        LinkedList list = new LinkedList();
        while(queue.size()>0){
            stack.insert(extract());
        }
        while (stack.size() > 0){
            list.add(stack.extract());
        }
        queue = list;
    }

    @Override
    public String toString() {
        return "Queue{" +
                "queue=" + queue +
                '}';
    }

    public void print(){
        queue.print();
    }

}

class Stack{

    LinkedList stack = new LinkedList();

    public Stack() {
    }

    public void clear(){
        stack.clear();
    }

    public Object extract(){
        return stack.pop();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void insert(Object element){
        stack.add(element);
    }

    public int size(){
        return stack.size();
    }

    public boolean search(Object object){
        return stack.contains(object);
    }

    public void sort(){
        stack.orderBy('a');
    }
    public void reverse(){
        Queue queue = new Queue();
        LinkedList list = new LinkedList();
        while(stack.size() > 0){
            queue.insert(extract());
        }
        while (queue.size() > 0){
            list.add(queue.extract());
        }
        this.stack = list;
    }

    @Override
    public String toString() {
        return "Stack{" +
                "stack=" + stack +
                '}';
    }

    public void print(){
        stack.print();
    }

}
