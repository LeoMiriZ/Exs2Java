import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner (System.in);
	
	
	double emp, taxa, juros;
	int dias;
	
	
	System.out.println("Insira o valor do empr�stimo (-1 para terminar)--> ");
	emp = teclado.nextDouble();
	
	if (emp == -1) {
		System.out.println("Status: Finalizado!");
	} else {
		System.out.println("Insira a taxa de juros--> ");
		taxa = teclado.nextDouble();
		
		if (taxa < 0 || taxa > 1) {
			System.out.println("Taxa de juros deve ser, preferencialmente, entre 0 e 1!");
		}
		
		System.out.println("\nInsira o prazo do empr�stimo em dias--> ");
		dias = teclado.nextInt();
		
		juros = (emp * taxa * dias) / (365);
		System.out.println("O valor de juros �: R$" + juros);
	}

	teclado.close();
	
	
	}

}
