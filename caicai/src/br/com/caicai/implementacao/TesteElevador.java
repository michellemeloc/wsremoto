package br.com.caicai.implementacao;

import br.com.caicai.modelo.Elevador;

public class TesteElevador {

	public static void main(String[] args) {
		
		Elevador objeto = new Elevador();

		objeto.preencherNome("Michelle");
		
		//Andar maxixo / andar minimo / capacidade 
		objeto.configurar((short)10, (short)1, (byte)5);
		
		/*
		 * Outra forma:
		 * elevador.configurar(
		 * 			Short.parseShort(JOptionPane.showInputDialog("Andar Max")),
		 * 			Short.parseShort(JOptionPane.showInputDialog("Andar Min")),
		 * 			Byte.parseByte(JOptionPane.showInputDialog("Capacidade")),
		 * );
		 * 
		 */
		
		objeto.subir((byte) 4);
		objeto.entrar((byte) 4);
		objeto.sair((byte) 2);
		objeto.descer();
		
		System.out.println(objeto.exibirResumo());
		
		
	}

}
