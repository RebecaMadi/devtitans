import java.util.Scanner;

public class FolhaPagamento {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double vh = scan.nextDouble();
		int h = scan.nextInt();
		scan.close();
		
		double vb = vh*h;
		double ir = 0.11*vb;
		double inss = 0.08*vb;
		double desc = ir+inss;
		double vl = vb-desc;
		
		System.out.printf("Salario bruto: R$%.2f\n", vb);
		System.out.printf("IR: R$%.2f\n", ir);
		System.out.printf("INSS: R$%.2f\n", inss);
		System.out.printf("Total de descontos: R$%.2f\n", desc);
		System.out.printf("Salario liquido: R$%.2f\n", vl);
		
	}
}
