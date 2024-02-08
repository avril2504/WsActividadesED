package _07_Actividad;

import java.util.Scanner;

public class _03_Suma_De_Numeros_Positivos {

	public static void main(String[] args) {

		// Crea un algoritmo que solicite al usuario ingresar números positivos.
		// El programa debe calcular la suma de esos números hasta que se ingrese
		// un número negativo y acabará mostrando dicha suma.
		// Introducir numeros positivos, se debe parar cuando se introduzca uno negativo
		// Utilizar un if para decir cuando parar
		// Hacer función para la suma
		Scanner sc = new Scanner(System.in);

		System.out.println("En el siguiente programa se calculara la suma de todos");
		System.out.println("los números positivos que ingresea");
		System.out.println("dicho programa finalizara cuando ingrese un número negativo");
		System.out.println("Ingresa números positivos: ");

		int num;
		int suma = 0;

		do {
			num = (sc.nextInt());
			if (num >= 0) {
				suma += num;
			} else {
				System.out.println("Se ingreso un número negativo asi que finaliza el programa");
			}
		} while (num >= 0);
		System.out.println("La suma de los números positivos que ingreso es: " + suma);

	}

}