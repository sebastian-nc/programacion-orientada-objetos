package semana_1.caso1;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {
		
	Scanner teclado = new Scanner(System.in);

	System.out.print("Numero uno: ");
    int num1 = teclado.nextInt();

    System.out.print("Numero dos: ");
    int num2 = teclado.nextInt();

    System.out.println("Elija una operación: +, -, *, /");
    char operacion = teclado.next().charAt(0);

    double resultado = 0;
    boolean operacionValida = true;

    switch (operacion) {
        case '+':
            resultado = sumar(num1, num2);
            break;
        case '-':
            resultado = restar(num1, num2);
            break;
        case '*':
            resultado = multiplicar(num1, num2);
            break;
        case '/':
            if (num2 != 0) {
                resultado = dividir(num1, num2);
            } else {
                System.out.println("Error: No se puede dividir entre cero.");
                operacionValida = false;
            }
            break;
        default:
            System.out.println("Operación no válida.");
            operacionValida = false;
    }

    if (operacionValida) {
        System.out.println("El resultado es: " + resultado);
    }
    
    teclado.close();
}
	
	
	public static int sumar(int num1, int num2 ) {
		return num1 + num2;
	}
	
	public static int restar(int num1, int num2 ) {
		return num1 - num2;
	}

	public static int multiplicar(int num1, int num2 ) {
		return num1 * num2;
	}

	public static int dividir(int num1, int num2 ) {
		return num1 / num2;
	}
}
