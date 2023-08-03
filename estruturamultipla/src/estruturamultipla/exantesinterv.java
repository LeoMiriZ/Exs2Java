package estruturamultipla;

import java.util.Scanner;

public class exantesinterv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
double renda, imposto;

System.out.println("Insira sua renda anual--> ");
renda = teclado.nextDouble();

if (renda<=10000) {
	imposto = renda;
System.out.println("Você é isento do imposto de renda");
}

else if (renda > 10000 && renda <=25000) {
	imposto = renda * 0.1035;
	System.out.println("O seu imposto de renda é de: " + imposto + " reais.");
}
else if (renda > 25000 && renda <= 50000) {
	imposto = renda * 0.2542;
	System.out.println("O seu imposto de renda é de: " + imposto + " reais.");
}
else if (renda > 50000) {
	imposto = renda * 0.2975;
	System.out.println("O seu imposto de renda é de: " + imposto + " reais.");
}
	
	teclado.close();
	
	}
}


