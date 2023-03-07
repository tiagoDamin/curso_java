package orientacao_objeto;

import javax.swing.JOptionPane;

public class CriarAluno {
  
	public static void main(String[] args) {
		
		// New Aluno() é uma instancia (Criação de objeto)
		// aluno1 é uma referencia para o objeto Aluno
		
		String nome = JOptionPane.showInputDialog("Qual é nome do aluno");
		String idade = JOptionPane.showInputDialog("Qual é a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual é  data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual é o Registro Geral?");
		String cpf = JOptionPane.showInputDialog("Qual é o CPF?");
		String nomeMae = JOptionPane.showInputDialog("Qual é o nome da mãe do aluno?");
		String nomePai = JOptionPane.showInputDialog("Qual é o nome do pai do aluno?");
		String dataMatricula = JOptionPane.showInputDialog("Qual a data de matricula do aluno?");
		String serieMatriculado = JOptionPane.showInputDialog("Qual é a série que o aluno está matriculado?");
		String nomeEscola = JOptionPane.showInputDialog("Qual é o nome da escola?");

		Aluno aluno1 = new Aluno(); // Aqui seráo João
		
		aluno1.setNome(nome);		
		aluno1.setIdade(Integer.valueOf(idade));		
		aluno1.setDataNacimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);		
		aluno1.setNomeMae(nomeMae);		
		aluno1.setNomePai(nomePai);		
		aluno1.setDataMatricula(dataMatricula);		
		aluno1.setSerieMatriculado(serieMatriculado);		
		aluno1.setNomeEscola(nomeEscola);
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina " + pos + " ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina " + pos + " ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina?");
		
		if (escolha == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1, 2, 3, 4 ?");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - 1);
		}
		System.out.println(aluno1.toString());
		System.out.println("Média do aluno = " + aluno1.getMediaNota());
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
	}
}
