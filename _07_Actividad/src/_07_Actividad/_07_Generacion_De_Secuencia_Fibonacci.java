package _07_Actividad;

import java.util.Scanner;

public class _07_Generacion_De_Secuencia_Fibonacci {

	public static void main(String[] args) {

		// Escribe un algoritmo que genere los primeros
		// N términos de la secuencia Fibonacci, donde N
		// es proporcionado por el usuario.
		Scanner sc = new Scanner(System.in);

		System.out.println("En el siguiente programa se generara");
		System.out.println("la secuencia de los primeros números");
		System.out.println("de la secuencia fibonacci a partir");
		System.out.println("de un número que introduzca");
		System.out.println();
		System.out.println("Introduzca un número");
		int numero = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		int suma = 1;

		for (int i = 1; i < numero; i++) {
			System.out.println(suma);
			
			suma = n1 + n2;
			n1 = n2;
			n2 = suma;

		}

	}

}