
public class Main {
    public static void main(String[] args) {
        //Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
        //Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
        System.out.println("Ejecución del If");
        int numeroIf = 0;
        if(numeroIf > 0){
            System.out.println("Es mayor que 0");
        }else if(numeroIf < 0){
            System.out.println("Es menor que 0");
        }else {
            System.out.println("Es 0");
        }

        //Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, el bloque de código que tendrá el bucle deberá:
            //Incrementar el valor de la variable en uno cada vez que se ejecute.
            //Mostrarlo por pantalla cada vez que se ejecute.
        System.out.println("Ejecución while");
        int numeroWhile = 0;

        while(numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        //Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.
        int numeroDoWhile = 0;
        do{
            System.out.println("Ejecución del do while \n"+ numeroDoWhile);
            numeroDoWhile++;
        }while (numeroWhile==0);

        //Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que
        //la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.
        System.out.println("Ejecución del for");
        int numeroFor = 0;

        for(int i =0; i <= 3; i++){
            System.out.println(numeroFor++);
        }
        //Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje
        // por consola informando de la estación en la que está. También habrá que poner un default para cuando el valor de la variable no sea una estación.

        String estacion = "verano";

        switch (estacion) {
            case "invierno":
                System.out.println("Es invierno, hace frío");
                break;
            case "primavera":
                System.out.println("Es primavera, las flores están floreciendo");
                break;
            case "verano":
                System.out.println("Es verano, hace calor");
                break;
            case "otoño":
                System.out.println("Es otoño, las hojas cambian de color");
                break;
            default:
                System.out.println("La estación no es válida");
        }
    }
}