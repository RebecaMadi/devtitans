import java.util.Scanner;

public class MediaColecoes {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int soma = 0, i=0;
		while(true) {
			int a = scan.nextInt();
			soma = 0;
			i=0;
			if(a==-1) {
				break;
			}
			while(true) {
				soma += a;
				i++;
				a = scan.nextInt();
				if(a==-1) {
					break;
				}
			}
			double m = (double) soma/i;
			System.out.printf("%.2f\n", m);
		}
		scan.close();
	}
}
