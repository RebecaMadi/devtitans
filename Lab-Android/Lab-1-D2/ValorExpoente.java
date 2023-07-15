import java.util.Scanner;

public class ValorExpoente {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double valor = scan.nextDouble();
		scan.close();
		int cont = 0;
		double aux=0;
		while(true) {
			cont++;
			aux = aux + Math.pow(2, cont);
			if(aux>valor) break;
		}
		System.out.printf("%d\n", cont);
	}
}
