import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
double imc, peso, altura;

System.out.println("Insira o seu peso--> ");
peso = teclado.nextDouble();

System.out.println("Insira sua altura--> ");
altura = teclado.nextDouble();

imc = (peso) / (altura * altura);

System.out.println("O seu IMC é: " + imc);

if (imc < 25) {
	System.out.println("O seu IMC está normal");
} else {
	System.out.println("O seu IMC está acima do normal");
}
	
	teclado.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
