package caso5;
import java.util.ArrayList;
import java.util.Scanner;

public class Estudiante {
	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<String> estudiantes = new ArrayList<>();
        String opcion;

      
        try {
            while (true) {
                System.out.print("Ingrese el nombre del estudiante (o escriba 'salir'): ");
                String nombre = teclado.nextLine();

                if (nombre.equals("salir")) {
                    break; 
                }

                estudiantes.add(nombre);
            }

            System.out.println("\n--- Lista de Estudiantes ---");
            
            for (String estudiante : estudiantes) {
                System.out.println("- " + estudiante);
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado en el ingreso de datos.");
        } finally {
            teclado.close();
        }
    }
}
