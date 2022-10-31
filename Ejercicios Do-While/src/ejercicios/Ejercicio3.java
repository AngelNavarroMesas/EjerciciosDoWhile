package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=1, numaux=0, n;
		
		System.out.println("Introduzca un numero para sumar los numeros desde el 1 hasta ese");
		n = sc.nextInt();
		
		do {
			
			numaux += num;
			
			num++;
			
			System.out.println(numaux);
			
			
		}while(num!=(n+1));
		
		sc.close();
	}

}
