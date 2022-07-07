import java.util.Scanner;

public class Ej6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final double IVA = 1.21;
		double precio;
		
		System.out.println("Escribe un precio:");
		precio = sc.nextDouble() * IVA;
		sc.close();
		
		System.out.println("El precio con IVA es " + precio);
	}

}
