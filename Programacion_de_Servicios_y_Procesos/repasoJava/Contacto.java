
import java.util.Objects;
class Contacto implements Comparable<Contacto> {

    private String nombre;
    private String apellido;
    private int tlf;

    /**
     * Constructor de la clase Contacto
     * @param nombre
     * @param apellido
     * @param tlf
     */

    public Contacto(String nombre, String apellido, int tlf) {

        if(nombre == null || nombre.isEmpty() || nombre.isBlank())
            throw new IllegalArgumentException("El nombre es obligatorio");

        if(!String.valueOf(tlf).matches("\\d{9}"))
            throw new IllegalArgumentException("El teléfono debe contener 9 dígitos");

        this.nombre = nombre;
        this.apellido = apellido;
        this.tlf = tlf;
    }

    // Getters y Setters

    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public int getTlf() {return tlf;}

    public void setNombre(String nombre) {

        if(nombre == null || nombre.isEmpty() || nombre.isBlank())
            throw new IllegalArgumentException("El nombre es obligatorio");

        this.nombre = nombre;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public void setTlf(int tlf) {

        if(!String.valueOf(tlf).matches("\\d{9}"))
            throw new IllegalArgumentException("El teléfono debe contener 9 dígitos");

        this.tlf = tlf;
    }

    // Sobreescritura de métodos

    @Override
    public String toString() {

        return "{Nombre: " + nombre + ", Apellido: " + apellido + ", Teléfono: " + tlf + "}";
    }

    @Override 
    public int hashCode() {

        return Objects.hash(tlf);
    }

    @Override 
    public boolean equals(Object obj) {

        if(this == obj) return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass()) return false;
        Contacto otro = (Contacto)obj;

        return Objects.equals(tlf, otro.tlf);
    }

    @Override 
    public int compareTo(Contacto nuevo) {

        int comparacion = this.nombre.compareToIgnoreCase(nuevo.nombre);

        if(comparacion != 0) return comparacion;

        return this.apellido.compareToIgnoreCase(nuevo.apellido);
    }
}