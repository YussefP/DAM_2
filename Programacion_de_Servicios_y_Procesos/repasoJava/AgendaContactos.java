import java.util.Scanner;
import java.util.TreeSet;

public class AgendaContactos {
    
    public static TreeSet<Contacto> agenda = new TreeSet<>();

    public static void añadeContacto(Contacto nuevo) {

        try {
            boolean realizado = agenda.add(nuevo);

            if(realizado) {
                System.out.println("¡Contacto añadido!");
            } else {
                System.out.println("¡Error!, el contacto ya existe en la agenda.");
            }
            
        } catch (Exception e) {
            System.out.println(e + "\nError, contacto erroneo.");
        }
    }

    public static void borraContacto(Contacto guardado) {

        try {
            boolean borrado = agenda.remove(guardado);

            if(borrado) {
                System.out.println("¡Contacto borrado!");
            } else {
                System.out.println("¡Error!, el contacto no existe en la agenda.");
            }

        } catch (Exception e) {
            System.out.println(e + "\nError, contacto erroneo2.");
        }
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println(" ===========================");
        System.out.println("     AGENDA DE CONTACTOS    ");
        System.out.println(" ===========================");
        System.out.println("   1- Añadir contacto");
        System.out.println("   2- Buscar contacto");
        System.out.println("   3- Modificar contacto");
        System.out.println("   4- Eliminar contacto");
        System.out.println("   5- Salir");

    }
}
