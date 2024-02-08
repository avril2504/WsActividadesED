package _03_Actividad_ED;

import java.util.Scanner;

public class Condicionales_05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introdusca un número: ");

		int n1 = sc.nextInt();

		System.out.println("Introduzca otro número: ");

		int n2 = sc.nextInt();

		System.out.println("Precione 1 para sumar");

		System.out.println("Presione 2 para restar");

		System.out.println("Presione 3 para multiplicar");

		System.out.println("Presione 4 para dividir");

		System.out.println("Presione 5 para saber el resto de una division");

		int Calcular = sc.nextInt();

		if (Calcular == 1) {
			System.out.println("suma: " + suma(n1, n2));
		} else if (Calcular == 2) {
			System.out.println("resta: " + resta(n1, n2));
		} else if (Calcular == 3) {
			System.out.println("multiplicación: " + multiplicacion(n1, n2));
		} else if (Calcular == 4) {
			System.out.println("division: " + division(n1, n2));
		} else if (Calcular == 5) {
			System.out.println("resto: " + resto(n1, n2));
		}

	}

	public static double suma(double n1, double n2) {

		double suma = n1 + n2;

		return suma;

	}

	public static double resta(int n1, double n2) {

		double resta = n1 - n2;

		return resta;

	}

	public static int multiplicacion(int n1, int n2) {

		int multiplicacion = n1 * n2;

		return multiplicacion;

	}

	public static int division(int n1, int n2) {

		int division = n1 / n2;

		return division;

	}

	public static int resto(int n1, int n2) {

		int resto = n1 % n2;

		return resto;

	}

}