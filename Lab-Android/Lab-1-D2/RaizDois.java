import java.util.Scanner;

public class RaizDois {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		scan.close();
		double soma=0;
		
		soma = rec(a);
		
	}
	
	public static double rec(int n) {
		if(n==0) return 1;
		else {
			double soma = 1.0/(2 + rec(n-1));
			System.out.printf("%.14f\n", soma+1.00);
			return soma;
		}
	}
}
