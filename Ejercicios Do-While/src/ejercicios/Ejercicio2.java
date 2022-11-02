package ejercicios;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaramos las variables
		int num=2;
		
		//Indicamos lo que se muestra en pantalla
		System.out.println("Estos son los numeros comprendidos entre el 1 y el 200");
		
		//Comenzamos el bucle, este bucle mostrara el balos de num y le sumara +1 hasta que tenga el valor 200
		do {
			
			//Mostramos num
			System.out.println(num);
			
			//Le añadimos +1 al valor de num
			num++;
			
			//No se saldra del bucle hasta que num valga 200
		}while(num!=200);
		
		
	}

}
