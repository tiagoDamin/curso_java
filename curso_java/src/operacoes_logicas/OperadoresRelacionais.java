package operacoes_logicas;

public class OperadoresRelacionais {

	public static void main(String[] args) {
		
		int nota1 = 90;
		int nota2 = 90;
		
		if (nota1 == nota2) {
			System.out.println("As notas são iguais");
		} else {
			System.out.println("As notas são diferentes");
		}
		
		int nota3 = 91;
		int nota4 = 90;
		
		if (nota3 != nota4) {
			System.out.println("As notas são diferentes");
		} else {
			System.out.println("As notas são iguais");
		}
		
		if (nota3 > nota4 ) {
			System.out.println("A nota 3 é maior que a nota 4");
		} else {
			System.out.println("A nota ´3 não é maior que a nota 4");
		}
		
		if (nota4 < nota3) {
			System.out.println("A nota 4 é menor que a nota3");
		} else {
			System.out.println("A nota 4 não é menor que a nota 3");
		}
	}
}
