/**
 *1. Se quiere desarrollar un programa que determine si un número es un número
 * perfecto. Un número perfecto es aquel que es igual a la suma de sus
 * divisores positivos.
 * Por ejemplo, el número 28 es un número perfecto ya que sus divisores son:
 * 1, 2, 4, 7 y 14, y la suma de estos números es 28.
 * Autor Santiago Maldonado Rojas
 */
public class Main {
    //Ejercicio # 1
    public static void esPerfecto1(int numero) {//Version 1.1 funcional
        long startTime = System.currentTimeMillis();//Inicio de ejecución
        int sumaDivisores = 0;
        for (int i = 1; i <= numero / 2; i++) {
            if (numero % i == 0) {
                sumaDivisores += i;
            }
        }

        if (sumaDivisores == numero) {
            System.out.println("Es un número perfecto.");
        } else {
            System.out.println("No es un número perfecto.");
        }
        long endTime = System.currentTimeMillis();//Fin  del tiempo de ejecución
        long elapsedTime = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + elapsedTime + " milisegundos");
    }

    public static void esPerfecto(int numero) {//Version 1.2 Funcional
        long startTime = System.currentTimeMillis();//Inicio de ejecución
        if (esPrimo(numero)) {
            System.out.println("El número " + numero + " es un número primo, y los primos no son números perfectos.");
        } else {
            int sumaDivisores = 0;
            for (int i = 1; i <= numero / 2; i++) {
                if (numero % i == 0) {
                    sumaDivisores += i;
                }
            }
            if (sumaDivisores == numero) {
                System.out.println("El número " + numero + " es un número perfecto.");
            } else {
                System.out.println("El número " + numero + " no es un número perfecto.");
            }
        }
        long endTime = System.currentTimeMillis();//Fin  del tiempo de ejecución
        long elapsedTime = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + elapsedTime + " milisegundos");
    }

    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Test #1: Algoritmo 1.1");
        esPerfecto1(7);
        System.out.println("Test #2: Algoritmo 1.2");
        esPerfecto(7);
    }
}