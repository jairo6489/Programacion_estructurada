package Programacion_estructurada;

import java.util.Scanner;

public class Ejercicio1_boletin {

	public static void main(String[] args) {

		// EJERCICIO 1

		Scanner keyboard = new Scanner(System.in);
		int number;

		System.out.println("Please, insert a number.");
		number = keyboard.nextInt();

		keyboard.close();

		if (number > 0) {
			System.out.printf("The number is positive  \n", number);
		} else if (number < 0) {
			System.out.printf("The number is negative  \n", number);
		} else {
			System.out.println("zero value");

		}
	}

}
