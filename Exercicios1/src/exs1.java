import java.util.Scanner;

public class exs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// declaração de variáveis
	Scanner teclado = new Scanner(System.in);
	
	double valor1, valor2, valor3, resultado;
	// entrada de dados
	System.out.println("valor1--> ");
	valor1 = teclado.nextDouble();
	
	System.out.println("valor2--> ");
	valor2 = teclado.nextDouble();
	
	System.out.println("valor3--> ");
	valor3 = teclado.nextDouble();
	// processamento de dados
	resultado = (valor1 + valor2 + valor3) / (3);
	// saída de dados
	System.out.println("resultado--> " + resultado);
	
	
	
	
	
	
	
	
	
	
	
	}

}
