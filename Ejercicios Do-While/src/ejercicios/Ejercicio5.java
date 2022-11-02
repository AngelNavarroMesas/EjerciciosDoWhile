package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Declaramos las variables
		int num, respuesta, min=0, max=100;
		
		//Le pedimos a el usuario que piense en un numero
		System.out.println("Piense un numero del 1 al 100 y lo adivinare");
		
		//Generamos un numero aleatorio para empezar y entramos en el bucle
		num = (int) (Math.random()*max+1);
		
		do {
			
			//Le preguntamos al usuario si hemos acertado y guardamos su respuesta
			System.out.println("El numero es "+num+"?");
			System.out.println("(mi numero es mayor-> 1)");
			System.out.println("(mi numero es menor-> 2)");
			System.out.println("(igual-> 3)");
			respuesta = sc.nextInt();
			
			
			//En este if ajustamos el rango dependiendo de la respuesta del usuario
			if(respuesta==1) {
				//Si el numero del usuario es mayor se actualiza el minimo del rango
				min=num;
			}else if(respuesta==2) {
				//Si el numero del usuario es menor se actualiza el maximo del rango
				max=num;
			}
			
			//Si no hemos acertado el numero se hara este bucle en el que generaremos un numero ajustado al nuevo rango cambiado
			if(respuesta!=3) {
				do {
					num = (int) (Math.random()*max+1);
				}while(min>=num);
			}
			
			//Si el usuario indica que hemos acertado se termina el bucle
		}while(respuesta!=3);
		
		//Mostramos el numero del usuario
		System.out.println("El numero era "+num);
		
		sc.close();
	}

}
