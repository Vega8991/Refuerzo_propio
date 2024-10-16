package Ejercicios;
import java.util.Scanner;
public class Calculadora {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Indique el primer numero");
		double num1 = scanner.nextDouble();

		
		System.out.println("Indique el segundo numero");
		double num2 = scanner.nextDouble();

		
		System.out.println("---------------------------------");
		System.out.println("Indique el apartado que necesita");
		System.out.println("1. Suma");
		System.out.println("2. Resta");
		System.out.println("3. Multiplicacion");
		System.out.println("4. Division");
		System.out.println("---------------------------------");
		
		int opcion = scanner.nextInt();
		double resultado;
		
		if(opcion == 1) {
			resultado = num1 + num2;
			System.out.println("Suma: " + resultado);
		}else if(opcion == 2) {
			resultado = num1 - num2;
			System.out.println("Resta: " + resultado);
		}else if(opcion == 3) {
			resultado = num1 * num2;
			System.out.println("Multiplicacion: " + resultado);
		}else if(opcion == 4) {
			resultado = num1 / num2;
			System.out.println("Division: " + resultado);
		}
		
	}
}
