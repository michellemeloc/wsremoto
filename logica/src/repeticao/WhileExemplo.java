package repeticao;

import javax.swing.JOptionPane;

public class WhileExemplo {

	public static void main(String[] args) {
		
		String email = JOptionPane.showInputDialog("Email: ").toLowerCase();
		
		while (email.contains("@")==false){
			email = JOptionPane.showInputDialog("Email tem que ter @").toLowerCase();
		}

		System.out.println("Email: " + email);
		
		
		
		
	}

}
