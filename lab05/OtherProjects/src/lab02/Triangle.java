package lab02;

import java.util.Scanner;

public class Triangle {
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
