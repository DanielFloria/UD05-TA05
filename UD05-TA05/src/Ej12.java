import javax.swing.JOptionPane;

public class Ej12 {

	public static void main(String[] args) {
		String contrase�a = "1234";
		int numero_maximo_intentos = 3;
		
		for(int i = 0; i < numero_maximo_intentos; i++) {
			String intento = JOptionPane.showInputDialog("Escribe la contrase�a:");
			if(intento == contrase�a) {
				System.out.println("Enhorabuena");
				break;
			}
			System.out.println("Contrase�a incorrecta");
		}
	}
}
