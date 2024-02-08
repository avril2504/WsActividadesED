package _06_actividad_ed;

import java.util.Scanner;

public class Bucle_While {

	public static void main(String[] args) {
		//While
		System.out.println("números del 1 al 10");
		//Ejercicio 1
		//Imprimir números del 1 al 10
		
		int n1 = 1;
		while(n1 <= 10) {
			System.out.println(n1++);
		}
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("Números pares del 2 al 20");
		//Ejercicio 2
		//Imprimir números pares del 2 al 20
		
		int n2 = 0;
		while(n2 <= 20) {
			System.out.println(n2 += 2);
		}
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("primer número hasta el segundo");
		//Ejercicio 3
		//Pedir 2 números por pantalla y que muestre los números desde
		//el primer número hasta el segundo
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca un número");
		int n3 = sc.nextInt();
		System.out.println("Introduzca otro número");
		int n4 = sc.nextInt();
		
		while(n3 <= n4) {
			System.out.println(n3++);
		}
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("Suma de los primeros 100 números naturales");
		//Ejercicio 4
		//Sumar los primeros 100 números naturales
		
		int contar = 1;
		int suma = 0;
		while(contar <= 100) {
			suma += contar;
			contar++;
			System.out.println(suma);
		}
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("Tabla de multiplicar");
		//DO-WHILE
		
		//Ejercicio 1
		//Pedir un número al usuario e imprimir su tabla de multiplicar
		
		System.out.println("Introduzca un número para saber su tabla de multiplicar: ");
		int n5 = sc.nextInt();
		
		int i = 1;
		do {
			int tabla = n5 * i;
			i++;
			System.out.println(n5 + " x " + i + " es: " + tabla);
		}while (i <= 10);
		
		
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("Números del 10 al 1");
		//Ejercicio 2
		//Imprimir los números del 10 al 1 en orden descendente.
		
		int n6 = 10;
		do {
			System.out.println(n6);
			n6--;
		}while (n6 >= 1);
		
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("Factorial");
		//Ejercicio 3
		//Calcular el factorial de un número pedido por pantalla.
		//El factorial de un número es el número multiplicado por sus 
		//anteriores hasta el 1. EJ: 5!= 5*4*3*2*1
		
		System.out.println("Introduzca un número para calcular su factorial: ");
		int n7 = sc.nextInt();
		int j = 1;
		int fac = 1;
		 
		do {
			fac *= j;
			j++;
			System.out.println(fac);
		}while (n7 >= j);
		
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("Números impares del 1 al 30");
		//Ejercicio 4
		//Imprimir los números impares del 1 al 30.
		
		int n8 = 1;
		do {
			System.out.println(n8);
			n8 += 2;
		}while (n8 <= 30);
		
		System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
		System.out.println("Calcular potencia");
		//Ejercicio 5
		//Calcular la potencia de un número introducido por pantalla 
		//(por ejemplo, 2^3). No se puede utilizar la función Math.pow. 
		
		System.out.println("Introduzca el número base: ");
		int n9 = sc.nextInt();
		System.out.println("Introduzca el número exponente: ");
		int n10 = sc.nextInt();
		int e = 1;
		int resultado = 1;
		do {
			resultado *= n9;
			e++;
		}while (e <= n10);
		System.out.println("El resultado es: " + resultado);
	}

}
