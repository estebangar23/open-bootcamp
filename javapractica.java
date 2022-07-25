
public class javapractica {
    /*
     * Crear clase Persona.
     * Crear variables las privadas edad, nombre y telefono de la clase Persona.
     * Crear gets y sets de cada propiedad.
     * Crear un objeto persona en el main.
     * Utiliza los gets y sets para darle valores a las propiedades edad,
     * nombre y telefono, por último muéstralas por consola.
     */

    public static void main(String[] args) {

        persona hombre = new persona();
        hombre.setNombre("Nombre: Esteban");
        hombre.setEdad("Edad: 34 años");
        hombre.setTelefono("Numero celular: 319 448 26 05");

        persona mujer = new persona();
        mujer.setNombre("Nombre: Elizabeth");
        mujer.setEdad("Edad: 6 años");
        mujer.setTelefono("Numero telefonico: 599 55 83");

        System.out.println(hombre.getNombre());
        System.out.println(hombre.getEdad());
        System.out.println(hombre.getTelefono());

        System.out.println(mujer.getNombre());
        System.out.println(mujer.getEdad());
        System.out.println(mujer.getTelefono());
    }

}

class persona {

    private String nombre;
    private String edad;
    private String telefono;

    // para fijar.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    // para obtener.
    public String getNombre() {
        return this.nombre;
    }

    public String getEdad() {
        return this.edad;
    }

    public String getTelefono() {
        return this.telefono;
    }

}
