package _04_Actividad_ED;

import java.util.Scanner;

public class OperadorTernario {

	public static void main(String[] args) {
		
		// Ejercico 1
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int n1 = sc.nextInt();
		System.out.println("Introduca otro número que no sea par");
		int n2 = sc.nextInt();

		String MoM = (n1 > n2) ? "El primer número es mayor que el segundo": "El primer número es menor que el segundo";
		System.out.println(MoM);

	}

}