package br.edu.insper.desagil.vaimalte;

public class Testador {
	double totalCaixa;
	double valorEsperado;
	public boolean testeA() {
		// teste quando não há produtos
		valorEsperado = 0;
		Carrinho carrinho = new Carrinho();
		Caixa caixa = new Caixa();
		totalCaixa = caixa.totalTodosPedidos(carrinho);		
		if (totalCaixa == valorEsperado){
			return true;
		}
	    return false;
	}

	public boolean testeB() {
		//teste com um produto sem desconto
		valorEsperado = 15.99;
		Carrinho carrinho = new Carrinho();
		Produto produto = new Produto(0001,"chocolate", 15.99);
		carrinho.adicionaNoCarrinho(produto);
		Caixa caixa = new Caixa();
		totalCaixa = caixa.totalTodosPedidos(carrinho);
		if (totalCaixa == valorEsperado){
			return true;
		}
	    return false;
	}

	public boolean testeC() {
	//teste com um produto com desconto
		valorEsperado = 6.69 * (1-0.02);
		Carrinho carrinho = new Carrinho();
		Produto produto = new Produto(0010,"abacaxi", 6.69);
		carrinho.adicionaNoCarrinho(produto);
		Caixa caixa = new Caixa();
		caixa.insereItem(produto, 2);
		totalCaixa = caixa.totalTodosPedidos(carrinho);
		if (totalCaixa == valorEsperado){
			return true;
		}
	    return false;
	}

	public boolean testeD() {
	//teste com 3 produto, um com desconto dois sem.
		valorEsperado = (19.49 * (1-0.05)) + 5.89*2;
		Carrinho carrinho = new Carrinho();
		Produto produto = new Produto(0011,"arroz", 19.49);
		Produto produto2 = new Produto(0100, "café", 5.89);
		carrinho.adicionaNoCarrinho(produto);
		carrinho.adicionaNoCarrinho(produto2);
		carrinho.adicionaNoCarrinho(produto2);
		Caixa caixa = new Caixa();
		caixa.insereItem(produto, 5);
		totalCaixa = caixa.totalTodosPedidos(carrinho);
		if (totalCaixa == valorEsperado){
			return true;
		}
	    return false;
	}

	public boolean testeE() {
	//teste com 3 produto, dois com desconto um sem.
		valorEsperado = ((38.96*2) * (1 - 0.08)) + 6.94;
		Carrinho carrinho = new Carrinho();
		Produto produto = new Produto(0101, "bife", 38.96);
		Produto produto2 = new Produto(1010, "coca-cola", 6.94);
		carrinho.adicionaNoCarrinho(produto);
		carrinho.adicionaNoCarrinho(produto);
		carrinho.adicionaNoCarrinho(produto2);
		Caixa caixa = new Caixa();
		caixa.insereItem(produto, 8);
		totalCaixa = caixa.totalTodosPedidos(carrinho);
		if (totalCaixa == valorEsperado){
			return true;
		}
	    return false;
	}

}
