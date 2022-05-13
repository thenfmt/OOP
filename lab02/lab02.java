import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Arrays;

class ChoosingOption{
	public static void main(String[] args){
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket");
		JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}

class InputFromKeyrroad{
	public static void main(String[] args){
		Scanner keybroad = new Scanner(System.in);

		System.out.println("what's your name?");
		String name = keybroad.nextLine();

		System.out.println("How old are you?");
		int age = keybroad.nextInt();

		System.out.println("How tall are you?");
		Double height = keybroad.nextDouble();

		System.out.println(name + " " + age + " years old." + "Your height is " + height + ".");
	}
}

class Triangle{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter triangle height: ");
		int height = sc.nextInt();

		for(int i = 0; i < height; i++){
			for(int j = i; j < height; j++){
				System.out.print(" ");
			}
			for(int k = 0; k  < i*2+1 ; k++){
				System.out.print("*");
			}

			System.out.println("");
		}
	}
}

class DayOfMonth{
	public static void main(String[] args){
		String[] dayOf_31 = {"January", "Jan.", "Jan", "1", "March", "Mar.", "Mar", "3", "May", "5", "July", "Jul", "7", "August", "Aug.", "Aug", "8", "December", "Dec.", "Dec", "12"};
		String[] dayOf_30 = {"April", "Apr.", "Apr", "4", "June", "Jun", "6", "September", "Sept.", "Sep", "9", "November", "Nov.", "Nov", "11"};
		String[] dayOf_28_29 = {"February", "Feb.", "Feb", "2"};
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter month and year: ");
		String str = sc.nextLine();
		String[] splited = str.split(" ");

		int year = Integer.valueOf(splited[1]);
		boolean isLeapYear = (year%4 == 0 && year%100 == 0 && year%400 == 0);

		if(Arrays.asList(dayOf_30).contains(splited[0])){
			System.out.println("There are 30 days in " + splited[0] + "/" + splited[1]);
			return;
		}

		if(Arrays.asList(dayOf_31).contains(splited[0])){
			System.out.println("There are 31 days in " + splited[0] + "/" + splited[1]);
			return;
		}

		if(Arrays.asList(dayOf_28_29).contains(splited[0]) && isLeapYear){
			System.out.println("There are 29 days in " + splited[0] + "/" + splited[1]);
			return;
		}else{
			System.out.println("There are 28 days in " + splited[0] + "/" + splited[1]);
			return;
		}
	}
}

class NumericArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many number in your array: ");
		int n = sc.nextInt();
		int sum = 0;
		
		int array[] = new int[n];

		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
			sum += array[i];
		}

		System.out.println("Your array is: ");
		for(int i = 0; i < n; i++){
			System.out.print(array[i] + " ");
		}

		System.out.println("\nYour array after sort is: ");
		Arrays.sort(array);
		for(int i = 0; i < n; i++){
			System.out.print(array[i] + " ");
		}

		System.out.println("\nThe sum is: " + sum);
		System.out.println("The average is: " + (sum/n));
	}
}


class AddTwoMatrices{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter how many row: ");
		int row = sc.nextInt();

		System.out.print("Enter how many column: ");
		int col = sc.nextInt();

		int[][] firstMatric = new int[row][col];
		int[][] secondMatric = new int[row][col];
		int[][] addedMatric = new int[row][col];

		System.out.println("Enter the first matric: ");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				firstMatric[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter the second matric: ");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				secondMatric[i][j] = sc.nextInt();
			}
		}

		//adding
		for(int i = 0; i < row; i++){
			for(int j = 0;j < col; j++){
				addedMatric[i][j] = firstMatric[i][j] + secondMatric[i][j];
			}
		}

		//print result
		System.out.println("The result is: ");
		for(int i = 0; i < row; i++){
			for(int j = 0; j < col; j++){
				System.out.print(addedMatric[i][j] + " ");
			}
			System.out.println();
		}

	}
}