package ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num, respuesta, mayor=0, menor=0;
		
		
		System.out.println("Piense un numero del 1 al 100 y lo adivinare");
		
		num = (int) (Math.random()*50+1);
		
		do {
			
			System.out.println("El numero es "+num+"?");
			System.out.println("(mayor-> 1)");
			System.out.println("(menor-> 2)");
			System.out.println("(igual-> 3)");
			respuesta = sc.nextInt();
			
			
			
			if(respuesta==1&&num<mayor) {
				mayor=num;
			}else if(respuesta==2&&num>menor) {
				menor=num;
			}
			
			do {
				num = (int) (Math.random()*100+1);
			}while(num>=mayor&&num<=menor);
			
			
			/*
			if(respuesta==1) {
				
				do {
					num = (int) (Math.random()*100+1);
				}while(num<=numaux);
				
			}else if(respuesta==2) {
				
				do {
					num = (int) (Math.random()*100+1);
				}while(num>=numaux);
			
			}
			*/
			
		}while(respuesta!=3);
		
		System.out.println("El numero era "+num);
		
		sc.close();
	}

}
