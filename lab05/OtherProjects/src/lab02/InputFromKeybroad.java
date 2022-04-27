package lab02;

import java.util.Scanner;

public class InputFromKeybroad {
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
