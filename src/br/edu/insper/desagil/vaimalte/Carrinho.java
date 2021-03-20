package br.edu.insper.desagil.vaimalte;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	private List<Pedido> pedidos;

	public Carrinho() {
		this.pedidos = new ArrayList<>();; 
	}

	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void adicionaNoCarrinho(Produto produto){
		for (Pedido pedido : this.pedidos) {
			if (pedido.getProduto().getCodigo() == produto.getCodigo()) {
				pedido.adicionaQuantidade(); 
				return; 
			}	
		} Pedido novoPedido = 	new Pedido(produto);
		  this.pedidos.add(novoPedido);

	}
}


