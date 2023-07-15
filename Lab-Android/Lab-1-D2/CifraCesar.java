import java.util.Scanner;

public class CifraCesar {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int desloc = scan.nextInt();
		String palavra = scan.nextLine();
		scan.close();
		
		int tam = palavra.length();
		String cifrado="";
		
		for(int i=0; i<tam; i++) {
			char c = palavra.charAt(i);
			if(c>=97 && c<=122) {
				char aux = (char) (c + desloc);
				if(aux>'z') aux = (char) (65 + (aux-123));
				else aux = (char) (aux - 32);
				
				cifrado = cifrado + aux;
			}else {
				cifrado = cifrado + c;
			}
		}
		
		System.out.println(cifrado.substring(1, tam));
	}
}
