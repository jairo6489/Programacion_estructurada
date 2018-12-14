package Programacion_estructurada;

import java.util.Scanner;

import static Programacion_estructurada.Colores.*;

public class Ejercicio4_boletin {

	public static void main(String[] args) {

		// EJERCICIO 4

		Scanner keyboard = new Scanner(System.in);
		int distance, days;
		double price;

		System.out.println(CELESTE + FONDO_BLANCO+"Please, insert the distance to travel"+RESET+MORADO + FONDO_BLANCO);
		distance = keyboard.nextInt();
		System.out.println(CELESTE + FONDO_BLANCO+"Now enter the number of days of stay"+RESET+MORADO + FONDO_BLANCO);
		days = keyboard.nextInt();
		price = (distance * 2) * 0.35;
		System.out.printf("\n");
		System.out.printf(VERDE + FONDO_BLANCO+"The price is \n%.2f\n"+RESET, price);

		keyboard.close();

		if (distance > 1000 && days > 7) {
			System.out.printf("\n");
			System.out.printf(AZUL+FONDO_BLANCO+"We have applied a 30 percent discount for exceeding 1000 km and 7 days\n");
			System.out.println(price - (price * 30 / 100)+RESET);
		}

		else {
			System.out.printf("\n");
			System.out.printf(ROJO + FONDO_BLANCO+"\nThis is your price for round tripe\n"+RESET);
		}

	}
}
