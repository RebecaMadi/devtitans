import java.util.Scanner;

public class Palindromos {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String palavra = scan.nextLine();
		scan.close();
		
		int tam = palavra.length();
		String nova="";
		
		for(int i=0; i<tam; i++) {
			char c = palavra.charAt(i);
			if((c>=97 && c<=122) || (c>=65 && c<=90)) {
				if(c>=65 && c<=90) nova = nova + c;
				else nova = nova + (char) (c-32);
			}
		}
		
		int verificador = 1, aux = nova.length()-1, j=0;
		
		while(verificador==1 && j<=aux) {
			char c = nova.charAt(j);
			char f = nova.charAt(aux);
			
			if(c!=f) {
				verificador = 0;
				break;
			}
			j++;
			aux--;
		}
		System.out.printf("%s %d\n", nova, verificador);
	}
}
