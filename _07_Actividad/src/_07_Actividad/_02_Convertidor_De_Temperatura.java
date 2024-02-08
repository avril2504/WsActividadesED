package _07_Actividad;

import java.util.Scanner;

public class _02_Convertidor_De_Temperatura {

	public static void main(String[] args) {

		// Diseña un algoritmo que convierta temperaturas entre Celsius y Fahrenheit.
		// El usuario debe elegir la dirección de la conversión y proporcionar la
		// temperatura.

		Scanner sc = new Scanner(System.in);
		// Hacer la función menu, una que transforme de c a f y de f a c.

		System.out.println("En el siguiente programa transformaremos " + "la medida de temperatura según desee");
		System.out.println("Introduzca la temperatura a transformar");
		int temperatura = sc.nextInt();

		menu();

		int opcion = sc.nextInt();

		if (opcion == 1) {
			System.out.println("La temperatura de Celsius a Fahrenheit es: " + cf(temperatura));
		} else if (opcion == 2) {
			System.out.println("La temperatura de Fahrenheit a Celsius es: " + fc(temperatura));

		}

	}

	public static void menu() {
		System.out.println("marque 1 si desea de Celsius a Fahrenheit ");
		System.out.println("marque 2 si desea de Fahrenheit a Celcius");

	}

	public static double fc(double temperatura) {
		double fc = (temperatura - 32) / 1.8;
		return fc;

	}

	public static double cf(double temperatura) {
		double cf = (temperatura * 1.8) + 32;
		return cf;

	}

}