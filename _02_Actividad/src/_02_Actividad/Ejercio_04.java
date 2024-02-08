package _02_Actividad;

import java.util.Scanner;

public class Ejercio_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuació calcularemos la media de tres números");
		System.out.println("para esto primero tendras que introducir el valor de los números");
		System.out.println("introduca el primer número");
		double numero1 = sc.nextDouble();
		System.out.println("introduca el segundo número número");
		double numero2 = sc.nextDouble();
		System.out.println("introduca el tercer número");
		double numero3 = sc.nextDouble();
		sc.nextLine();
		sc.nextLine();
		double suma = numero1 + numero2 + numero3;
		System.out.println("Este es el reultado de la suma:" + suma);
		sc.nextLine();
		sc.nextLine();
		System.out.println("ahora se mostrara el valor de la media");
		double media = suma / 3;
		sc.nextLine();
		sc.nextLine();
		System.out.println("el resultado de la madia es:" + media);
		
		
		
		

	}

}
