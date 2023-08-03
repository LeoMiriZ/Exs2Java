package estruturamultipla;

import java.util.Scanner;

public class ex1versao2aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
	String var;
	
	System.out.println("Digite uma letra--> ");
	var = teclado.next();
	
	var = var.toLowerCase();
	
switch (var) {
case "a":
	System.out.println("É uma vogal");
	break;
case "e":
	System.out.println("É uma vogal");

	break;
case "i":
	System.out.println("É uma vogal");

	break;
case "o":
	System.out.println("É uma vogal");

	break;
case "u":
	System.out.println("É uma vogal");

	break;
default:
	System.out.println("Não é uma vogal");
}
	
}
	
}


