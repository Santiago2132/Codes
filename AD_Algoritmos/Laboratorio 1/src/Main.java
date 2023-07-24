/**
 *1. Se quiere desarrollar un programa que determine si un número es un número
 * perfecto. Un número perfecto es aquel que es igual a la suma de sus
 * divisores positivos.
 * Por ejemplo, el número 28 es un número perfecto ya que sus divisores son:
 * 1, 2, 4, 7 y 14, y la suma de estos números es 28.
 *
 * 2. El propietario de una pequeña empresa quiere conocer el valor a pagar
 * por la nómina de sus 10 empleados, sabiendo que cada uno tiene un
 * sueldo base de $855.000. Se sabe que por cada 10 horas extras que
 * trabaje el empleado al mes obtendrá un 10% más de bonificación al mes,
 * si el empleado trabaja 20 hora extras al mes obtendrá una bonificación del
 * 15% y si trabaja 32 horas extras recibirá un 20% de bonificación; se debe
 * tener en cuenta que las prestaciones sociales de los empleados equivalen
 * a un 26% de su salario base.
 *
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

    //Ejercicio #2

    public static void nomina(int[] horas){
        long startTime = System.currentTimeMillis();//Inicio de ejecución

        int prestacionSocial = (855000*26)/100;
        int[] empleados = new int[10];
        for (int i = 0; i <10; i++){
            int sueldoBase = 855000;
            if((horas[i]== 10)||(horas[i]<20)){
                sueldoBase = sueldoBase + ((sueldoBase*10)/100);
            } else if ((horas[i]== 20)||(horas[i]<32)){
                sueldoBase = sueldoBase + ((sueldoBase*15)/100);
            } else if (horas[i]>= 32) {
                sueldoBase = sueldoBase + ((sueldoBase*20)/100);
            }
            sueldoBase = sueldoBase - prestacionSocial;
            empleados[i]= sueldoBase;
            System.out.println(sueldoBase);
        }
        long endTime = System.currentTimeMillis();//Fin  del tiempo de ejecución
        long elapsedTime = endTime - startTime;
        System.out.println("Tiempo de ejecución: " + elapsedTime + " milisegundos");
    }

    public static void main(String[] args) {
        /*
        System.out.println("Test #1: Algoritmo 1.1");
        esPerfecto1(7);
        System.out.println("Test #2: Algoritmo 1.2");
        esPerfecto(7);*/
        System.out.println("Test #1: Algoritmo 2.0");
        int[] horas = {20, 20, 32,10, 32, 20,10,10,10,10 };
        nomina(horas);

    }
}