import java.util.Scanner;

public class FaltasTrabalho {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int faltas[] = new int[100];
		
		int i=0;
		int s=0, t=0, q=0, qi=0, se=0, sab=0;
		while(true) {
			int a = scan.nextInt();
			if(a==-1) break;
			if(a==2) s++;
			if(a==3) t++;
			if(a==4) q++;
			if(a==5) qi++;
			if(a==6) se++;
			if(a==7) sab++;
			i++;
		}
		scan.close();
	
		double mseg = (double) s/i;
		double mter = (double) t/i;
		double mqua = (double) q/i;
		double mqui = (double) qi/i;
		double msex = (double) se/i;
		double msab = (double) sab/i;
		
		System.out.printf("%.1f %.1f %.1f %.1f %.1f %.1f\n", mseg*100.0, mter*100.0, mqua*100.0, mqui*100.0, msex*100.0, msab*100.0);
	}
}
