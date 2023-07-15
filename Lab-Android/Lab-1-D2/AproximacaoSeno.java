import java.util.Scanner;

public class AproximacaoSeno {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		int k = scan.nextInt();
		
			int cont = 3;
			
			double v = Math.toRadians(n);
			n = v;
			System.out.printf("%.10f\n", n);
			for(int i=1; i<k; i++) {
				double aux = (double) Math.pow(n, cont)/fat(cont);
				cont += 2;
				if((i%2)!=0) {
					v = v - aux;
				}else {
					v = v + aux;
				}
				System.out.printf("%.10f\n", v);
			}
		
		scan.close();
	}
	
	public static double fat(int n) {
		if(n==0 || n==1) return 1.0;
		else return n*fat(n-1);
	}
}
