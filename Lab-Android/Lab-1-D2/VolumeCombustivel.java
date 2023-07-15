import java.util.Scanner;

public class VolumeCombustivel {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double H = scan.nextDouble();
		double h = scan.nextDouble();
		double r = scan.nextDouble();
		scan.close();
		double a=-1.00;
		
		if(H>0 && h>=0 && r>0) {
			
			if(h>r) {
				double l = H - 2*r;
				if(h<=(l+r)) {
					double sve = 0.5*(Math.PI)*(4.0/3.0)*r*r*r;
					double vc = Math.PI*r*r*(h-r);
					a = sve + vc;
				}else {
					double ve = (Math.PI)*(4.0/3.0)*r*r*r;
					double vc = Math.PI*r*r*(h-r);
					double x = H-h;
					double vcl = (Math.PI)*(1.0/3.0)*x*x*(3.0*r - x);
					a = ve+vc+vcl;
				}
			}else if(h==r) {
				a =  0.5*(Math.PI)*(4.0/3.0)*r*r*r;
			}else if(h<r) {
				double x = h;
				a = (Math.PI)*(1.0/3.0)*x*x*(3.0*r - x);
			}
			System.out.printf("%.3f\n", a);
		}else {
			System.out.println("-1.000");
		}
	}
}
