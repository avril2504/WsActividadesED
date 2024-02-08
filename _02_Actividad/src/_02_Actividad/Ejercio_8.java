package _02_Actividad;

import java.util.Scanner;

public class Ejercio_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación calcularemos su sueldo mas el número de horas extra que trabajo");
		System.out.println("cada hora extra fueron 40€");
		System.out.println("introduzca su sueldo");
		double sueldo = sc.nextDouble();
		System.out.println("introduzca la cantidad de horas que trabajo");
		double horas = sc.nextDouble();
		System.out.println("ahora se calculara la cantidad final que le corresponde");
		sc.nextLine();
		sc.nextLine();
		double cantidadF = sueldo + (horas * 40);
		System.out.println("la cantidad final que resiviras sera:" + cantidadF);
	}

}
