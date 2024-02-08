package _07_Actividad;

import java.util.Scanner;

public class _08_Calculadora {

	public static void main(String[] args) {
		//Escribe un algoritmo que muestre el siguiente menú:
		//Sumar
		//Restar
		//Multiplicar
		//Dividir
		//Salir del programa
		//El programa a continuación pedirá los dos números con
		//los que queremos operar, y realizará la operación elegida 
		//mostrando el resultado al usuario. Se volverá a mostrar el 
		//menú el usuario hasta que el usuario elija la opción “Salir del programa”.
		Scanner sc = new Scanner(System.in);

		System.out.println("En el siguiente programa se mostrara una calculadora");
		
		int n1;
		int n2;
		int opcion;

		do {
			menu();
			opcion = sc.nextInt();
			if(opcion != 5) {
			System.out.println("Introdusca un número: ");
			n1 = sc.nextInt();
			System.out.println("Introduzca otro número: ");
			n2 = sc.nextInt();

			
		if (opcion == 1) {
			System.out.println("suma: " + suma(n1, n2));
		} else if (opcion == 2) {
			System.out.println("resta: " + resta(n1, n2));
		} else if (opcion == 3) {
			System.out.println("multiplicación: " + multiplicacion(n1, n2));
		} else if (opcion == 4) {
			System.out.println("division: " + division(n1, n2));
		} else if (opcion != 5) {
		}
			}
		}while(opcion != 5);
		System.out.println("Saliste del programa");

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
	
	public static void menu() {
		System.out.println("--------------Menu---------------");
		System.out.println("Precione 1 para sumar");
		System.out.println("Presione 2 para restar");
		System.out.println("Presione 3 para multiplicar");
		System.out.println("Presione 4 para dividir");
		System.out.println("Presione 5 para salir del programa");
		
	}


}
