package estuturaencadeada;

import java.util.Scanner;

public class ex2aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
String nome;


int gen;

double alt, peso1, peso2;


System.out.println("Insira seu nome--> ");
nome = teclado.nextLine();

System.out.println("Insira seu gênero(1=masculino, 2=feminino)");
gen = teclado.nextInt();

System.out.println("Insira sua altura(em metros)--> ");
alt = teclado.nextDouble();


	if (gen == 1) {
	
	peso1 = 72.7 * alt - 58;
	
	System.out.println("O peso é: " + peso1);
}


else if (gen == 2) {
	
	peso2 = 62.1 * alt - 44.7;
	System.out.println("O peso é: " + peso2);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
