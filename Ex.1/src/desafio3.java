import java.util.Scanner;

public class desafio3 {


public static void main(String[] args) {
	
	
	Scanner teclado = new Scanner(System.in);
	
int valor1, decimal;
int valor2, valor3, valor4, valor5;


System.out.println("Insira um número binário--> ");
valor1 = teclado.nextInt();

valor2= valor1/1000;
valor3= (valor1%1000) / 100;
valor4= (valor1%100)/10;
valor5= (valor1%10);

decimal = (valor2 * 8) + (valor3 * 4) + (valor4 * 2) + (valor5 * 1);


System.out.println("O número em decimal é " + decimal);

	
	
	
	
	
	
	
	
	
}







}
