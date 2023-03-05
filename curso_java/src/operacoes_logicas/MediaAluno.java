package operacoes_logicas;

public class MediaAluno {

	public static void main(String[] args) {
		
		int nota1 = 10;
		int nota2 = 0;
		int nota3 = 50;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		if (media > 70) {
			System.out.println("Aluno está aprovado: " + media);
		} else if (media >= 40 && media <= 69) {
			System.out.println("Aluno em recuperção: " + media);
		}
		else {
			System.out.println("Aluno está reprovado: " + media);
		}
	}
}
