
public class Conta {
	
	String nome;
	double saldo;
	
	
	
	public void sacar (double valor) {
		
		saldo = saldo - valor;
	}
	
	public void depositar (double valor) {
		
		saldo = saldo + valor;
	}
	
}


