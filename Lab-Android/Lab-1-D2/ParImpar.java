import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args){
		int a;
		Scanner scan = new Scanner(System.in);
		do {
			a = scan.nextInt();
			if(a!=-1) {
				if((a%2)==0) System.out.println("PAR");
				else System.out.println("IMPAR");
			}
		}while(a!=-1);
	}
}
