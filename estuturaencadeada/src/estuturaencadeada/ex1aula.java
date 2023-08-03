package estuturaencadeada;

import java.util.Scanner;

public class ex1aula {

public static void main(String[] args) {
	
	
	Scanner teclado = new Scanner(System.in);
	

double diaria, res1,res2,res3;
int noites;

System.out.println("Insira o valor da diária--> ");
diaria = teclado.nextDouble();

System.out.println("Insira o número de noites--> ");
noites = teclado.nextInt();

if(noites>15) {
	res1 = diaria + (15.50 * noites);
	System.out.println("O valor total é de " + res1);
	
} else if (noites == 15) {
	res2 = diaria + (36.00 * noites);
	System.out.println("O valor total é de " + res2);
	
} else {
	res3 = diaria + (58.00 * noites);
	System.out.println("O valor total é de " + res3);
	
}

	
teclado.close();
}


}
