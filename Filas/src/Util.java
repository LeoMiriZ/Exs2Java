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
					showInputDialog("Selecione uma operação \n1. Comprar ações \n2. Vender ações \n3. Finalizar"));

			if (aux == 1) {

				comprar();

			} else if (aux == 2) {

				vender();

			} else if (aux == 3) {

				showMessageDialog(null, "Operação finalizada com sucesso!");
				break;

			} else {

				showMessageDialog(null, "Selecione uma operação válida!");

			}

		}

	}

	public void comprar() {

		int qtd;
		double preco;

		qtd = Integer.parseInt(showInputDialog("Insira a quantidade de ações compradas"));

		preco = Double.parseDouble(showInputDialog("Insira o preço das ações"));

		fila.add(new Acao(qtd, preco));

		showMessageDialog(null, fila);

	}

	public void vender() {

		int qtd = 0, qtdvend;
		double preco, lucro, lucrot = 0;
		Acao antiga;

		qtd = Integer.parseInt(showInputDialog("Insira a quantidade de ações vendidas"));
		preco = Double.parseDouble(showInputDialog("Preço de venda"));

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
