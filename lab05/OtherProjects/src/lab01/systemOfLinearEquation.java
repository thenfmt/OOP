package lab01;

import javax.swing.JOptionPane;

public class systemOfLinearEquation {
	public static void main(String[] args){
		String str_a1 = JOptionPane.showInputDialog(null, "Please enter value of a1: ", "Enter data", JOptionPane.INFORMATION_MESSAGE);
		String str_b1 = JOptionPane.showInputDialog(null, "Please enter value of b1: ", "Enter data", JOptionPane.INFORMATION_MESSAGE);
		String str_c1 = JOptionPane.showInputDialog(null, "Please enter value of c1: ", "Enter data", JOptionPane.INFORMATION_MESSAGE);
		
		String str_a2 = JOptionPane.showInputDialog(null, "Please enter value of a2: ", "Enter data", JOptionPane.INFORMATION_MESSAGE);
		String str_b2 = JOptionPane.showInputDialog(null, "Please enter value of b2: ", "Enter data", JOptionPane.INFORMATION_MESSAGE);
		String str_c2 = JOptionPane.showInputDialog(null, "Please enter value of c2: ", "Enter data", JOptionPane.INFORMATION_MESSAGE);

		Double a1 = Double.parseDouble(str_a1);
		Double b1 = Double.parseDouble(str_b1);
		Double c1 = Double.parseDouble(str_c1);

		Double a2 = Double.parseDouble(str_a2);
		Double b2 = Double.parseDouble(str_b2);
		Double c2 = Double.parseDouble(str_c2);

		Double D = a1*b2 - a2*b1;
		Double D1 = c1*b2 - c2*b1;
		Double D2 = a1*c2 - a2*c1;

		String result;
		if(D != 0.0){
			String x1 = String.format("%.2f", D1/D);
			String x2 = String.format("%.2f", D2/D);
			result = "The system has a unique solution (x1, x2) = (" + x1 + ", " + x2 + ")";
		}else{
			if(D1 == 0.0 && D2 == 0.0){
				result = "The system has infinitely many solutin ";
			}else{
				result = "The system has no solution";
			}
		}

		JOptionPane.showMessageDialog(null, result, "Result of the system linear equation", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
