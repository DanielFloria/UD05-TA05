import javax.swing.JOptionPane;

public class Ej11 {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Escribe el d�a de la semana:");
		
		switch(dia) {
		case "lunes":
		case "martes":
		case "mi�rcoles":
		case "jueves":
		case "viernes":
			JOptionPane.showMessageDialog(null, dia + " es d�a laboral");
			break;
		case "s�bado":
		case "domingo":
			JOptionPane.showMessageDialog(null, dia + " no es d�a laboral");
		default:
			JOptionPane.showMessageDialog(null, dia + " no es un d�a v�lido");
			break;
		}
	}

}
