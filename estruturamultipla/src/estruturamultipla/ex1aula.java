package estruturamultipla;

import java.util.Scanner;

public class ex1aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
	String var;
	
	System.out.println("Digite uma letra--> ");
	var = teclado.next();
	
	var = var.toLowerCase();
	
	if (var.equals("a")) {
		System.out.println("É uma vogal");
	}
	
	else if (var.equals("e")) {
		System.out.println("É uma vogal");
	}
	
	else if (var.equals("i")) {
		System.out.println("É uma vogal");
	}
	
	else if (var.equals("o")) {
		System.out.println("É uma vogal");
	}
	
	else if (var.equals("u")) {
		System.out.println("É uma vogal");
	} else {
		System.out.println("Não é uma vogal");
	}
	
	teclado.close();
}

}
