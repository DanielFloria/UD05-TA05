import java.util.Scanner;

public class Ej4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radio, area;
		
		System.out.println("Escribe el radio:");
		radio = sc.nextDouble();
		
		area = Math.PI * Math.pow(radio, 2);
		
		sc.close();
		
		System.out.println(area);
	}

}
