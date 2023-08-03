
public class Usuario {

	private String nome;
	private String cpf =  "";
	private String tipoDeTarifa;

	public Usuario(String nome, String cpf, String tipoDeTarifa) {
		// TODO Auto-generated constructor stub

		this.nome = nome;
		this.cpf = cpf;
		this.tipoDeTarifa = tipoDeTarifa;

	}

	public Usuario(String cpf) {
		// TODO Auto-generated constructor stub
	}

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTipoDeTarifa() {
		return tipoDeTarifa;
	}

	public void setTipoDeTarifa(String tipoDeTarifa) {
		this.tipoDeTarifa = tipoDeTarifa;
	}

	@Override
	public boolean equals(Object obj) {

		Usuario usuario = (Usuario) obj;
		if (usuario.cpf.equalsIgnoreCase(getCpf())) {

			return true;

		}

		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome + "\nCPF: " + cpf + "\nTipo de tarifa: " + tipoDeTarifa;
	}

}
