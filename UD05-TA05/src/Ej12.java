import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		String contraseņa = "1234";
		int numero_maximo_intentos = 3;
		
		for(int i = 0; i < numero_maximo_intentos; i++) {
			String intento = JOptionPane.showInputDialog("Escribe la contraseņa:");
			if(intento == contraseņa) {
				System.out.println("Enhorabuena");
				break;
			}
			System.out.println("Contraseņa incorrecta");
		}
	}
}
