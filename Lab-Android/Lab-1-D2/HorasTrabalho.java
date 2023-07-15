import java.util.Scanner;

public class HorasTrabalho {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int semana[][] = new int[100][7];
		int horas[] = new int[100];
		
		int i=0;
		while(true) {
			int a = scan.nextInt();
			if(a==-1) break;
			semana[i][0] = a;
			horas[i] = a;
			for(int j=1; j<7; j++) {
				semana[i][j] = scan.nextInt();
				horas[i] += semana[i][j];
			}
			i++;
		}
		for(int j=0; j<i; j++) {
			System.out.println(horas[j]);
		}
		scan.close();
	
	}
}
