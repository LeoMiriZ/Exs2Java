import static javax.swing.JOptionPane.*;
import java.lang.Integer;
import java.util.Random;

public class Metodos {

	private Lista<Usuario> lista1 = new Lista<>();
	private Lista<BilheteUnico> lista2 = new Lista<>();

	public void menu() {

		int aux = 0;

		while (true) {

			aux = Integer.parseInt(showInputDialog("Quem é você?\n1. Administrador\n2. Usuário\n3. Finalizar"));

			if (aux == 1) {

				met1();

			} else if (aux == 2) {

				met2();

			} else if (aux == 3) {

				showMessageDialog(null, "Operação finalizada com sucesso!");
				return;

			} else {

				showMessageDialog(null, "Inválido");

			}

		}

	}

	private void met1() {

		int aux1;

		aux1 = Integer.parseInt(
				showInputDialog("Operações:\n1. Cadastrar bilhete\n2. Consultar bilhete\n3. Listar bilhetes\n4. Sair"));

		if (aux1 == 1) {

			cadastrarBilhete();

		} else if (aux1 == 2) {

			consultarBilhete();

		} else if (aux1 == 3) {

			listarBilhetes();

		} else {

			showMessageDialog(null, "Operação finalizada!");
			return;

		}

	}

	private void met2() {

		int aux;
		double valor;

		aux = Integer.parseInt(
				showInputDialog("Operações:\n1. Consultar saldo\n2. Carregar bilhete\n3. Passar na catraca\n4. Sair"));

		if (aux == 1) {

			consultarSaldo();

		} else if (aux == 2) {

			valor = Integer.parseInt(showInputDialog("Insira um valor a ser adicionado"));

			carregarBilhete(valor);

		} else if (aux == 3) {

			passarCatraca();

		} else {

			showMessageDialog(null, "Operação finalizada!");
			return;

		}

	}

	private void cadastrarBilhete() {

		Random gerador = new Random();

		String nome, cpf, tipoDeTarifa;
		No verificacao, verificacao2;
		double saldo = 0;
		double valorDaTarifa = 4.40;
		int numb;
		boolean ver = true;

		do {

			nome = showInputDialog("Insira seu nome");
			cpf = showInputDialog("Insira seu CPF");
			tipoDeTarifa = showInputDialog("Insira o tipo de tarifa(estudante, professor ou normal)");

			if (lista1.pesquisar(new Usuario(cpf)) == null) {

				ver = false;

			}

		} while (ver);

		Usuario usuario = new Usuario();

		usuario.setNome(nome);
		usuario.setCpf(cpf);
		usuario.setTipoDeTarifa(tipoDeTarifa);

		lista1.inserirfim(usuario);

		numb = gerador.nextInt(100, 5000);

		verificacao2 = lista2.pesquisar(new BilheteUnico(numb));

		while (verificacao2 != null) {

			numb = gerador.nextInt(100, 5000);

			verificacao2 = lista2.pesquisar(new BilheteUnico(numb));

		}

		BilheteUnico bilhete = new BilheteUnico();

		bilhete.setNum(numb);
		bilhete.setSaldo(saldo);
		bilhete.setUsuario(usuario);

		lista2.inserirfim(bilhete);

	}

	private BilheteUnico consultarBilhete(Usuario usuario) {

		No<BilheteUnico> resultado = lista1.pesquisar(new BilheteUnico(0, 0, 0, usuario));
		if (resultado == null) {
			return null;
		} else {
			return resultado.getDado();
		}

	}

	private void listarBilhetes() {

		lista2.imprimir();
	}

	private void consultarSaldo() {

		String cpf = showInputDialog("CPF para pesquisa:");

		if (lista1.pesquisar(new Usuario(cpf)) == null) {

			showMessageDialog(null, cpf + " não foi encontrado");

			return;

		} else {

			showMessageDialog(null, lista2.pesquisar(new BilheteUnico()));
		}

	}

	private void carregarBilhete(double valor) {

		String cpf = showInputDialog("CPF para pesquisa:");
		if (lista1.pesquisar(new Usuario(cpf)) == null) {

			showMessageDialog(null, cpf + " não foi encontrado");
		} else {

			showMessageDialog(null, "oi");
		}

	}

	private void passarCatraca() {

		BilheteUnico bilhete = lista2.pesquisar(new BilheteUnico());

		if (bilhete.getSaldo() > bilhete.getValorDaTarifa()) {
			bilhete.passarNaCatraca();
			return true;
		} else {
			return false;
		}

	}

}
