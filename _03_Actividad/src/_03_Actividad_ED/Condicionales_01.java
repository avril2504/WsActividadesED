package _03_Actividad_ED;

import java.util.Scanner;

public class Condicionales_01 {

	// Ejercicio 1
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número: ");
		int n1 = sc.nextInt();

		System.out.println("Introduzca otro número ");
		int n2 = sc.nextInt();
		menorMayor(n1, n2);

	}

	public static void menorMayor(int n1, int n2) {
		if (n1 > n2) {
			System.out.println("El numero es mayor que ");
		} else if (n1 < n2) {
			System.out.println("El numero 1 es menor que el 2");
		} else if (n1 == n2) {
			System.out.println("El numero es igual");
		}
	}
	
}

