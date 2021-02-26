package br.com.ecommerce.principal;

import br.com.ecommerce.modelo.Produto;

public class TesteProduto2 {

	public static void main(String[] args) {
		
		Produto produto = new Produto(
				15, 
				"Churros",
				(float) 5.0, 
				(float) 8.0,
				5
				); 

		System.out.println(produto.getResumo());
		
		
		
	}

}
