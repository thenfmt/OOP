package lab01;

import javax.swing.JOptionPane;

public class doubleOperations {
	public static void main(String[] args){
		String strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		String strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);

		Double num1 = Double.parseDouble(strNum1);
		Double num2 = Double.parseDouble(strNum2);


		Double sum = num1 + num2;
		Double difference = num1 - num2;
		Double product = num1*num2;
		String quotient;

		if(num2 == 0){
			quotient = "Can't divide by zero";
		}else{
			quotient = String.format("%.2f", num1/num2);
		}

		String result = "Sum = " + sum + "\nDifference = " + difference + "\nProduct = " + product + "\nQuotient = " + quotient;
		
		JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);

		System.exit(0);
	}
}
