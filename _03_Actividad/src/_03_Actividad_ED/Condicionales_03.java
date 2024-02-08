package _03_Actividad_ED;

import java.util.Scanner;

public class Condicionales_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduza su nota del 'tiene que ser un número del 1 al 100': ");

		int nota = sc.nextInt();

		if (nota >= 50 && nota<=100 ) {

			System.out.println("Aprobado");

		} else if (nota <=50 && nota >= 0){

			System.out.println("Suspenso");

		} else {
			System.out.println("Número fuera de rango");
		}
			

	}

}