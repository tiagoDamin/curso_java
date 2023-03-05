package orientacao_objeto;

//Está é nossa classe/objeto que representa o aluno
public class Aluno {	
	
	// Esses são os atributos do aluno
	String nome;
	int idade;
	String dataNacimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String serieMatriculado;
	
	public Aluno() { // Cria os dados na memória - Sendo padrão do Java
		
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno (String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}
