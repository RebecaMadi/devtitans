import java.util.Scanner;

public class OperacoesString {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String palavra = scan.nextLine();
		scan.close();
		int tam = palavra.length();
		System.out.println(tam);
		System.out.println(palavra.substring(0, 1));
		System.out.println(palavra.substring(tam-1, tam));
		System.out.println(palavra.toUpperCase());
		System.out.println(palavra.toLowerCase());
		int vogais=0;
		String e="", p="";
		for(int i=0; i<tam; i++) {
			char c = palavra.charAt(i);
			if((i%2)==0) {
				p = p + c;
			}
			switch (c) {
			case 'A':
				vogais++;
				break;
			case 'a':
				vogais++;
				e = e + 'e';
				continue;
			case 'E':
				vogais++;
				break;
			case 'e':
				vogais++;
				break;
			case 'I':
				vogais++;
				break;
			case 'i':
				vogais++;
				break;
			case 'O':
				vogais++;
				break;
			case 'o':
				vogais++;
				break;
			case 'U':
				vogais++;
				break;
			case 'u':
				vogais++;
				break;
			default:
				break;
			}
			e = e + c;
		}
		System.out.println(e);
		System.out.println(p);
		System.out.println(vogais);
	}
}
