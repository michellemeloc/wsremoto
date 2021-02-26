package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeada {

	public static void main(String[] args) {

		String disciplina = JOptionPane.showInputDialog("Disciplina: ");
		float nota1 = Float.parseFloat(JOptionPane.showInputDialog("Nota 1: "));
		float nota2 = Float.parseFloat(JOptionPane.showInputDialog("Nota 2: "));

		float media = (nota1 + nota2)/2;

		if(media>=6) {
			System.out.println("Parabens. aprovado!");
		}else if(media<4) {
			System.out.println("Reprovado");
		}else if(media<6 && media>=4) {
			System.out.println("Exame");
		}

		System.out.println("Sua média foi: " + media);


		
		
		
	}

}
