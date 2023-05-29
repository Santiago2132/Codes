public class Persona {
    //Atributos
    private int edad;
    private String nombre;
    private String telefono;
    //Constructor
    public Persona() {
    }

    //Getters and setters

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

    public static void main(String [] args){
        Persona persona = new Persona();
        persona.setNombre("Andrés");
        persona.setEdad(17);
        persona.setTelefono("31414343");
        System.out.println("Nombre: " + persona.getNombre()
                            +"\nEdad: " + persona.getEdad()
                            +"\nTelefono: " + persona.getTelefono());
    }
}
