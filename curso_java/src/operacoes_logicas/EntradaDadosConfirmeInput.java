package operacoes_logicas;

import javax.swing.JOptionPane;

public class EntradaDadosConfirmeInput {

	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Digite a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Digite a quantidade de pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int)(carroNumero / pessoaNumero);
		
		int resto = (int)(carroNumero % pessoaNumero);
		
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão?");
		
		if (resposta == 0) {			
			JOptionPane.showMessageDialog(null, "Divisão para pessoas deu " + divisao);
		} 
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão?");
		
		if (resposta == 0) {
			JOptionPane.showInternalMessageDialog(null,"O resto da divisão é " + resto);
		}
		
	}
}
