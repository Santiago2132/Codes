import Structures.LinkedList;

/**
 * @author Santiago Maldonado Rojas
 * Estructura de datos: Lista Doblemente Enlazada
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(22);
        list.add(33);
        Object[] objects = {1,2,3,4,5,'a','b',6,7,8,9,true,false,10,"Santiago"};
        list.add(objects);
        list.addLast(2);
        list.set(list.getTail(),"Antonio");
        list.print();
        list.orderBy('a');
        System.out.println("\n");
        list.print();
        System.out.println(list.size);
    }
}