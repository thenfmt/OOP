package lab02;

import java.util.Scanner;

public class AddTwoMatrices {
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
