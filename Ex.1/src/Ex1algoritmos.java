import java.util.Scanner;

public class Ex1algoritmos {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		import Scanner.class;
	
	Scanner teclado = new Scanner (System.in);
	
	double a, b, c, d, e, f, y;
	
	System.out.println("a--> ");
	a = teclado.nextDouble();
	System.out.println("b--> ");
	b = teclado.nextDouble();

	System.out.println("c--> ");
	c = teclado.nextDouble();

	System.out.println("d--> ");
	d = teclado.nextDouble();

	System.out.println("e--> ");
	e = teclado.nextDouble();

	System.out.println("f--> ");
	f = teclado.nextDouble();

	
	y = (a + (b / c)) / (d - (e / f));
	
	System.out.println("y--> " + y);
	
	
	double x, y;
	
	System.out.println("x--> ");
	x = teclado.nextDouble();
	
	
	
	y = ((2 * x * x - 3 * Math.pow(x, x + 1)) / 2 + (Math.sqrt(x + 1)) / x) / (Math.pow(2, x));
	
	System.out.println("y--> " + y);
	
	
	double x, b, a, f;
	
	System.out.println("b--> ");
	b = teclado.nextDouble();
			
	System.out.println("a--> ");		
	a = teclado.nextDouble();
	
	System.out.println("f--> ");
	f = teclado.nextDouble();
	
	x = ((Math.sqrt(2 * b - 4 * a)) + (2 * Math.pow(f, - 3))) / (3 - (2 * a));
	
	System.out.println("x--> " + x);
	
	double a, b, c, d, e, f, g, h, i, j, x;
	
	System.out.println("a--> ");
	a = teclado.nextDouble();
	
	System.out.println("b--> ");
	b = teclado.nextDouble();
	
	System.out.println("c--> ");
	c = teclado.nextDouble();
	
	System.out.println("d--> ");
	d = teclado.nextDouble();
	
	System.out.println("e--> ");
	e = teclado.nextDouble();
	
	System.out.println("f--> ");
	f = teclado.nextDouble();
	
	System.out.println("g--> ");
	g = teclado.nextDouble();
	
	System.out.println("h--> ");
	h = teclado.nextDouble();
	
	System.out.println("i--> ");
	i = teclado.nextDouble();
	
	System.out.println("j--> ");
	j = teclado.nextDouble();
	
	x = ((a - b) + (e + f)) / ((c - d) + (g + h)) * i / j;
	
	System.out.println("x--> " + x);
	
double y, h, x;
	
	System.out.println("h--> ");
	h = teclado.nextDouble();
	
	System.out.println("x--> ");
	x = teclado.nextDouble();
	
	
	y = (2 * h) - Math.pow(45 / (3 * x) - 4 * h * (3 - h), 2 * h);
	
	System.out.println("y--> " + y);
	
	
	
			
	
	
	
	
	
	
	
	
	}

}
