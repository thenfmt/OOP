package lab01;

import javax.swing.JOptionPane;

public class quadraticEquation {
	public static void main(String[] args){
		String str_a = JOptionPane.showInputDialog(null, "Please input value of a: ", "format of equation (ax^2 + bx + c = 0)", JOptionPane.INFORMATION_MESSAGE);
		String str_b = JOptionPane.showInputDialog(null, "Please input value of b: ", "format of equation (ax^2 + bx + c = 0)", JOptionPane.INFORMATION_MESSAGE);
		String str_c = JOptionPane.showInputDialog(null, "Please input value of c: ", "format of equation (ax^2 + bx + c = 0)", JOptionPane.INFORMATION_MESSAGE);
		
		Double a = Double.parseDouble(str_a);
		Double b = Double.parseDouble(str_b);
		Double c = Double.parseDouble(str_c);

		Double delta = b*b - 4*a*c;

		String result = "";
		if(a == 0){
			result = "Value of a can not be zero";
		}else{

			if(delta == 0){
				String x = String.format("%.2f", -0.5*(b/a));
				result = "The equation has double root x1 = x2 = " + x;
			}

			if(delta > 0){
				String x1 = String.format("%.2f", 0.5*(-b+Math.sqrt(delta))/a);
				String x2 = String.format("%.2f", 0.5*(-b-Math.sqrt(delta))/a);

				result = "The equation has two distinct roots (x1, x2) = (" + x1 + ", " + x2 + ")";
			}

			if(delta < 0){
				result = "The equation has no solution";
			}
		}

		JOptionPane.showMessageDialog(null, result, "Result of the quadratic equation", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}
