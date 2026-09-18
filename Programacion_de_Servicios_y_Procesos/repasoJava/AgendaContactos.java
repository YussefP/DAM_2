import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeSet;

public class AgendaContactos {
    
    static TreeSet<Contacto> agenda = new TreeSet<>();
    static Scanner sc = new Scanner(System.in);
    static boolean error = true;

    public static void añadeContacto() {

        try {
            System.out.println("------------------------");
            System.out.println("    Añadir contacto     ");
            System.out.println("------------------------");
            System.out.println(" Introduce los datos del contacto nuevo: ");
            String nombre, apellido;
            int tlf;

            do {
                System.out.println(" Nombre: ");
                nombre = sc.nextLine();

                if(nombre == "" || nombre == null) {
                    System.out.println(" El nombre es obligatorio! ");
                    error = true;
                } else {
                    error = false;
                }    

            } while(error);

            System.out.println(" Apellido: ");
            apellido = sc.nextLine();

            do {
                System.out.println(" Teléfono: ");
                tlf = sc.nextInt();
                error = false;

            } while(error);


            Contacto nuevo = new Contacto(nombre, apellido, tlf);

            boolean realizado = agenda.add(nuevo);

            if(realizado) {
                System.out.println("¡Contacto añadido!");
            } else {
                System.out.println("¡Error!, el contacto ya existe en la agenda.");
            }
            
        } catch (InputMismatchException e) {
            System.out.println("\n ¡Error! El número de teléfono unicamente puede contener dígitos.");
        } catch (Exception e) {
            System.out.println(e);
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
        
        int opcion;
        boolean error = true;

        do {
            try {
                System.out.println(" ===========================");
                System.out.println("     AGENDA DE CONTACTOS    ");
                System.out.println(" ===========================");
                System.out.println("   1- Añadir contacto");
                System.out.println("   2- Buscar contacto");
                System.out.println("   3- Modificar contacto");
                System.out.println("   4- Eliminar contacto");
                System.out.println("   5- Salir");

                System.out.println(" Elige una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        añadeContacto();
                        break;
                    
                    case 2:
                        System.out.println("------------------------");
                        System.out.println("    Buscar contacto     ");
                        System.out.println("------------------------");
                        break;

                    case 3:
                        System.out.println("------------------------");
                        System.out.println("   Modificar contacto   ");
                        System.out.println("------------------------");
                        break;

                    case 4:
                        System.out.println("------------------------");
                        System.out.println("   Eliminar contacto    ");
                        System.out.println("------------------------");
                        break;

                    case 5:
                        System.out.println(" ¿Deseas abandonar el programa? (s/n): ");

                        do {
                            String sino = sc.nextLine();

                            if(sino.equals("s")) {
                                System.out.println(" ¡Hasta pronto!");
                                System.exit(0);

                            } else if (sino.equals("n")) {
                                error = true;
                            } else {
                                System.out.println(" Introduce una de las opciones disponibles (s/n): ");
                                error = false;
                            }
                        } while(error == false);
                        break;

                    default:
                        System.out.println(" Introduce una opción válida! ");
                        error = true;
                        break;
                }
            } catch(Exception e) {

            }
            

        } while(error);
        

    }
}
