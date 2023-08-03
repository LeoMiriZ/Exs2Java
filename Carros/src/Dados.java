import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;

public class Dados {

	Carros[] carros = new Carros[5];

	public void inserir() {

		for (int i = 0; i < carros.length; i++) {

			carros[i] = new Carros();

			carros[i].prop = showInputDialog("Nome do proprietário");
			carros[i].comb = showInputDialog("Tipo de gasolina");
			carros[i].ano = parseInt(showInputDialog("Ano do carro"));
			carros[i].placa = showInputDialog("Placa do veículo");

		}

	}

	public void imprimir() {

		int a = 0, b = 0, c = 0;

		for (int i = 0; i < carros.length; i++) {

			if (carros[i].comb.equalsIgnoreCase("álcool")) {

				a++;

			} else if (carros[i].comb.equalsIgnoreCase("diesel")) {

				b++;
			} else {

				c++;
			}
			
			if (carros[i].placa.charAt(carros[i].placa.length() - 1) == '9') {
				
				showMessageDialog(null, "Licensiar seu veículo");
				
			}

		}
		
		showMessageDialog(null, "Quantidade de carros que usam álcool: " + a);
		showMessageDialog(null, "Quantidade de carros que usam diesel: " + b);
		showMessageDialog(null, "Quantidade de carros que usam gasolina: " + c);

	}

}
