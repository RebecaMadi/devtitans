import java.util.Scanner;

public class AreaTriangulo {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		if((a+b)<=c || (a+c)<=b || (b+c)<=a) {
			System.out.println("Triangulo invalido");
		}else {
			float s = (a+b+c)/2.0f;
			float area = s*(s-a)*(s-b)*(s-c);
			area = (float) Math.sqrt(area);
			
			System.out.printf("%.2f\n", area);
		}
	}
}
