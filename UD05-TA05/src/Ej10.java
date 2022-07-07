import javax.swing.JOptionPane;

public class Ej10 {

	public static void main(String[] args) {
		String numero_ventas_raw = JOptionPane.showInputDialog("Número de ventas a entrar:");
		int numero_ventas = Integer.parseInt(numero_ventas_raw);
		double precio_total = 0;
		
		for(int i = 0; i < numero_ventas; i++) {
			String precio_venta_raw = JOptionPane.showInputDialog("Precio venta:");
			double precio_venta = Double.parseDouble(precio_venta_raw);
			precio_total += precio_venta;
		}
		
		JOptionPane.showMessageDialog(null, "El precio total de las ventas es: " + precio_total);
	}

}
