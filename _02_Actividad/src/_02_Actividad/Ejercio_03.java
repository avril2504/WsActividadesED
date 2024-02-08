package _02_Actividad;

import java.util.Scanner;

public class Ejercio_03 {

	public static void main(String[] args) {
	 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación haremos la suma, resta, multiplicación y división de dos números");
		System.out.println("El primer paso para realizar las operaciones mencionadas es introducir el valor"
				+ "de los números");
		System.out.println("introduzca el primero número");
		double numero1 = sc.nextDouble();
		System.out.println("introduzca el segundo número");
		double numero2 = sc.nextDouble();
		
		System.out.println("ya que tenemos el valor de los números se mostrara el resultado de las operaciones");
		sc.nextLine();
		sc.nextLine();
		double suma = numero1 + numero2;
		System.out.println("el resultado de la suma es:" + suma);
		sc.nextLine();
		sc.nextLine();
		double resta = numero1 - numero2;
		System.out.println("el resultado de la resta es:" + resta);
		sc.nextLine();
		sc.nextLine();
		double multiplicacion = numero1 * numero2;
		System.out.println("el resultado de la multiplicación es:" + multiplicacion);
		sc.nextLine();
		sc.nextLine();
		double division = numero1 / numero2;
		System.out.println("el resultado de la división es:" + division);
		

	}

}
