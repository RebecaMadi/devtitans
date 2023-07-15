import java.util.Scanner;

public class AngryBirds {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float v = scan.nextFloat();
		float a = scan.nextFloat();
		float d = scan.nextFloat();
		
		float sin = (float) Math.sin(Math.toRadians(2*a));
		
		float r = (Math.abs(v*v)*sin)/9.8f;
		
		if(Math.abs(r-d)<=0.1) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		scan.close();
	}
}
