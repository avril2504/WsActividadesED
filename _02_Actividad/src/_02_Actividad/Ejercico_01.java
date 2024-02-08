package _02_Actividad;

import java.util.Scanner;

public class Ejercico_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Calcular el perímetro y área de un rectángulo dada su base y su altura ");  
		System.out.println("A continuación calcularemos el perímetro y área de un rectángulo");
		System.out.println("para ello debera introducir los daos de la base y la altura");
		
		System.out.println("introduzca el valor de la base");
		double base = sc.nextDouble();
		System.out.println("ahora introduzca el valor de la altura");
		double altura = sc.nextDouble();
		double perimetro = ( base + base + altura + altura);
		System.out.println("El perímetro del rectángulo es:" + perimetro);
		
		System.out.println("Ya que tenemos el valor de un perímetro ahora calcularemos el valor del "
				+ "áres de un rectángulo");
	
		System.out.println("introduzca el valor d ela base");
		double Base = sc.nextDouble();
		System.out.println("ahora introduzca el valor de la altura");
		double Altura = sc.nextDouble();
		double area = Base * Altura;
		System.out.println("El valor del área del rectángulo es:" + area);
		
		System.out.println("Excelente trabajo");
		
		
		
	
		
		

	}

}
