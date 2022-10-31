package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num, tabla=1;
		
		System.out.println("Introduzca un numero para mostrar su tabla de multiplicar");
		num = sc.nextInt();
		
		do {
			
			System.out.println(num+" X "+tabla+" = "+(num*tabla));
			
			tabla++;
			
		}while(tabla!=11);
		
		sc.close();
	}

}
