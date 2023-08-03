import java.util.Scanner;

public class exs2aula {


public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	double base, altura, lado, perimetro, area;
	
	
System.out.println("base--> ");
base = teclado.nextDouble();

System.out.println("altura--> ");
altura = teclado.nextDouble();

perimetro = (altura * 2) + (base * 2);

System.out.println("perimetro--> " + perimetro);

System.out.println("lado--> ");
lado = teclado.nextDouble();

area = (Math.pow(lado, 2) * (Math.sqrt(3))) / (4);

System.out.println("area--> " + String.format("%.2f", area));

	

}






















}
