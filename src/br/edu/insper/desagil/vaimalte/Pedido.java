package br.edu.insper.desagil.vaimalte;

public class Pedido {
	private Produto produto;
	private int quantidade;
	
	
	public Pedido(Produto produto) {
		this.produto = produto;
		this.quantidade = 1;
	}

	public Produto getProduto() {
		return produto;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void adicionaQuantidade() {
		this.quantidade+=1;
	}
	
	public double totalGasto() {
		double total = 0;
		total = this.produto.getPreco()*this.quantidade;
		return total; 
	}

}




