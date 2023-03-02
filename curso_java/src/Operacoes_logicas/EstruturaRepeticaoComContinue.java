package Operacoes_logicas;

public class EstruturaRepeticaoComContinue {

	public static void main(String[] args) {
		for (int numero = 0; numero <= 7; numero ++) {
			
			if (numero == 1 || numero == 3 || numero == 5) {
				System.out.println("Obaa, encontrei o número " + numero);
				continue;
			}
			System.out.println("O número atual é: " + numero);
		}
	}
}
