import java.util.Scanner;

public class AprovacaoDisciplina {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double notas[] = new double[100];
;		int freq[] = new int[100];
		int ch;
		
		int i=0;
		while(true) {
			double a = scan.nextDouble();
			if(a<0) break;
			
			notas[i] = a;
			i++;
		}
		i=0;
		while(true) {
			int a = scan.nextInt();
			if(a==-1) break;
			
			freq[i] = a;
			i++;
		}
		ch = scan.nextInt();
		scan.close();
		int rn=0, ap=0, rf=0;
		for(int j=0; j<i; j++) {
			if(freq[j]>=(0.75*ch)) {
				if(notas[j]>=5.0) ap++;
				else rn++;
			}else {
				rf++;
			}
		}
		
	
		System.out.printf("%d %d %d\n", ap, rn, rf);
	}
}
