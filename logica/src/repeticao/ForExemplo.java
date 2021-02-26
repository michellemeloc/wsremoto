package repeticao;

import javax.swing.JOptionPane;

public class ForExemplo {

	public static void main(String[] args) {
		
		/*
		 * For: Para quando não há interação com o usuárop 
		 * Sintaxe:
		 * - definir o contador e o inicio
		 * - condição
		 * - como ele vai contar? de 1 em 1, 2 em 2... (contador++, contador+=2)
		 */
		
		int tabuada = Integer.parseInt(JOptionPane.showInputDialog("Digite a tabuada"));
		
		// 7 x 1 = 7
		// 7 x 2 = 14
		
		for (int contador=0;contador<11;contador++) {
			System.out.println(tabuada + " x " + contador + " = " + (tabuada*contador));
		}
		
		
		
		
		
	}
	
}
