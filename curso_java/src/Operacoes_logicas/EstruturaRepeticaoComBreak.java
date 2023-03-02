package Operacoes_logicas;

public class EstruturaRepeticaoComBreak {
	public static void main(String[] args) {
		for (int numero = 10; numero >= 0; numero --) {
			if (numero == 7) {
				System.out.println("Obaa, encontrei o número 7");
				System.out.println("Estou parando de executar");
				break;
			} 
			System.out.println("O número atual é: " + numero);
		}
	}
}
