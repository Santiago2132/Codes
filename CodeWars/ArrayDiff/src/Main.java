import Structure.LinkedList;

/**
 * Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
 *
 * It should remove all values from list a, which are present in list b keeping their order.
 *
 * Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
 * If a value is present in b, all of its occurrences must be removed from the other:
 *
 * Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new int[] {1, 3}
 *
 * Author: Santiago Maldonado Rojas
 */
public class Main {
    public static int[] arrayDiff(int[] a, int[] b){
        LinkedList result = new LinkedList();
        for (int num: a){
            if (!contains(b,num)) {//Lo agrega si no está en la lista
                result.add(num);
            }
        }
        int[] finalResult = new int[result.size()];
        for (int i = result.size() - 1; i >= 0 ; i--) {
            finalResult[i] = (int) result.pop();
        }
        return finalResult;
    }

    private static boolean contains(int[] arr, int num) {//Contiene el número
        for (int i : arr) {
            if (i == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int[] resultado = arrayDiff(new int[] {1, 2}, new int[] {1});
        System.out.println(resultado[0]);
    }
}