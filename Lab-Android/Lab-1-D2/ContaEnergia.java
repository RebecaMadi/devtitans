import java.util.Scanner;

public class ContaEnergia {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		String op = scan.next();
		scan.close();
		
		if(op.equals("R") && r>=0) {
			if(r<=500) r = r*0.4;
			else r = r*0.65;
			
			System.out.printf("%.2f\n", r);
		}else if(op.equals("I") && r>=0) {
			if(r<=1000) r = r*0.55;
			else r = r*0.60;
			
			System.out.printf("%.2f\n", r);
		}else if(op.equals("C") && r>=0) {
			if(r<=5000) r = r*0.55;
			else r = r*0.60;
			
			System.out.printf("%.2f\n", r);
		}else {
			System.out.println("-1.00");
		}
		
	}
}
