/**
 * Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.
 * Autor: Santiago Maldonado Rojas
 */

public class Main {
    public static void main(String[] args) {
        int price = returnPriceWithIva(10000);
        System.out.println(price);
    }
    public static int returnPriceWithIva(int price){
        if(price>0){
            float iva = 0.19F;
            price = (int) (price + iva * price);
            return price;
        }else {
            return 0;
        }
    }
}
