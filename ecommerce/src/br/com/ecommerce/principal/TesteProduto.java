package br.com.ecommerce.principal;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto {

	public static void main(String[] args) {
		
		Produto objeto = new Produto(0, null, 0, 0, 0);
		//anterior Produto objeto = new Produto();
		
		objeto.setValorCompra((float) 5);
		objeto.setQntd((int) 2);
		System.out.println(objeto.getTotalCompra());
		
		objeto.setValorVenda(10);
		System.out.println(objeto.getDesconto());
		
		//descricao, valorVenda e qtde
		objeto.setDescricao("Produto Moh F�cil");
		objeto.setValorVenda((float) 5.5);
		objeto.setQntd((int) 10);
		System.out.println(objeto.getResumo());
		
		//id, descricao, valor compra, valor venda, qtde
		System.out.println(objeto.setAll(9049, "Produto", 10, 9, 1));
		
		objeto.setQntd(15);
		System.out.println(objeto.verificarEstoque());
		
		//objeto.setId(0);
		
		
		
	}
	
}
