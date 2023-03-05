package operacoes_logicas;

import javax.swing.JOptionPane;

public class EntradaDadosMedia {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite o nome do aluno ");
		String nota1 = JOptionPane.showInputDialog("Digite a nota 1 ");
		String nota2 = JOptionPane.showInputDialog("Digite a nota 2 ");
		String nota3 = JOptionPane.showInputDialog("Digite a nota 3 ");
		String nota4 = JOptionPane.showInputDialog("Digite a nota 4 ");
		
		double dNota1 = Double.parseDouble(nota1);
		double dNota2 = Double.parseDouble(nota2);
		double dNota3 = Double.parseDouble(nota3);
		double dNota4 = Double.parseDouble(nota4);
		
		double media = (dNota1 + dNota2 + dNota3 + dNota4) / 4;
		
		if (media >= 50) {
			if (media >= 95) {
				JOptionPane.showInternalMessageDialog(null, "Parabéns, você foi aprovado com média de: " + media);
			} else if (media > 70) {
				JOptionPane.showInternalMessageDialog(null, "O aluno " + nome + " está aprovado com média de : " + media);
			} else {
				JOptionPane.showInternalMessageDialog(null, "O aluno " + nome + " está em recuperação com média de : " + media);
			}
		} else {
			JOptionPane.showMessageDialog(null, "O aluno " + nome + " está reprovado com média de : " + media );
		}
	}
}
