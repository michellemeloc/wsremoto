package br.com.caicai.modelo;

public class Elevador {

	private String nome;
	private short andarMaximo;
	private short andarMinimo;
	private short andarAtual;
	private byte capacidadeMaxima;
	private byte qtdePessoas;


	public void preencherNome(String param) {
		nome = param.toUpperCase();
	}

	public String retornarNome() {
		return nome;
	}

	//configurar(maximo:short, minimo:short, capacidade:byte)
	public void configurar(short maximo, short minimo, byte capacidade) {
		andarMaximo = maximo;
		andarMinimo = minimo;
		capacidadeMaxima = capacidade;
	}

	public void subir() {
		if (andarAtual < andarMaximo) {
			andarAtual++;
		}
	}

	public void descer() {
		if (andarAtual > andarMinimo) {
			andarAtual--;
		}
	}

	public String sair(byte qtde) {
		if (qtdePessoas - qtde >= 0) {
			qtdePessoas = (byte) (qtdePessoas - qtde);
			//qtdePessoas-=qtde;
			return "Saída realizada";
		}
		return "Saída não realizada";
	}

	public String entrar(byte qtde) {
		if ((qtdePessoas+qtde)<=capacidadeMaxima) {
			qtdePessoas+=qtde;
			return "Entrada realizada";
		}
		return "Entrada não realizada";
	}

	public void subir(byte andar) {
		if (andarAtual+andar<andarMaximo) {
			andarAtual += andar;
		}
	}

	public String exibirResumo() {
		return "Andar atual: " + andarAtual + 
				"\nQtde pessoas: " + qtdePessoas + 
				"\nNome elevador: " + nome;
	}




}
