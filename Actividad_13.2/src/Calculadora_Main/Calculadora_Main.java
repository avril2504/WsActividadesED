package Calculadora_Main;

import java.util.Scanner;

import Actividad13.Matematica;

public class Calculadora_Main {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int opcion = 0;
			do {	
			System.out.println("----------menú----------");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. Dvisión");
			opcion = sc.nextInt();
			System.out.println("Introduzca un número");
			double n1 = sc.nextDouble();
			System.out.println("Introduzca otro número");
			double n2 = sc.nextDouble();
			switch(opcion) {
			case 1:
				System.out.println("Resultado: " + Matematica.suma(n1, n2));
				break;
			case 2:
				System.out.println("Resultado: " + Matematica.resta(n1, n2));
				break;
			case 3:
				System.out.println("Resultado: " + Matematica.multiplicacion(n1, n2));
				break;
			case 4:
				System.out.println("Resultado: " + Matematica.division(n1, n2));
			default:
				System.out.println("opción no valida");
			   }	
			}while(opcion != 4);
			sc.close();
		
	}
}
