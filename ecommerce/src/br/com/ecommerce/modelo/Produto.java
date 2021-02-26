package br.com.ecommerce.modelo;

/*
 * Design Pattern - Compilado com as melhores pr�ticas para 00
 * DTO (Data Transfer Object) = TO = Beans = Modelo... v�rias nomenclaturas
 * Recomenda��es:
 *   1. todos os atributos devem ser privados
 *   2. cada atributo deve possuir um m�todo para input (GET) e outro para output (SET)
 *   3. toda classe JavaBeans de possuir 
 */

public class Produto {

	private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qntd;
	
	
	//GET - Retornar
	//SET - Preencher
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQntd() {
		return qntd;
	}
	public void setQntd(int qntd) {
		this.qntd = qntd;
	}
	
	//novos
	
	/*
	 * Se falasse em frete e nao tivesse no diagrama:
	 * public float getTotalCompra(float frete) {
		return valorCompra * qntd + frete;
	}
	 * 
	 * 
	 */
	
	public float getTotalCompra() {
		return valorCompra * qntd;
	}
	
	//se o usuario tivesse que digitar o desconto: getDesconto(float desconto)
	public float getDesconto() {
		return valorVenda*(float)0.9;
	}
	
	public String getResumo() {
		return "Descri��o: " + descricao + 
				"\nValor da venda: " + valorVenda + 
				"\nQuantidade: " + qntd; 
	}
	
	public String setAll(int id, String descricao, float valorCompra,
			float valorVenda, int qntd) {
		return "ID: " + id +
				"\nDescri��o: " + descricao +
				"\nValor de compra: " + valorCompra +
				"\nValor da venda: " + valorVenda + 
				"\nQuantidade: " + qntd;
	}
	
		
	public String verificarEstoque() {
		if (qntd > 10) {
			return "Estoque alto";
		}
		if (qntd < 5) {
			return "Estoque baixo";
		} 
		return "Estoque medio";

	}
	
	//public e nome da classe. Nao tem nem void Construtor:
	public Produto(int i, String d, float vc, float vv, int q) {
		id = i;
		descricao = d;
		valorCompra = vc;
		valorVenda = vv;
		qntd = q;
	}
		
	
//}

	
	
	
	
	}	








/*
 * Versao prof:
 * 
 *  =========================Produto==========================

private int id;
	private String descricao;
	private float valorCompra;
	private float valorVenda;
	private int qtde;
	
	public void ajustarValores(float porc) {
		valorCompra = valorCompra + valorCompra * (porc/100);
		valorVenda = valorVenda + valorVenda * (porc/100);
	}
	
	public String verificarEstoque() {
		if (qtde<5) {
			return "Estoque Baixo";
		}else if(qtde>10) {
			return "Estoque Alto";
		}else {
			return "Estoque M�dio";
		}
	}
	
	
	public void setAll(int id, String d, float vc, float vv, int q) {
		this.id=id;
		descricao=d;
		valorCompra=vc;
		valorVenda=vv;
		qtde=q;
	}
	
	public String getResumo() {
		return 
				"Descri��o...: " + descricao + "\n" +
				"Valor Venda.: " + valorVenda + "\n" + 
				"Qtde........: " + qtde;
	}
	
	public float getDesconto() {
		return valorVenda * (float) 0.9;
	}
	
	public float getTotalCompra() {
		return valorCompra*qtde;
	}
	
	public float getTotalCompra(float frete) {
		return valorCompra * qtde + frete;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getDescricao() {
		return descricao;
	}
	
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public float getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}
	public float getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(float valorVenda) {
		this.valorVenda = valorVenda;
	}
	public int getQtde() {
		return qtde;
	}
	public void setQtde(int qtde) {
		this.qtde = qtde;
	}
	
=======================================================

=======================================================
* getTotalCompra(): retorna o valorCompra multiplicado pelo quantidade

* getDesconto(): retorna o valor da venda com 10% de desconto.

* getResumo() : retorna a descricao, valor de venda e qtde

* setAll() : preenche todos

* verificarEstoque(): vai retornar
"Estoque Alto" se a qtde for maior que 10
"Estoque Baixo" se a qtde for menor que 5
"Estoque Medio" se estiver entre 10 e 5

* ajustarValores(): vai aplicar a porcentagem recebida atualizando os valores de venda e compra.
==============================================================================
 *  
 *  
*/