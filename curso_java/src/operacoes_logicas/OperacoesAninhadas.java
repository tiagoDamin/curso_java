package operacoes_logicas;

public class OperacoesAninhadas {
 
	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 70;
		int nota4 = 90;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;

//		Opera��es l�gicas aninhadas: s�o opera��es dentro de opera��es
		
		if (media >= 50) {
			if (media >= 70) {
				if (media >= 90) {
					System.out.println("Aluno est� aprovado direto - Parab�ns " + media);
				} else {
					System.out.println("Aluno est� aprovado direto " + media);					
				}
			} else {
				System.out.println("Aluno est� em recupera��o " + media);
			}
		} else {
			System.out.println("Aluno est� reprovado direto " + media);
		}
	}
}
