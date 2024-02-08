 package _07_Actividad;

import java.util.Scanner;

public class _04_Juego_Numero_Mayor {

	public static void main(String[] args) {
		//Desarrolla un algoritmo que determine cual es el mayor 
		//de los números ingresados por teclado. El programa pedirá un 
		//número tendrá que valorar si es el mayor. El programa continuará 
		//pidiendo números hasta se ingrese un número negativo y acabará 
		//mostrando el número mayor.
		Scanner sc = new Scanner(System.in);
		System.out.println("En el siguiente programa determinaremos cual de los números");
		System.out.println("que introduzca por pantalla es mayor");
		System.out.println("El programa finalizara cuando se introduzca un número negativo");
		System.out.println();
		System.out.println("Introduzca los números");
		int numeros;
		int mayor = 0;
		
		
		do {
			numeros = sc.nextInt();
			
			if(numeros >= 0) {
				if(numeros > mayor) {
					mayor = numeros;
				}
			}else if(numeros < 0) {
				break;
			}
		
		}while( numeros >= 0);
		
		System.out.println("El número mayor es: " + mayor);
		


	}

}
