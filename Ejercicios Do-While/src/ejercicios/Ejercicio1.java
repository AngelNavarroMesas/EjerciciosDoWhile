package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num=1;
		
		System.out.println("Estos son los 20 primeros numeros naturales");
		
		do {
			
			System.out.println(num);
			
			num++;
			
		}while(num!=21);
		
		sc.close();
	}

}
