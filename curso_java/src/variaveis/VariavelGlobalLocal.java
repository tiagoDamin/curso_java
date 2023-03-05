package variaveis;

public class VariavelGlobalLocal {
	
	/*Váriavel Global é acessivel a todos e oseu valor é compartilhado*/
	static int maiorIdadeGlobal = 30;

	public static void main(String[] args) {
		
		/* Variável Local porque pertence somente a esse método e o valor fica dentro do 
		 * método*/
		int maiorIdade = 18;
		
		System.out.println("Valor da váriavel Local = " + maiorIdade);
		
		metodo2();
	}
	
	public static void metodo2 () {
		int mediaAno = 50;
		System.out.println("Valor da váriavel Global = " + maiorIdadeGlobal);
		System.out.println("A média do ano é = " + mediaAno);
	}
	
}
