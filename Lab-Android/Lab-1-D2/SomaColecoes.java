
import java.util.Scanner;

public class SomaColecoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0;
		while(true) {
			int a = scan.nextInt();
			soma = 0;
			if(a==-1) {
				break;
			}
			while(true) {
				soma += a;
				a = scan.nextInt();
				if(a==-1) {
					break;
				}
			}
			System.out.printf("%d\n", soma);
		}
	}
	
}
