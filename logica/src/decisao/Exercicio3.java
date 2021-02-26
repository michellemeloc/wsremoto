package decisao;

import javax.swing.JOptionPane;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int valor1=Integer.parseInt(JOptionPane.showInputDialog("Valor 1"));
		int valor2= Integer.parseInt(JOptionPane.showInputDialog("Valor 2"));
		char operador = JOptionPane.showInputDialog("Digite o operador").charAt(0);
		if (operador=='+') {
			System.out.println("Resultado: " + (valor1+valor2));
		}else if(operador=='-') {
			System.out.println("Resultado: " + (valor1-valor2));
		}else if(operador=='*') {
			System.out.println("Resultado: " + (valor1*valor2));
		}else if (operador=='/') {
			if (valor2>0) {
				System.out.println("Resultado: " + (valor1/valor2));
			}else {
				System.out.println("O valor 2 deve ser maior que 0");
			}	
		}else {
			System.out.println("Operador inválido");
		}

		
		
		
		
	}

}
