package lab01;

import javax.swing.JOptionPane;

public class linearEquation {
	public static void main(String[] args){
		String str_a = JOptionPane.showInputDialog(null, "Please enter value of a: ", "Equation format (ax + b = 0)", JOptionPane.INFORMATION_MESSAGE);
		String str_b = JOptionPane.showInputDialog(null, "Please enter value of b: ", "Equation format (ax + b = 0)", JOptionPane.INFORMATION_MESSAGE);

		Double a = Double.parseDouble(str_a);
		Double b = Double.parseDouble(str_b);

		String x = String.format("%.2f", -b/a);

		JOptionPane.showMessageDialog(null, x, "Result of the equation", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}
