package br.com.concessionaria.modelo;

public class Carro {

	private float valor;
	private String cor;
	private boolean status;
	private short velocidadeAtual;
	private String modelo;


	//Sintaxe para os m�todos
	//<modificador> <tipo do retorno> <nome do metodo> (<tipo do parametro> <nome do parametro>)

	//M�TODO VALOR
	public void preencherValor(float param) {
		if(param>0) {
			valor=param;
		}
	}
	/*
	 * Ou:
	 * public void preencherValor(float param) {
		valor = param;
	}
	 */

	public float retornarValor() {
		return valor;
	}

	//M�TODO COR
	public void preencherCor(String param) {
		cor = param.toUpperCase();
	}

	public String retornarCor(){
		return cor;
	}

	//M�TODO LIGAR E DESLIGAR 

	public void ligar() {
		status = true;
	}

	public void desligar() {
		status = false;
		velocidadeAtual=0;
	}

	//M�TODO ACELERAR
	public void acelerar(short velocidade) {
		if(status==true) {
			velocidadeAtual = (short) (velocidadeAtual + velocidade);
		}
	}

	//M�TODO BRECAR
	public void brecar(short velocidade) {
		if(status==true && velocidadeAtual>=velocidade) {
			velocidadeAtual = (short) (velocidadeAtual - velocidade);
		}
	}

	//
	public String retornarResumo() {
		String strstatus = "LIGADO";
		if (status==false) {
			strstatus="DELISGADO";
		}
		return "Modelo: " + modelo + 
				"\nStatus: " + strstatus + 
				"\nVelocidade: " + velocidadeAtual;
	}







}
