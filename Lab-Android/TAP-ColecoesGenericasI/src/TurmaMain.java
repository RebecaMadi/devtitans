
public class TurmaMain {
	public static void main(String[] args) {
		Aluno aluno = new Aluno("Rebeca madi Oliveira", 22153168, 2003);
		Aluno em = new Aluno("Emmett L. Brown", 7714, 2001);
		Aluno es = new Aluno("Egon Spengler", 5970, 2001);
		Professor prof = new Professor("Dr.", "Hubert J. Farnsworth", 2208);
		
		Turma turma = new Turma("Iniciação Tecnológica e Científica", 2016, 1, prof);
		
		turma.addAluno(aluno);
		turma.addAluno(em);
		turma.addAluno(es);
		
		//System.out.println(aluno.getDescricao());
		//System.out.println(prof.getDescricao());
		System.out.println(turma.getDescricao());
	}
}
