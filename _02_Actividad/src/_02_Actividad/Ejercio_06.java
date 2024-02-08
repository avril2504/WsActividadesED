package _02_Actividad;

import java.util.Scanner;

public class Ejercio_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("¿Quieres saber el resultado final de tus calificaciones? pues quedate aqui que te ayudo");
		System.out.println("En primer lugar calcularemos las notas de tus parciales");
		System.out.println("introduce la calificación del primer parcial");
		double parcial1 = sc.nextDouble();
		System.out.println("introduce la calificación del segundo parcial");
		double parcial2 = sc.nextDouble();
		System.out.println("introduce la calificación del tercer parcial");
		double parcial3 = sc.nextDouble();
		double media = (parcial1 + parcial2 + parcial3) / 3;
		System.out.println("la media de tus parciales es:" + media);
		sc.nextLine();
		sc.nextLine();
		System.out.println("Ya que tenemos las medias de tus parciales procederemos a calcularlas en base al "
				+ "55%");
		sc.nextLine();
		sc.nextLine();
		double Parcial = media * 0.55;
		System.out.println("esta seria tu calificación:" + Parcial);
		sc.nextLine();
	    sc.nextLine();
		System.out.println("Ya que tenemos tu nota de los parciales continuaremos con la del examen final");
		sc.nextLine();
	    sc.nextLine();
	    System.out.println("introduzca la calificación");
	    double calificacion = sc.nextDouble();
	    System.out.println("ya que tenemos tu calificación la calcularemos en base a un 30%");
	    sc.nextLine();
	    sc.nextLine();
	    double examen = calificacion * 0.30;
	    System.out.println("la calificación final de tu examen seria:" + examen);
	    sc.nextLine();
	    sc.nextLine();
	    System.out.println("ahora calcularemos tu calificación del trabajo final");
	    sc.nextLine();
	    sc.nextLine();
	    System.out.println("introduzca la calificación");
	    double calificacion2 = sc.nextDouble();
	    System.out.println("ya que tenemos tu calificación la calcularemos en base a un 15%");
	    sc.nextLine();
	    sc.nextLine();
	    double trabajo = calificacion2 * 0.15;
	    System.out.println("la calificación final de tu trabajo seria:" + trabajo);
	    sc.nextLine();
	    sc.nextLine();
	    System.out.println("ahora para finalizar sumaremos los resultados de las calificaciones");
	    sc.nextLine();
	    sc.nextLine();
	    double nota = Parcial + examen + trabajo;
	    System.out.println("Esta seria tu calificación final en Entornos de Desarrollo:" + nota);
	    
	    
	    
		
		
		
	}

}
