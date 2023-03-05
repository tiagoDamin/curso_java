package operacoes_logicas;

public class EstruturaFor {

	public static void main(String[] args) {
		
		System.out.println("Incremento \n");
		for (int numero = 0; numero <= 10; numero ++) {
			System.out.println("O número atual é: " + numero);
		}
		
		System.out.println("Decremento \n");
		for (int numero2 = 10; numero2 > 0; numero2 --) {
			System.out.println("O número atual é: " + numero2);
		}
	}
}
