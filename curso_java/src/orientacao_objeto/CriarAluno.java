package orientacao_objeto;

public class CriarAluno {
  
	public static void main(String[] args) {
		
		// New Aluno() é uma instancia (Criação de objeto)
		Aluno aluno1 = new Aluno(); // Aqui seráo João
				
		Aluno aluno2 = new Aluno(); // Aqui será o Pedro
		
		Aluno aluno3 = new Aluno(); // Aqui será o Alex
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
	}
}
