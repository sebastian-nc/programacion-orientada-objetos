package semana_1.caso3;

public class Operacion {
	
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        
        System.out.println("25 + 50: " + operacion.sumar(25, 50));
        System.out.println("1.7 + 4.2: " + operacion.sumar(1.7, 4.2));
        System.out.println("5 + 4 + 15: " + operacion.sumar(5, 4, 15));
    }
}
