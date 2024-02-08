package _02_Actividad;

import java.util.Scanner;

public class Ejercio_02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Calcular la hipotenusa de un triángulo rectángulo");
		System.out.println("para calcular la hipotenusa necesitaremos el valor de los catetos");
		System.out.println("introduzca el valor de uno de los catetos");
		
		double cateto1 = sc.nextDouble();
		System.out.println("a continuación introduzaca el valor del otro cateto");
		double cateto2 = sc.nextDouble();
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		System.out.println("El valor de la hipotenusa a partir de los valores introducidos es:" + hipotenusa);
		
		

	}

}
