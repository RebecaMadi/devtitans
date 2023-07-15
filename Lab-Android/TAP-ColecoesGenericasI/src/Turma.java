import java.util.ArrayList;
import java.util.*;

public class Turma {
	String disciplina;
	int ano;
	int semestre;
	Professor professor;
	
	ArrayList<Aluno> alunos = new ArrayList<Aluno>();
	
	
	int tam;
	
	Turma(String d, int a, int s, Professor p) {
		disciplina = d;
		ano = a;
		semestre = s;
		professor = p;
		tam=0;
	}
	
	Aluno getAluno(int m) {
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno a = iterator.next();
				if(a.matricula==m) return a;
			
		}
		return null;
	}
	
	void addAluno(Aluno a) {
		Iterator<Aluno> iterator = alunos.iterator();
		if(getAluno(a.matricula)==null) {
			alunos.add(a);
		}
	}
	
	double getMediaIdade() {
		int soma=0;
		Iterator<Aluno> iterator = alunos.iterator();
		while(iterator.hasNext()) {
			Aluno a = iterator.next();
			soma += a.getIdade();
		}
		return (double) soma/alunos.size();
	}
	
	String getDescricao() {
		Iterator<Aluno> iterator = alunos.iterator();
		String turma = "Turma " + disciplina + " - " + ano +"/" + semestre + " (" + professor.getDescricao() + "):\n";
		int i=1;
		while(iterator.hasNext()) {
			Aluno a = iterator.next();
			turma += "  - Aluno " + i + ": ";
			turma += a.getDescricao();
			turma += "\n";
			i++;
		}
		//System.out.println(tam);
		return turma;
	}
}
