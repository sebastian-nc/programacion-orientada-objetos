package semana_1.caso2;

public class Persona {
	String nombre;
	int edad;
	
	public void mostrarDatos() {
		System.out.println("Nombre: " + nombre + " , Edad: " + edad + " años");
	}
	
	public static void main(String[] args) {
		Persona persona1 = new Persona();
        persona1.nombre = "Carlos";
        persona1.edad = 20;
        
        Persona persona2 = new Persona();
        persona2.nombre = "Ana";
        persona2.edad = 22;
        
        System.out.println("Mostrando datos");
        
        persona1.mostrarDatos();
        persona2.mostrarDatos();
	}
}
