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
		System.out.println("� uma vogal");
	}
	
	else if (var.equals("e")) {
		System.out.println("� uma vogal");
	}
	
	else if (var.equals("i")) {
		System.out.println("� uma vogal");
	}
	
	else if (var.equals("o")) {
		System.out.println("� uma vogal");
	}
	
	else if (var.equals("u")) {
		System.out.println("� uma vogal");
	} else {
		System.out.println("N�o � uma vogal");
	}
	
	teclado.close();
}

}
