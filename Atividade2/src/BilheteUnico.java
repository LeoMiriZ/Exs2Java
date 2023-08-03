import static javax.swing.JOptionPane.*;

public class BilheteUnico {

	private int num;
	private double saldo;
	private double valorDaTarifa;
	private Usuario usuario;
	

	public BilheteUnico(int num, double saldo, double valorDaTarifa, Usuario usuario) {
		// TODO Auto-generated constructor stub

		this.num = num;
		this.saldo = saldo;
		this.valorDaTarifa = valorDaTarifa;
		this.usuario = usuario;

	}

	public BilheteUnico(int num, double saldo, String nome) {
		// TODO Auto-generated constructor stub
	}

	public BilheteUnico(int num) {
		// TODO Auto-generated constructor stub
	}

	public BilheteUnico() {
		// TODO Auto-generated constructor stub
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValorDaTarifa() {
		return valorDaTarifa;
	}

	public void setValorDaTarifa(double valorDaTarifa) {
		this.valorDaTarifa = valorDaTarifa;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void carregar(double valor) {

		if (valor <= 0) {

			showMessageDialog(null, "Insira um valor válido!");

		} else {

			this.saldo += valor;
		}

	}

	public boolean passarNaCatraca() {

		if (valorDaTarifa < saldo) {

			this.saldo -= valorDaTarifa;

			return true;

		} else {

			return false;
		}

	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		BilheteUnico bilhete = (BilheteUnico)obj;
		if (bilhete.num == num) {

			return true;

		}

		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Bilhete único\n" + "Número: " + getNum() + "\n" + "Saldo: " + getSaldo() + "\n" + "Usuário: "
				+ getUsuario();
	}

}
