/**
 * La función que se solicita toma un arreglo de 10 enteros (números entre 0 y 9) y devuelve
 * una cadena que representa un número de teléfono en un formato específico. *
 * El formato del número de teléfono debe ser: "(XXX) XXX-XXXX", donde "X" representa un
 * dígito del arreglo de enteros.
 *
 * Por ejemplo:
 *
 * Si se proporciona el arreglo {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, la función debe devolver la cadena "(123) 456-7890".
 * Author: Santiago Maldonado Rojas
 */
public class Main {
    public static void createPhoneNumber(){

    }
    public static void main(String[] args) {
        Kata kata = new Kata();
        int[] num = {3,1,5,5,4,7,0,3,6,2};
        kata.createPhoneNumber(num);
    }
}
class Kata {
    public Kata() {

    }

    public String createPhoneNumber(int[] array){//Retornara una cadena formateada
            if (array.length == 10){
                String phoneNumber = String.format("%d%d%d %d%d%d%d%d%d%d",array[0],array[1],array[2],array[3],array[4],
                        array[5],array[6],array[7],array[8],array[9]);
                System.out.println("Su número de telefono: " + phoneNumber);
                return phoneNumber;
            }else{
                return null;
            }
        }
}