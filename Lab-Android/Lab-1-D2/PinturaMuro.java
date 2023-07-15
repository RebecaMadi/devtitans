import java.util.Scanner;

public class PinturaMuro {
	public static void main(String[] args){
		int area = 12*3;
		Scanner scan = new Scanner(System.in);
		float v = scan.nextFloat();
		float r = 100f + area*v;
		System.out.printf("%.1f\n", r);
	}
}
