import javax.swing.JOptionPane;
import java.lang.Math;


//ex1
class HelloWorld{
	public static void main(String args[]){
		System.out.println("Xin chao \n cac ban!");
		System.out.println("Hello \t World");
	}
}

// ex2
class FirstDialog{
	public static void main(String[] args){
		JOptionPane.showMessageDialog(null, "hello World! How are you?");
		System.exit(0);
	}
}

//ex3
class HelloNameDialog{
	public static void main(String[] args){
		String name = JOptionPane.showInputDialog("Please enter your name: ");
		JOptionPane.showMessageDialog(null, "Hi " + name + "!");
		System.exit(0);
	}
}


//ex4 
class ShowTwoNumbers{
	public static void main(String[] args){
		String strNum1, strNum2;
		String strNotification = "You've just entered: ";

		strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ", "Input the first number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum1 + " and ";
		strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
		strNotification += strNum2;
		JOptionPane.showMessageDialog(null, strNotification, "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}


//ex5
class doubleOperations{
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

//ex6
class linearEquation{
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

class systemOfLinearEquation{
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

class quadraticEquation{
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