public class Main {
    public static void main(String[] args) {
        Stack queue = new Stack();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert("karen");
        queue.insert(4);
        queue.insert(true);
        queue.insert(5);
        queue.insert('a');
        queue.insert(6);
        queue.print();
        queue.extract();
        queue.print();
        queue.reverse();
        queue.sort();
        queue.print();
        queue.print();
        queue.size();
    }
}