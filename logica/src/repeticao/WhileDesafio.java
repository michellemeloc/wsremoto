package repeticao;

import javax.swing.JOptionPane;

public class WhileDesafio {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome").toUpperCase();
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
		
		while(nome.contains(" ")==false || nome.length()<5 || nome.length()>15) {
			nome = JOptionPane.showInputDialog("Ajuste o nome").toUpperCase();
		}

		while(idade<18 || idade>70) {
			idade = Integer.parseInt(JOptionPane.showInputDialog("Ajuste a idade "));
			
		}

		System.out.println("Nome: " + nome + "\nIdade: " + idade);

		
		}

	}

