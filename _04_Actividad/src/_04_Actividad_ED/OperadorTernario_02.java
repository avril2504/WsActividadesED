package _04_Actividad_ED;

import java.util.Scanner;

public class OperadorTernario_02 {
	
	//Ejercio 3

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduca su nota (tiene que ser un número del 1 al 100");
		int nota = sc.nextInt();
		
		String Resultado = (nota >= 50) ? "Aprobado" : "Suspenseo";
		System.out.println(Resultado);
			

	}

}
