package decisao;

import javax.swing.JOptionPane;

public class DecisaoEncadeamentoDesafio4 {

	public static void main(String[] args) {
		
		//Escreva um c�digo que leia tr�s valores inteiros e diferentes e mostre-os em ordem decrescente
		
		
		int num1 = Integer.parseInt(JOptionPane.showInputDialog("Numero 1: "));
		int num2 = Integer.parseInt(JOptionPane.showInputDialog("Numero 2: "));
		int num3 = Integer.parseInt(JOptionPane.showInputDialog("Numero 3: "));
		
		
		if(num1 < num2 && num1 < num3) {
			if(num2 < num3) {
				System.out.println("Ordem: " + num3 + " " + num2 + " " + num1);
			}else {
				System.out.println("Ordem: " + num2 + " " + num3 + " " + num1);
			} 
		}else if(num2 < num1 && num2 < num3) {
			if(num1 < num3) {
				System.out.println("Ordem: " + num3 + " " + num1 + " " + num2);
			}else {
				System.out.println("Ordem: " + num1 + " " + num3 + " " + num2);
			} 
		}else if(num3 < num1 && num3 < num2) {
			if(num1 < num2) {
				System.out.println("Ordem: " + num2 + " " + num1 + " " + num3);
			}else {
				System.out.println("Ordem: " + num1 + " " + num2 + " " + num3);
			} 
		}
		
		
		
		
	}
	
}
