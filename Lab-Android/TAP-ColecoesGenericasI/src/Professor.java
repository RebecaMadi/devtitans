import java.util.Calendar;

public class Professor {
	String nome;
	int matricula;
	String titulacao;
	
	Professor(){
		nome = "";
		matricula = 0;
		titulacao = "";
	}
	
	Professor(String t, String n, int m){
		nome = n;
		matricula = m;
		titulacao = "Prof. " + t;
	}
	
	
	String getDescricao() {
		return titulacao + " " + nome + " " + "- mat " + matricula;
	}
}
