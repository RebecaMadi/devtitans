import java.util.Scanner;

public class CaixaEletronico {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int valor = scan.nextInt();
		
		if(valor<0 || (valor%2)!=0) {
			System.out.println("Valor Invalido");
		}else {
			int quo50 = valor/50;
			int res50 = valor%50;
			
			int quo10 = res50/10;
			int res10 = res50%10;
			
			int quo2 = res10/2;
			
			System.out.printf("%d notas de R$50, %d notas de R$10 e %d notas de R$2\n", quo50, quo10, quo2);
		}
	}
}
