import javax.swing.JOptionPane;

public class Ej13 {

	public static void main(String[] args) {
		int operando1;
		int operando2;
		String signo_aritmetico;
		
		String operando1_raw = JOptionPane.showInputDialog("Escribe el primer operando:");
		operando1 = Integer.parseInt(operando1_raw);
		String operando2_raw = JOptionPane.showInputDialog("Escribe el segundo operando:");
		operando2 = Integer.parseInt(operando2_raw);
		signo_aritmetico = JOptionPane.showInputDialog("Escribe el signo aritmético:");
		
		switch(signo_aritmetico) {
		case "+":
			JOptionPane.showMessageDialog(null, operando1 + operando2);
			break;
		case "-":
			JOptionPane.showMessageDialog(null, operando1 - operando2);
			break;
		case "*":
			JOptionPane.showMessageDialog(null, operando1 * operando2);
			break;
		case "/":
			JOptionPane.showMessageDialog(null, (double)operando1 / (double)operando2);
			break;
		case "^":
			JOptionPane.showMessageDialog(null, (int)Math.pow(operando1, operando2));
			break;
		case "%":
			JOptionPane.showMessageDialog(null, operando1 % operando2);
			break;
		default:
			JOptionPane.showMessageDialog(null, "No es un signo válido");
			break;
		}	
	}
}
