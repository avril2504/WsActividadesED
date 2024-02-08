package _03_Actividad_ED;

import java.util.Scanner;

public class Condicionales_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una edad: ");

		int edad = sc.nextInt();

		if (edad < 0 ) {

			System.out.println("Todavia no nace");
			
		}else if (edad <= 12) {
			System.out.println("Niño");

		} else if (edad <= 19) {

			System.out.println("Adolescente");

		} else if (edad <= 64) {

			System.out.println("Adulto");

		} else if (edad >= 65) {

			System.out.println("Adulto Mayor");

		}

	}

}