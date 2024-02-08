package _02_Actividad;

import java.util.Scanner;

public class Ejercio_07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("A continuación calcularemos la nota final de un estudiante considerando que:");
		System.out.println( "por cada respuesta correcta son 5 puntos");
		System.out.println( "por una incorrecta -1");
		System.out.println( "y por una en blanco 0");
		System.out.println("para comenzar introduzac la cantidad de preguntas");
		int preguntas = sc.nextInt();
		System.out.println("ahora cuantas de estas son correctas");
		int correctas = sc.nextInt();
		System.out.println("ahora introduzaca las incorrectas");
		int incorrectas = sc.nextInt();
		System.out.println("y para finalizar, la cantidad de respuestas en blanco");
		int blanco = sc.nextInt();
		System.out.println("correctas:" + correctas);
		System.out.println("incorrectas:" + incorrectas);
		System.out.println("en blanco" + blanco);
		int nota = (correctas * 5) - (incorrectas * -1);
		System.out.println("La nota final es:" + nota);
		

		
	
	}

}
