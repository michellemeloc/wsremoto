package repeticao;

import javax.swing.JOptionPane;

public class DoDesafio {

	public static void main(String[] args) {

		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor"));
		int chute = 0;
		int contagem = 0;
		
		do {
		//linha que tem que se repetir joga no Do. Boa pr�tica vari�vel criada fora do la�o primeiro
			chute = Integer.parseInt(JOptionPane.showInputDialog("Advinhe o valor"));
			
			contagem = contagem+1;
			//contagem++;
			//contagem+=1;
			
		if (chute>valor) {
			System.out.println("Valor chutado foi mais alto");
		}else if (chute<valor){
			System.out.println("Valor chutado foi mais baixo");
		}
		
		}while(valor!=chute);
		
		System.out.println("Parab�ns! Voc� acertou com " + contagem + " tentativas.");
				
		

	}

}
