import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
	
	double x1, y1, dist, sup;
	int pontos, cont;
	
	cont = 1;
	
	
	
	System.out.println("Quantidade de pontos que serão informados--> ");
	pontos = teclado.nextInt();
	
	while (cont <= pontos) {
		
		System.out.println("\nx1 = ");
		x1 = teclado.nextDouble();
		
		System.out.println("y1 = ");
		y1 = teclado.nextDouble();
		
		dist = Math.sqrt(Math.pow(x1, 2) + Math.pow(y1, 2));
		
		System.out.println("Distância até a origem: " + dist);
		
		if (dist > 10) {
			System.out.println("O ponto mais distante tem coordenadas: (" + x1 + "," + y1 + ")");
		} 
		
		
		cont++;
		
		
		}

	}
	}
