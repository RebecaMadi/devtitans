import java.util.Scanner;

public class Desconto {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float x = scan.nextFloat();
		
		if(x>=200) x = (float) x*0.95f;
		
		System.out.printf("%.2f\n", x);
		
		scan.close();
	}
}
