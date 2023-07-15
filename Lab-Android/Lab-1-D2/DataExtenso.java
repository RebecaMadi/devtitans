import java.util.Scanner;

public class DataExtenso {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String data = scan.next();
		scan.close();
		int dia = Integer.parseInt(data.substring(0, 2));
		int mes= Integer.parseInt(data.substring(2, 4));
		int ano = Integer.parseInt(data.substring(4, 8));
		
		if(mes==1) System.out.printf("%d de janeiro de %d\n", dia, ano);
		if(mes==2) System.out.printf("%d de fevereiro de %d\n", dia, ano);
		if(mes==3) System.out.printf("%d de marco de %d\n", dia, ano);
		if(mes==4) System.out.printf("%d de abril de %d\n", dia, ano);
		if(mes==5) System.out.printf("%d de maio de %d\n", dia, ano);
		if(mes==6) System.out.printf("%d de junho de %d\n", dia, ano);
		if(mes==7) System.out.printf("%d de julho de %d\n", dia, ano);
		if(mes==8) System.out.printf("%d de agosto de %d\n", dia, ano);
		if(mes==9) System.out.printf("%d de setembro de %d\n", dia, ano);
		if(mes==10) System.out.printf("%d de outubro de %d\n", dia, ano);
		if(mes==11) System.out.printf("%d de novembro de %d\n", dia, ano);
		if(mes==12) System.out.printf("%d de dezembro de %d\n", dia, ano);
	}
}
