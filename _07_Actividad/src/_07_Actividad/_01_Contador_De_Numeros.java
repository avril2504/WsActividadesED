package _07_Actividad;

import java.util.Scanner;

public class _01_Contador_De_Numeros {

	public static void main(String[] args) {
		// Escribe un algoritmo que cuente y muestre la cantidad
		// de números pares en un rango dado por el usuario.
		Scanner sc = new Scanner(System.in);

		System.out.println("En el siguiente programa podra saber el rango");
		System.out.println("de números pares que haya entre los números que introduzca");
		System.out.println("A cotinuación introduzca un número");
		int n1 = sc.nextInt();
		System.out.println("Por favor, introduzca otro número");
		int n2 = sc.nextInt();
		int contador = 0;
		// ejemplo rango: 2-10 hay 5 pares
		// el bucle tiene que recorrer desde el 2 hasta el 10
		// imrpimir SOLO los numeros pares que se encuentran en el rango --- condicion
		// contar la cantidad de numeros pares
  
		for (int i = n1; i <= n2; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				contador++;
			}

		}

		System.out.println("La cantidad de números pares que se cuentan en el rango: " + contador);

	}

}
