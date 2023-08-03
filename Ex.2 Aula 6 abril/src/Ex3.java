import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
double valorvendas, sal1, sal2;

System.out.println("Insira o valor total de vendas--> ");
valorvendas = teclado.nextDouble();

if (valorvendas > 25000.00) {
	sal1 = valorvendas * 0.1885;
	System.out.println("O salário do vendedor foi de " + sal1);
	
} else {
	sal2 = valorvendas * 0.175;
	System.out.println("O salário do vendedor foi de " + sal2);
}
	
	
 teclado.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
