package _03_Actividad_ED;

import java.util.Scanner;

public class Condicionales_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el total de su compra: ");
		double compra = sc.nextDouble();
		double descuento = 0.0;
		

		if (compra >= 100) {
			System.out.println("Su decuento es del 10%: ");
			descuento = 10.0;
		} else if (compra >= 50) {
			System.out.println("Su descuento es del 5%");
			descuento = 5.0;
		} else if (compra < 50) {
			System.out.println("No hay descuento");
		}
		
		double porcentaje = (compra * descuento) / 100;
		double totalCompra = compra - porcentaje;
		System.out.println("El importe total a pagar seria: " + totalCompra);

	}

}
