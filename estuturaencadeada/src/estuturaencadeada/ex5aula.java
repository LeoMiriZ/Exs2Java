package estuturaencadeada;

import java.util.Scanner;

public class ex5aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
	int num1, num2, num3, aux;
	
	
	System.out.println("Insira o primeiro valor--> ");
	num1 = teclado.nextInt();
	
	System.out.println("Insira o segundo valor--> ");
	num2 = teclado.nextInt();
	
	System.out.println("Insira o terceiro valor--> ");
	num3 = teclado.nextInt();
	
	
	if (num1 == num2 && num2 == num3) {
		System.out.println("Operação inválida para essa aplicação");
	}
	
	if (num1 > num2) {
		aux = num1;
		num1 = num2;
		num2 = aux;
	}
	
	if (num1 > num3) {
		aux = num1;
		num1 = num3;
		num3 = aux;
	}
	
	if (num2 > num3) {
		aux = num2;
		num2 = num3;
		num3 = aux;
	}
	
	System.out.println(num1 + " " + num2 + " " + num3 + " ");
	
	
	}

}
