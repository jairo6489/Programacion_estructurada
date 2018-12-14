package Programacion_estructurada;

import java.util.Scanner;

public class Ejercicio2_boletin {

	public static void main(String[] args) {
		// EJERCICIO 2

		Scanner keyboard = new Scanner(System.in);
		int x, y;

		System.out.println("Please, insert a number.");
		x = keyboard.nextInt();
		System.out.println("Please, insert a other number.");
		y = keyboard.nextInt();
		System.out.println("quotiente" + ":" + x / y);
		System.out.println("rest" + ":" + x % y);

		keyboard.close();

		if (x % y == 0) {
			System.out.printf("%d It is multiple %d \n", x, y);
		} else {
			System.out.printf("%d It is not multiple %d \n", x, y);
		}
	}

}
