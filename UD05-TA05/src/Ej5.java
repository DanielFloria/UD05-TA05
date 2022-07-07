import java.util.Scanner;

public class Ej5 {

	public static void main(String[] args) {
		System.out.println("Escribe un número:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();		
		
		if(num % 2 == 0) System.out.println(num + " es divisible entre 2");
		else System.out.println(num + " no es divisible entre 2");

	}

}
