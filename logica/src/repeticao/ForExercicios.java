package repeticao;

import javax.swing.JOptionPane;

public class ForExercicios {
 
	public static void main(String[] args) {
		
		/*
		 * 
		 * Exercio 1
		 * 
		 * 
		int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia"));
		int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes"));
		int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano"));
	
		
		while(dia>31 || dia<0) {
			System.out.println("Dia deve ser menor que 31");
			dia = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente o dia"));
		}
		
		while(mes>12 || dia<0) {
			System.out.println("Dia deve ser menor que 12");
			mes = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente o Mes"));
		}
		
		while (ano<1000 || ano>9999) {
			System.out.println("Dia deve estar entre 1000 e 9999");
			ano = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente o Ano"));
			
		}
		
		System.out.println(dia + " " + mes + " " + ano);
	
	*/
		
	//Exercicio 2
		
		String escol = JOptionPane.showInputDialog("Nivel de escolaridada (Medio, Superior ou Pos)").toUpperCase();
		int contadorMedio = 0;
		int contadorSup = 0;
		int contadorPos = 0;
		
		

		do {
		
		if(escol=="MEDIO" || contadorMedio > contadorSup && contadorMedio > contadorPos) {
			contadorMedio = contadorMedio+1;
			escol = JOptionPane.showInputDialog("Nivel de escolaridada (Medio, Superior ou Pos)").toUpperCase();
			//System.out.println("Resultado: " + contadorMedio);
			//System.out.println("Medio: " + medio);
		}else if(escol=="SUPERIOR" || contadorSup > contadorMedio && contadorSup > contadorPos){
			contadorSup = contadorSup+1;
			escol = JOptionPane.showInputDialog("Nivel de escolaridada (Medio, Superior ou Pos)").toUpperCase();
			//System.out.println("Resultado: " + contadorSup);
		}else {
			contadorPos = contadorPos+1;
			escol = JOptionPane.showInputDialog("Nivel de escolaridada (Medio, Superior ou Pos)").toUpperCase();
			//System.out.println("Resultado: " + contadorPos);
		}	
			
		}while(!escol.equals("MEDIO") || !escol.equals("SUPERIOR") || !escol.equals("POS") || !escol.equals("S"));
		
		System.out.println("Resultado: " + contadorPos);		
		
		
	}
}
