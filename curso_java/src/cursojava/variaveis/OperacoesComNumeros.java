package cursojava.variaveis;

public class OperacoesComNumeros {
	
	public static void main(String[] args) {
		
		/* Tipo int*/
		int nota1 = 90;
		int nota2 = 70;
		int nota3 = 50;
		int nota4 = 88;
		
		System.out.println("A média das notas é = " + (nota1 + nota2 + nota3 + nota4) / 4);
		
		/* Tipo double */
		double nota5 = 90;
		double nota6 = 70;
		double nota7 = 50;
		double nota8 = 88;
		
		double mediaFinal = (nota5 + nota6 + nota7 + nota8) / 4;
		
		System.out.println("A média final é = " + mediaFinal);
		
		// tipo char - representa uma letra
		char pessoaFisica = 'F';
		
		System.out.println("O cliente é = " + pessoaFisica);
		
		char pessoaJuridica = 'J';
		
		System.out.println("o novo cliente é = " + pessoaJuridica);
		
		char pessoaFeminino = 'F';
		
		if (pessoaFeminino == 'F') {
			System.out.println("Feminino");
		} else {
			System.out.println("Masculino");
		}
		
		// Tipo String
		String textoQualquer = "nbqiewqh23  0233ju219j2  24j ofj k2of j3 203=2k3rk=02fke qw22kfk";
		
		System.out.println(textoQualquer);
		
		// Concatenação
		String nome = "Tiago Damin Bis";
		String cpf = "466.748.952-96";
		String telefone = "43 9846-8468";
		String endereco = "Criciúma - SC";
		
		System.out.println(nome + " " + cpf + " " + telefone + " " + endereco);
		
		
	}

}
