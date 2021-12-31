import java.util.Scanner;

public class FizzBuzzTest {
	public static void main (String[] args) {
		
		/*Escribir un programa que tomará un entero y mostrará en pantalla Fizz si el número es divisible por 3, 
		 * Buzz si el número es divisible por 5, FizzBuzz si el número es divisible por 3 y 5 y para el resto de los casos
		 *  mostrará el número que se ingresó. */
		
		System.out.println("Inicio proceso FizzBuzz");
		
		//leer el numero aqui!
		Scanner sca = new Scanner (System.in);
		int paso = sca.nextInt();
		
		if (paso%3==0 && paso%5==0) {
			System.out.println("FizzBuzz");
		} else if (paso%5==0) {
			System.out.println("Buzz");
		} else if(paso%3==0){
			System.out.println("Fizz");
		} else {
			System.out.println(paso);
		}
		
		sca.close();
		
		System.out.println("Fin proceso FizzBuzz");
	}

}
