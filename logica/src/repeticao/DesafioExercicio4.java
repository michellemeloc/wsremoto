package repeticao;

import javax.swing.JOptionPane;

public class DesafioExercicio4 {

	public static void main(String[] args) {
		
	//	====================Slide77Exercicio4==========================

				String nome="";
				short idade=0;
				int contadorMaiorIdade=0;
				int totalIdades=0;
				int qtdePessoas=0;
				String nomeExperiente="";
				int idadeExperiente=0;
				String nomeJovem="";
				int idadeJovem=0;
				
				do {
					
					nome = JOptionPane.showInputDialog("Nome").toUpperCase(); 
					idade = Short.parseShort(JOptionPane.showInputDialog("Idade"));
					
					if (idade<idadeJovem || qtdePessoas==0) {
						nomeJovem=nome;
						idadeJovem=idade;
					}
					
					if (idade>idadeExperiente) {
						nomeExperiente=nome;
						idadeExperiente=idade;
					}
					
					totalIdades=totalIdades+idade;
					qtdePessoas++;
					
					if (idade>=18) {
						contadorMaiorIdade++;
					}
					
				}while(JOptionPane.showConfirmDialog
					     (null, "Continuar?", "Titulo", JOptionPane.YES_NO_OPTION)==0);
				
				JOptionPane.showMessageDialog(null, "Pessoas maiores de idade: " + contadorMaiorIdade);
				JOptionPane.showMessageDialog(null, "Média de idades: " + (totalIdades/qtdePessoas));
				JOptionPane.showMessageDialog(null, "Mais Experiente: " + nomeExperiente + "\nIdade: " + idadeExperiente);
				JOptionPane.showMessageDialog(null, "Mais Jovem: " + nomeJovem + "\nIdade: " + idadeJovem);		

		//===============================================================

	}

}
