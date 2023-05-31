/**
 * @author Santiago Maldonado Rojas
 * Estructura de datos: Lista Doblemente Enlazada
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(22);
        list.add(33);
        Object[] objects = {1,2,3,4,5,6,7,8,9,10, "Santiago"};
        list.addFirst(17);
        list.addLast(objects);
        list.print();
        list.clear();
        list.print();
    }
}