
import java.util.Calendar;

public class Aluno {
	String nome;
	int matricula;
	int anoNascimento;
	
	Aluno(){
		nome = "";
		matricula = 0;
		anoNascimento = 0;
	}
	
	Aluno(String n, int m, int an){
		nome = n;
		matricula = m;
		anoNascimento = an;
	}
	
	int getIdade() {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		return ano - anoNascimento;
	}
	
	String getDescricao() {
		return nome + " (mat=" + matricula + ", idade=" + getIdade() + ")";
	}
}
