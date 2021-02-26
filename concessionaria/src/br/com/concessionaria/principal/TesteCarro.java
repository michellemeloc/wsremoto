package br.com.concessionaria.principal;

import javax.swing.JOptionPane;

import br.com.concessionaria.modelo.Carro;

public class TesteCarro {

	//tem main porque é onde roda a aplicação
	public static void main(String[] args) {

		//instanciando (preparar memoria ram e no objeto tem as repartições) um objeto:
		//objeto faz referencia a classe carro
		Carro objeto = new Carro();

		//objeto.preencherValor(Float.parseFloat(JOptionPane.showInputDialog("Digite o valor")));
		//System.out.println(objeto.retornarValor());

		objeto.preencherCor("azul");
		//objeto.preencherCor(JOptionPane.showInputDialog("Digite a cor"));
		System.out.println(objeto.retornarCor());
		
		objeto.ligar();
		objeto.acelerar((short) 30);
		System.out.println(objeto.retornarResumo());
		
		objeto.brecar((short) 100);
		objeto.desligar();
		objeto.acelerar((short) 50);
		System.out.println(objeto.retornarResumo());

		
		
		
		
		
		
		
		

	}

}
