import java.util.Scanner;

public class desafio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner(System.in);
	
	int valor, nota100, nota50, nota20, nota10, nota5, nota1;
	
	System.out.println("Insira um valor para sacar ");
	valor = teclado.nextInt();
	
	
	nota100 = valor/100;
	
	nota50= (valor%100) / (50);
	
	nota20= (valor%100) %(50) / (20);
	
	nota10= (valor%100) % (50) % (20) / (10);
	
	nota5= (valor%100) % (50) % (20) % (10) / (5);
	
	nota1= (valor%100) % (50) % (20) % (10) % (5) / (1);
	
	System.out.println("Número de notas de 100= " + nota100);
	System.out.println("Número de notas de 50= "+ nota50);
	System.out.println("Número de notas de 20= " + nota20);
	System.out.println("Número de notas de 10= " + nota10);
	System.out.println("Número de notas de 5= " + nota5);
	System.out.println("Número de notas de 1= " + nota1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
