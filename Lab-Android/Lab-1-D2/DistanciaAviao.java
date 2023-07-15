import java.util.Scanner;

public class DistanciaAviao {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int horas[][] = {{0, 2, 11, 6, 15, 11, 1}, 
				{2, 0, 7, 12, 4, 2, 15}, 
				{11, 7, 0, 11, 8, 3, 13}, 
				{6, 12, 11, 0, 10, 2, 1}, 
				{15, 4, 8, 10, 0, 5, 13}, 
				{11, 2, 3, 2, 5, 0, 14}, 
				{1, 15, 13, 1, 13, 14, 0}};
		
		int escala[] = new int[100];
		int i=0, soma=0;
		
		while(true) {
			int a = scan.nextInt();
			if(a==-1)break;
			int n = (int) a/100;
			escala[i] = n-1;
			if(i>=1) {
				soma += horas[escala[i-1]][escala[i]];
				
			}
			i++;
		}
		scan.close();
		System.out.println(soma);
	}
}
