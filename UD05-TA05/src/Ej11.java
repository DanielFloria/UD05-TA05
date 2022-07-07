import javax.swing.JOptionPane;

public class Ej11 {

	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Escribe el día de la semana:");
		
		switch(dia) {
		case "lunes":
		case "martes":
		case "miércoles":
		case "jueves":
		case "viernes":
			JOptionPane.showMessageDialog(null, dia + " es día laboral");
			break;
		case "sábado":
		case "domingo":
			JOptionPane.showMessageDialog(null, dia + " no es día laboral");
		default:
			JOptionPane.showMessageDialog(null, dia + " no es un día válido");
			break;
		}
	}

}
