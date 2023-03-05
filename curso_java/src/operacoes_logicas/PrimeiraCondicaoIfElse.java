package operacoes_logicas;

public class PrimeiraCondicaoIfElse {
	 public static void main(String[] args) {
		
		 int mediaAluno = 70;
		 String nome = "Tir";
		 
		 if (mediaAluno >= 70 && nome.equals("Alex")) {
			 
			 System.out.println("Parabéns você está aprovado!");
		 } else	if (mediaAluno < 70) {
			 System.out.println("Lamento, você está reprovado.");
		 } else {
			 System.out.println("Aluno não encontrado");
		 }
	}
}
