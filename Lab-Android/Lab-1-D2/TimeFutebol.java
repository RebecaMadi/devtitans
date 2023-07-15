import java.util.Scanner;

public class TimeFutebol {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int golsT[] = new int[100];
		int golsA[] = new int[100];
		
		int i=0;
		while(true) {
			int a = scan.nextInt();
			if(a==-1) break;
			
			golsT[i] = a;
			i++;
		}
		i=0;
		int v=0, e=0, d=0;
		while(true) {
			int a = scan.nextInt();
			if(a==-1) break;
			
			golsA[i] = a;
			if(golsT[i]<golsA[i]) d++;
			if(golsT[i]==golsA[i]) e++;
			if(golsT[i]>golsA[i]) v++;
			i++;
		}
		scan.close();
	
		System.out.printf("%d %d %d\n", v, e, d);
	}
}
