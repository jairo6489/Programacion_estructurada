package Programacion_estructurada;

import java.util.Scanner;

import static Programacion_estructurada.Colores.*;

public class Ejercicio3_boletin {

	public static void main(String[] args) {

		// EJERCICIO 3

		Scanner keyboard = new Scanner(System.in);
		int n1, n2, n3;

		System.out.println(CELESTE + FONDO_NEGRO + "Please, insert a number." + RESET + AZUL + FONDO_NEGRO);
		n1 = keyboard.nextInt();
		System.out.println(CELESTE + FONDO_NEGRO + "Please, insert a other number." + RESET + AZUL + FONDO_NEGRO);
		n2 = keyboard.nextInt();
		System.out.println(CELESTE + FONDO_NEGRO + "Please, insert a one number more." + RESET + AZUL + FONDO_NEGRO);
		n3 = keyboard.nextInt();

		keyboard.close();

		// Si no se cumple esta condición, no se ejecuta el programa

		if (n1 < 0 || n2 < 0 || n3 < 0) {
			System.out.println(ROJO + FONDO_NEGRO + "One number is negative, please enter positive values." + RESET);
		}

		else {

			// inicia ejecucion

			if (n1 == n2 && n1 == n3) {
				System.out.printf(VERDE + FONDO_NEGRO + "%d and %d and %d \nAll numbers are similars" + RESET, n1, n2,
						n3);
			}

			else if (n1 == n2 && n1 != n3) {
				System.out.printf(VERDE + FONDO_NEGRO + "%d and %d \nOnly two numbers are similars" + RESET, n1, n2);
			} else if (n2 == n3 && n1 != n2) {
				System.out.printf(VERDE + FONDO_NEGRO + "%d and %d \nOnly two numbers are similars" + RESET, n2, n3);
			} else if (n1 == n3 && n1 != n2) {
				System.out.printf(VERDE + FONDO_NEGRO + "%d and %d \nOnly two numbers are similars" + RESET, n1, n3);
			}

			// Se ejecuta esta ultima condicion cuando son diferentes todos
			else {
				System.out.println(MORADO + FONDO_NEGRO + "All number are diferent" + RESET);
			}
			

			// finaliza ejecucion
		}

	}

}
