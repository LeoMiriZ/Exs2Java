import java.util.Scanner;

public class desafio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	Scanner teclado = new Scanner(System.in);
		
	
int valor, sucessor;

System.out.println("Informe um valor entre 0 e 60--> ");
valor = teclado.nextInt();

sucessor = (valor + 1) % 61;

System.out.println("O sucessor do número é " + sucessor);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
