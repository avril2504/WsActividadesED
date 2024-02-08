package _04_Actividad_ED;

import java.util.Scanner;

public class Switch_02 {

	public static void main(String[] args) {
		
		//Ejercicio 6
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n1 = sc.nextInt();
		int resto = n1 % 2;
		switch (resto) {
		case 0:
			System.out.println("Es par");
			break;
		default:
			System.out.println("Es Impar");
			break;
		}

	}

}
