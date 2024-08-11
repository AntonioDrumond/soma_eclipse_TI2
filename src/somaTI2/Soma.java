package somaTI2;

import java.util.Scanner;

public class Soma{
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int a = 0,
			b = 0,
			x = 0;

		System.out.println("Soma de dois numeros:\n");
		System.out.print("Insira o primeiro numero: ");
		a = scan.nextInt();
		System.out.print("Insira o segundo numero: ");
		b = scan.nextInt();

		x = a + b;
		System.out.printf("\nO resultado e igual a: %d", x);
	}
}
