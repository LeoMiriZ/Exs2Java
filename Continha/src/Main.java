import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner (System.in);
		
		Conta c = new Conta();
		
		c.nome = "Leo";
		c.saldo = 200;
		
		c.depositar(100);
		c.sacar(30);
		
		System.out.println(c.saldo);
		
		

	}

}
