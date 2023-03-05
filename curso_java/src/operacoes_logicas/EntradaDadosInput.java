package operacoes_logicas;

import javax.swing.JOptionPane;

public class EntradaDadosInput {
	
	public static void main(String[] args) {
		
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros?");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas?");
		
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		
		int divisao = (int)(carroNumero / pessoaNumero);
		
		int resto = (int) (carroNumero % pessoaNumero);
		
		JOptionPane.showMessageDialog(null, "Divisão para pessoas deu: " + divisao + " carros por pessoa e sobrou " + resto + " carro(s).");
		
	}
}
