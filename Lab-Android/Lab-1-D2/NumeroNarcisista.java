import java.util.Scanner;

public class NumeroNarcisista {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int soma = 0, k=0;
		int vet[] = new int[100];
		int n = scan.nextInt();
		int m = n;
		while(n>=10) {
			int res = n%10;
			vet[k] = res;
			k++;
			n = n/10;
		}
		vet[k] = n;
		k++;
		
		for(int i=0; i<k; i++) {
			soma = soma + (int) Math.pow(vet[i], k);
		}
		
		if(soma==m) System.out.println("SIM");
		else System.out.println("NAO");
	}
}
