import java.util.Scanner;

public class DiaSemana {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int semana[][] = new int[100][7];
		int horas[] = {0, 0, 0, 0, 0, 0, 0};
		int maior=0;
		int i=0;
		while(true) {
			int a = scan.nextInt();
			if(a==-1) break;
			semana[i][0] = a;
			horas[0] += a;
			if(horas[0]>maior) maior = horas[0];
			for(int j=1; j<7; j++) {
				semana[i][j] = scan.nextInt();
				horas[j] += semana[i][j];
				if(horas[j]>maior) maior = horas[j];
			}
			i++;
		}
		for(int j=0; j<7; j++) {
			if(horas[j]==maior) System.out.printf("%d\n", j+1);
		}
		scan.close();
	
	}
}
