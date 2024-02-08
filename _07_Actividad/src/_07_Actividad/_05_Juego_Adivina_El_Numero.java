package _07_Actividad;

import java.util.Random;
import java.util.Scanner;

public class _05_Juego_Adivina_El_Numero {

	public static void main(String[] args) {
		// Crea un juego donde el programa genera un número aleatorio
		// y el usuario tiene que adivinarlo. El programa debe dar pistas como
		// "muy alto" o "muy bajo" hasta que el usuario adivine.
		// Para generar números aleatorios podemos usar las siguientes sentencias:
		// Random r = new Random();
		// int valorDado = r.nextInt(10)+1;// Genera un número aleatorio del 1 al 10,
		// ambos incluidos.
		Scanner sc = new Scanner(System.in);

		System.out.println("En el siguiente programa tendras que adivinar el número");
		System.out.println("que se genera aleatoriamente.");
		System.out.println("Se te proporcionaran pistas como 'estas cerca' o");
		System.out.println("'estas lejos'");
		System.out.println();
		System.out.println("Empecemos el juego, introduzca números");
		System.out.println("Pista: El número esta comprendido entre el 1 y el 10 :)");

		Random r = new Random();
		int valorDado = r.nextInt(10) + 1;
		int numeros;

		do {

			numeros = sc.nextInt();

			if (numeros == valorDado) {
				System.out.println("Felicidades, has acertado");
			}
			if (numeros < valorDado) {
				System.out.println("Estas cerca");
			} else if (numeros > valorDado) {
				System.out.println("Estas lejos");
			}
		} while (numeros != valorDado);

	}

}
