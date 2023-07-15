import java.util.Scanner;

public class AnimaisCedulas {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextDouble();
		scan.close();
		
			if(r==2) {
				System.out.println("Tartaruga");
			}else if(r==5) {
				System.out.println("Garça");
			}else if(r==10) {
				System.out.println("Arara");
			}else if(r == 20) {
				System.out.println("Mico-leão-dourado");
			}else if(r==50) {
				System.out.println("Onça-pintada");
			}else if(r==100) {
				System.out.println("Garoupa");
			}else {
				System.out.println("erro");
			}
		
	}
}
