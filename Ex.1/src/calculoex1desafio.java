import java.util.Scanner;

public class calculoex1desafio {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner (System.in);
		
		int valor1, valor2, valor3, valor4, valor5, valor6;
	
		
		System.out.println("valor1--> ");
		valor1 = teclado.nextInt();
		
		valor2= valor1 / 100;
		
		valor3 = valor1 % 100;
		
		valor6= valor3 / 10;
		
		valor4 = valor1 % 10;
		
		valor5= (valor4 * 100) + (valor6 * 10) + (valor2 * 1);
		
		System.out.println("O número invertido é " + valor5);
		
		
		
		
		
		
		
		
		
		
	
















	
	
	
	}
}
