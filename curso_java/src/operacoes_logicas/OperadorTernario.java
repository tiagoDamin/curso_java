package operacoes_logicas;

public class OperadorTernario {

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 60;
		int nota4 = 80;
		int media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4) /4;
		
		String saidaResultado;
		
		saidaResultado = media > 70 ? "Aluno é aprovado" : "Aluno é reprovado";
		
		System.out.println(saidaResultado);
	}
}
