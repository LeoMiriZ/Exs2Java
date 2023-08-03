package estuturaencadeada;

import java.util.Scanner;

public class ex4aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int valor1, valor2, valor3;

		System.out.println("Insira o primeiro valor--> ");
		valor1 = teclado.nextInt();

		System.out.println("Insira o segundo valor--> ");
		valor2 = teclado.nextInt();

		System.out.println("Insira o terceiro valor--> ");
		valor3 = teclado.nextInt();

		if (valor1 == valor2 || valor2 == valor3) {

			System.out.println("Os valores não são diferentes");
		}

		if (valor1 < valor2 && valor1 < valor3) {

			System.out.println("O menor valor é: " + valor1);

		}

		if (valor2 < valor3 && valor2 < valor1) {
			System.out.println("O menor valor é: " + valor2);
		}

		if (valor3 < valor1 && valor3 < valor2) {
			System.out.println("O menor valor é: " + valor3);
		}

		teclado.close();

	}

}
