package _07_Actividad;

import java.util.Scanner;

public class _06_Verificador_De_Numeros_Primos {

	public static void main(String[] args) {
		//Desarrolla un algoritmo que determine si un número ingresado 
		//por el usuario es primo o no. Un número es primo SOLAMENTE 
		//cuando es divisible por sí mismo y por 1.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("En el suiguiente programa sabra si el número");
		System.out.println("que ingrese es primo o no");
		System.out.println();
		System.out.println("Ingrese el número: ");
		int numero = sc.nextInt();
		int i = 1;
		int contador = 0;
	
		while (i <= numero) {
			if(numero % i == 0) {
				contador ++;
				
			}
			i++;
			
		}
		if(contador == 2) {
			System.out.println("El número es primo");
		}else {
			System.out.println("El número no es primo");
		}

	}

}
