import java.util.Scanner;

public class AproximacaoPi {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n==1) {
			System.out.println("3.000000");
		}else if(n>1) {
			double v = 3;
			n--;
			int cont = 2;
			System.out.printf("%.6f\n", v);
			for(int i=0; i<n; i++) {
				double aux = 4.0/(cont*(cont+1)*(cont+2));
				cont += 2;
				if((i%2)!=0) {
					v = v - aux;
				}else {
					v = v + aux;
				}
				System.out.printf("%.6f\n", v);
			}
		}
		scan.close();
	}
}
