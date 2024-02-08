package _05_actividad_ed;

import java.util.Scanner;

public class Ejercicios {

	public static void main(String[] args) {

		// Ejercicio 1
		for (int i = 1; i <= 10; i++) {
			System.out.println("Los números del 1 al 10: " + i);
		}

		// Ejercicio 2
		System.out.println("--------------------------------------");
		for (int i = 2; i <= 20; i += 2) {
			System.out.println("Números pares hasta el 20: " + i);
		}

		// Ejercicio 3
		System.out.println("--------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int n1 = sc.nextInt();
		System.out.println("Introduzca otro número");
		int n2 = sc.nextInt();
		for (int i = n1; i <= n2; i++) {
			System.out.println("Números entre los números introducidos: " + i);
		}

		// Ejercicio 4
		System.out.println("--------------------------------------");
		int suma = 0;
		for (int i = 1; i <= 100; i++) {
			suma += i;
			System.out.println("La suma de los primeros 100 números naturales: " + suma);
		}

		// Ejercico 5
		System.out.println("--------------------------------------");
		System.out.println("Introduzca un número: ");
		int n3 = sc.nextInt();
		for (int i = 1; i <= 10; i++) {
			int multiplicacion = n3 * i;
			System.out.println("Tabla de multiplicar del " + multiplicacion);
		}

		// Ejercicio 6
		System.out.println("--------------------------------------");
		for (int i = 10; i >= 1; i--) {
			System.out.println("Los números del 10 al 1: " + i);
		}

		// Ejercicio 7
		System.out.println("--------------------------------------");
		int suma2 = 0;
		for (int i = 0; i <= 50; i += 2) {
			suma2 += i;
			System.out.println("La suma de los números pares del 1 al 50 es: " + suma2);
		}

		// Ejercicio 8
		System.out.println("--------------------------------------");
		System.out.println("Introduzca un número: ");
		int n4 = sc.nextInt();
		int factorial = 1;
		for (int i = 1; i <= n4; i++) {
			factorial *= i;
			System.out.println("Factorial de " + n4 + " es: " + factorial);

		}
		System.out.println("--------------------------------------");
		// Ejercico 9
		ejercico3(5, 9);
		ejercicio5(5);
		ejercicio8(3);
		
		System.out.println("--------------------------------------");
		// Ejercicio 10
		for (int i = 1; i <= 30; i += 2) {
			System.out.println("Los números impares del 1 al 30: " + i);

		}
		
		// Ejercicio 11
		System.out.println("--------------------------------------");
		System.out.println("Introduzca el número de la base: ");
		int base = sc.nextInt();
		System.out.println("Introduzca el número del exponente: ");
		int exponente = sc.nextInt();
		int resultado = 1;
		for (int i = 1; i <= exponente; i++) {
		resultado *= base;
		}
		System.out.println("El resultado es: " + resultado);

		System.out.println("--------------------------------------");
	}

	public static void ejercico3(int n5, int n6) {
		for (int i = n5; i <= n6; i++) {
			System.out.println("Números entre los números introducidos: " + i);
		}

		System.out.println("************************************************");
	}

	public static void ejercicio5(int n7) {
		for (int i = 1; i <= 10; i++) {
			int multiplicacion = n7 * i;
			System.out.println("Tabla de multiplicar del " + multiplicacion);
		}

		System.out.println("************************************************");
	}

	public static void ejercicio8(int n8) {
		int factorial = 1;
		for (int i = 1; i <= n8; i++) {
			factorial *= i;
			System.out.println("Factorial de " + n8 + " es: " + factorial);
		}

	}

}
