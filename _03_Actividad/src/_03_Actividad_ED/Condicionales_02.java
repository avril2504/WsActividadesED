package _03_Actividad_ED;

import java.util.Scanner;

public class Condicionales_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca un número del 1 al 7: ");

		int numero = sc.nextInt();

		String dia = null;

		if (numero == 1) {

			dia = "Lunes";

		} else if (numero == 2) {

			dia = "Martes";

		} else if (numero == 3) {

			dia = "Miercoles";

		} else if (numero == 4) {

			dia = "Jueves";

		} else if (numero == 5) {

			dia = "Viernes";

		} else if (numero == 6) {

			dia = "Sabado";

		} else if (numero == 7) {

			dia = "Domingo";

		}

		System.out.println("El día de la semana correspondiente es: " + dia);

	}
}
