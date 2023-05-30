//Crea una clase Persona con las siguientes variables:
// + La edad
// + El nombre
// + El teléfono
//Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
//Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
//Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
class Persona {
    int edad;
    String nombre;
    String telefono;

    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
class Cliente extends Persona{
    int credito;

    public Cliente(int edad, String nombre, String telefono, int credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    int salario;
    public Trabajador(int edad, String nombre, String telefono, int salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
}
public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona(12,"Andres","124124");
        System.out.println("Persona \n Nombre: " + persona.getNombre() + " \n Edad: " + persona.getEdad() + " \n Telefono: " + persona.getTelefono());
        Cliente cliente = new Cliente(18, "Felipe", "123123", 15000);
        System.out.println("Cliente \n Nombre: " + cliente.getNombre() + " \n Edad: " + cliente.getEdad() + " \n Telefono: " + cliente.getTelefono() + "\n Credito: " + cliente.getCredito());
        Trabajador trabajador = new Trabajador(19, "Valentina", "987654", 2000000);
        System.out.println("Trabajador \n Nombre: " + trabajador.getNombre() + " \n Edad: " + trabajador.getEdad() + " \n Telefono: " + trabajador.getTelefono() + "\n Salario: " + trabajador.getSalario());

    }
}

