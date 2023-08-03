
public class Acao {

	private int qtd;
	private double prec;

	public Acao(int qtd, double prec) {
		// TODO Auto-generated constructor stub

		this.qtd = qtd;
		this.prec = prec;

	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public double getPrec() {
		return prec;
	}

	public void setPrec(double prec) {
		this.prec = prec;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Quantidade de ações: " + qtd + "\nPreço: " + prec;
	}

}
