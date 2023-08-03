package estuturaencadeada;

import java.util.Scanner;

public class ex2aulaversao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String nome, gen;

		double alt, peso;

		System.out.println("Qual seu gênero (masculino ou feminino): ");
		gen = teclado.next();

		if (!gen.equalsIgnoreCase("masculino") && !gen.equalsIgnoreCase("feminino")) {
			System.out.println("Gênero inválido para essa aplicação");
		} else {
			teclado.nextLine();
			System.out.println("Insira seu nome--> ");
			nome = teclado.nextLine();
			System.out.println("Insira sua altura(em metros)--> ");
			alt = teclado.nextDouble();

			if (gen.equals("feminino")) {

				peso = 62.1 * alt - 44.7;
			} else {
				peso = 72.7 * alt - 58;
			}
			System.out.println(nome + " seu peso ideal é " + peso);

		}

		teclado.close();
	}

}
