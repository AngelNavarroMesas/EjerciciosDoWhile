package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num=1, numaux=0, n;
		
		//Le pedimos al usuario que introduzca un numero y lo escaneamos
		System.out.println("Introduzca un numero para sumar los numeros desde el 1 hasta ese");
		n = sc.nextInt();
		
		//Comenzamos el bucle
		do {
			
			//En esta operacion sumamos numaux con num, el objetivo de numaux es guardar el valor total en todo el bucle
			numaux += num;
			
			num++;
			
			System.out.println(numaux);
			
			
		}while(num!=(n+1));
		
		sc.close();
	}

}
