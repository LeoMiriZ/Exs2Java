import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
	double sb, ha, dsr, valoraula, sf;
	
	int totalaulas;
	
	System.out.println("Valor da aula do professor--> ");
	valoraula = teclado.nextDouble();
	
	System.out.println("Número de aulas semanais--> ");
	totalaulas = teclado.nextInt();
	
	sb = (totalaulas * 4.5) * (valoraula);
	
	ha = sb * 0.05;
	
	dsr = (sb + ha) / (6);
	
	
	sf = (sb + ha + dsr);
	
	System.out.println("O salário mensal do professor é " + sf);
	
	teclado.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
