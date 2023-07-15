import java.util.Scanner;

public class TanqueCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		double x = scan.nextDouble();
		int o = scan.nextInt();
		scan.close();
		
		double v = (Math.PI)*(4.0/3.0)*r*r*r;
		double v2 = (Math.PI)*(1.0/3.0)*x*x*(3.0*r - x);
		
		if(o==1) {
			System.out.printf("%.4f\n", v2);
		}else if(o==2) {
			double va = v - v2;
			System.out.printf("%.4f\n", va);
		}
	}
}
