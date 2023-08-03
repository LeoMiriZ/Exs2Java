import static javax.swing.JOptionPane.*;
import java.lang.Integer;
import java.util.LinkedList;
import java.util.Queue;
import java.lang.Double;

public class Util {

	private Queue<Acao> fila = new LinkedList<>();

	public void menu() {

		int aux;

		while (true) {

			aux = Integer.parseInt(
					showInputDialog("Selecione uma opera��o \n1. Comprar a��es \n2. Vender a��es \n3. Finalizar"));

			if (aux == 1) {

				comprar();

			} else if (aux == 2) {

				vender();

			} else if (aux == 3) {

				showMessageDialog(null, "Opera��o finalizada com sucesso!");
				break;

			} else {

				showMessageDialog(null, "Selecione uma opera��o v�lida!");

			}

		}

	}

	public void comprar() {

		int qtd;
		double preco;

		qtd = Integer.parseInt(showInputDialog("Insira a quantidade de a��es compradas"));

		preco = Double.parseDouble(showInputDialog("Insira o pre�o das a��es"));

		fila.add(new Acao(qtd, preco));

		showMessageDialog(null, fila);

	}

	public void vender() {

		int qtd = 0, qtdvend;
		double preco, lucro, lucrot = 0;
		Acao antiga;

		qtd = Integer.parseInt(showInputDialog("Insira a quantidade de a��es vendidas"));
		preco = Double.parseDouble(showInputDialog("Pre�o de venda"));

		while (qtd > 0 && !fila.isEmpty()) {

			antiga = fila.peek();
			qtdvend = Math.min(qtd, antiga.getQtd());
			lucro = (preco - antiga.getPrec()) * qtdvend;
			lucrot += lucro;
			qtd -= qtdvend;
			antiga.setQtd(antiga.getQtd() - qtdvend);

			if (antiga.getQtd() == 0) {

				fila.remove();

			}

		}
		
		showMessageDialog(null, "Lucro total: R$ " + String.format("%.2f", lucrot));

	}

}
