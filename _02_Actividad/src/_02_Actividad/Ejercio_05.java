package _02_Actividad;

import java.util.Scanner;

public class Ejercio_05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("A continuació calcularemos lo recibido a fin de mes con su sueldo base más "
				+ "un 10% por comisión de sus ventas. En etse caso a realizado tres ventas extras al mes");
		System.out.println("para comenzar deberas untroducir el total de su salario base");
		double salarioB = sc.nextDouble();
		System.out.println("ahora debera introducir el monto total de las ventas al mes");
		double ventas = sc.nextDouble();
		System.out.println("introduzca la comisión");
		double Comision = sc.nextDouble();
		double comision = 0.10;
		double totalC = ventas * comision;
		System.out.println("El total de la comisión seria:" + totalC);
		sc.nextLine();
		sc.nextLine();
		double totalM = salarioB + totalC;
		System.out.println("El total mensual seria:" + totalM);
		
		

	}

}