/**
 * @author Santiago Maldonado Rojas
 * Estructura de datos: Lista Doblemente Enlazada
 */
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(22);
        list.add(33);
        Object[] objects = {1,2,3,4,5};
        list.add(list.getHead(),objects);
        System.out.println(list.getHead().getObject() + " " + list.getTail().getPrev().getObject());
        list.addFirst(17);
        System.out.println(list.getHead().getObject() + " " + list.getTail().getPrev().getObject());
    }
}