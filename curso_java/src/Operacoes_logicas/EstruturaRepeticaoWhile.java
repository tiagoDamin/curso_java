package Operacoes_logicas;

public class EstruturaRepeticaoWhile {

	public static void main(String[] args) {

		int numero = 0;
		
		while (numero < 3) {
			System.out.println("O número atual é: " + numero);
			numero ++;
		}
		
		System.out.println("\n");
		
		int numero2 = 0;
		
		do {
			System.out.println("O número atual é: " + numero2);
			numero2 ++;
		} while (numero2 < 3);
	}
}
