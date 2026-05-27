package caso4;

public class Contador {
	
	public static int valor = 0;

    public Contador() {
        valor++;
    }

    public static void main(String[] args) {
        Contador obj1 = new Contador();
        Contador obj2 = new Contador();
        Contador obj3 = new Contador();

        System.out.println("Total de objetos: " + Contador.valor);
    }
}
