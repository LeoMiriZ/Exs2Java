import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner teclado = new Scanner (System.in);
	
double fah, tempi, tempf, cont;


System.out.println("Temperatura inicial (mínima)--> ");
tempi = teclado.nextInt();

System.out.println("Temperatura final (máxima)--> ");
tempf = teclado.nextInt();

cont = tempi;

while (cont>= tempi && cont <= tempf) {
	
	
	fah = 9 * cont / 5 + 32;
	System.out.println(cont + " -- > " + fah);
	
cont++;
}
	
	teclado.close();
	
	}

}
