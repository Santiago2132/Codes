public class Coche {
    public int puertas;//Atributos
    public Coche() {
    }
    public void agregarPuerta(){//Funcion de agregar puerta
        this.puertas++;
    }
    public static void main(String [] args){
        Coche coche = new Coche();//Se creo el nuevo objeto coche
        coche.agregarPuerta();//Se agregaron las puertas
        coche.agregarPuerta();
        System.out.println(coche.puertas);//Se impre el número de puertas
    }
}
