package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Declaramos la variables
		int num=1;
		
		//Indicamos lo que aparece en pantalla
		System.out.println("Estos son los 20 primeros numeros naturales");
		
		//Este bucle mostrara el valor de num y le añadira +1 a ese valor al final hasta que llegue a 21
		do {
			//Se muestra num
			System.out.println(num);
			
			//Se le añade +1 a num
			num++;
			
			//El bucle solo terminara cuando el valor de num sea 21
		}while(num!=21);
		
		sc.close();
	}

}
