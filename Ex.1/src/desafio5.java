import java.util.Scanner;

public class desafio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Scanner teclado = new Scanner(System.in);
	
	double lata, area, raio, altura, qntlatas, custofinal;
	
	System.out.println("O raio do cilindro �--> ");
	raio = teclado.nextDouble();
	
	System.out.println("A altura do cilindro �--> ");
	altura = teclado.nextDouble();
	
	
	lata = 220;
	
	
	area = (2 * Math.PI * raio) * (altura + raio);
    System.out.println("A �rea do cilindro � " + String.format("%.2f", area));
    
    qntlatas= area / 15;
    
    System.out.println("A quantidade final de latas � " + String.format("%.2f", qntlatas));
    
    custofinal = qntlatas * lata;
    
    System.out.println("O custo final � " + String.format("%.2f", custofinal) + " reais.");
	
	
	}

}
