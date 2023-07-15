
public class Mestre {
		String nome; 
		int anoNascimento;
		String afiliacao;
		String posto;
		
		Mestre(){
			nome = ""; 
			anoNascimento = 0;
			afiliacao = "";
			posto = "";
		}
		
		Mestre(String n, int an, String af, String p){
			nome = n; 
			anoNascimento = an;
			afiliacao = af;
			posto = p;
		}
		
		boolean possuiForca() {
			return posto.equals("Jedi");
		}
		
		String getAnoNascimentoString() {
			String r = "";
			if(anoNascimento<0) {
				int aux = Math.abs(anoNascimento);
				r = r + Integer.toString(aux);
				r = r + "ABY";
			}else {
				r = r + Integer.toString(anoNascimento);
				r = r + "DBY";
			}
			return r;
		}
		
		String getDescricao() {
			return "Mestre: " + "nome=" + nome + ", anoNascimento=" + getAnoNascimentoString() +", afiliacao=" + afiliacao + ", posto=" + posto +", possuiForca=" + possuiForca()+ ".";
		}
		
		int getIdade(int ar) {
			return (int) Math.abs(anoNascimento-ar); 
		}
	
}
