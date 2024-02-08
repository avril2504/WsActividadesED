package _04_Actividad_ED;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		
		//Ejercico 5
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n1 = sc.nextInt();
		System.out.println("Introduzca otro número: ");
		int n2 = sc.nextInt();
		menu();
		int opcion = sc.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.println("La suma es: " + suma(n1, n2));
			break;
		case 2:
			System.out.println("La resta es: " + resta(n1, n2));
			break;
		case 3:
			System.out.println("La multiplicación es: " + multiplicacion(n1, n2));
			break;
		case 4:
			System.out.println("La division es: " + division(n1, n2));
			break;
		case 5:
			System.out.println("La division es: " + division(n1, n2) );
			break;
		default:
			System.out.println("El número introducido no es una opción");
			break;
		}
		

	}
	public static void menu() {
		System.out.println("Suma: pulse 1");
		System.out.println("Resta: pulse 2");
		System.out.println("Multiplicación: pulse 3");
		System.out.println("Division: pulse 4");
		System.out.println("Resto: pulse 5");
		
	}
	public static int suma (int n1, int n2) {
		int suma = n1 + n2;
		return suma;
		
	}
	public static int resta (int n1, int n2) {
		int resta = n1 - n2;
		return resta;
		
	}
	public static int multiplicacion (int n1, int n2) {
		int multiplicacion = n1 * n2;
		return multiplicacion;
		
	}
	public static int division (int n1, int n2) {
		int division = n1 / n2;
		return division;
		
	}
	public static int resto (int n1, int n2) {
		int resto = n1 % n2;
		return resto;
		
	}
}
