import java.util.Random;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.parseDouble;

public class Dados {

	Estoque[] estoque = new Estoque[5];

	public void inserir() {

		Random gerador = new Random();

		for (int i = 0; i < estoque.length; i++) {

			estoque[i] = new Estoque();

			estoque[i].codigo = gerador.nextInt(1000, 9999);
			estoque[i].nome = showInputDialog("Nome do produto");
			estoque[i].preco = parseDouble(showInputDialog("Preço"));

			for (int j = 0; j < estoque[i].baixas.length; j++) {

				estoque[i].baixas[j] = gerador.nextInt(0, 100);

			}

		}

	}

	public void imprimir() {

		int soma = 0, aux = 0;
		String maisvendas = "";

		for (int i = 0; i < estoque[i].baixas.length; i++) {
			for (int j = 0; j < estoque[i].baixas.length; j++) {

				soma += estoque[i].baixas[j];
			}

			if (soma > aux) {

				aux = soma;
				maisvendas = estoque[i].nome;
			}
			
			soma = 0;

		}
		
		showMessageDialog(null, maisvendas + " " +  aux);

	}

}
