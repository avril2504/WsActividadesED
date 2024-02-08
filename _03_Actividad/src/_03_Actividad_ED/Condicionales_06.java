package _03_Actividad_ED;

import java.util.Scanner;

public class Condicionales_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número: ");
		int n1 = sc.nextInt();

		if ( n1 % 2 == 0) {
			System.out.println("Este un número par");
		} else {
			System.out.println("Es un número impar");
		}

	}

}