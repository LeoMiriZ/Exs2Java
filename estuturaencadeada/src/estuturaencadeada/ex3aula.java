package estuturaencadeada;

import java.util.Scanner;

public class ex3aula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
	double a, b, c, delta, x1, x2;
	
	System.out.println("Insira um valor de a--> ");
	a = teclado.nextDouble();
	
	System.out.println("Insira um valor de b--> ");
	b = teclado.nextDouble();
	
	System.out.println("Insira um valor de c--> ");
	c = teclado.nextDouble();
	
	
	delta = b*b - 4 * a * c;
	
	x1 = (-b + Math.sqrt(delta)) / (2 * a);
	
	x2 = (-b - Math.sqrt(delta)) / (2 * a);
	
	if (delta>=0) {
		System.out.println("As raízes são " + x1 + " e " + x2);
	} else {
		System.out.println("Não resolvido");
	}
	
	if (a!= 0) { 
		System.out.println("Possível");
	} else {
		System.out.println("Impossível");
	}
	
	teclado.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
