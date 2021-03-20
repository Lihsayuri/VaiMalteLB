package br.edu.insper.desagil.vaimalte;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	private Map <Integer,Integer> desconto;


	public Caixa() {
		this.desconto = new HashMap<>();
	}
	
	public void insereItem(Produto produto, int desconto) {
		if ((desconto >= 1) && (desconto<=99)) {
			this.desconto.put(produto.getCodigo(), desconto);
			return;
		}
		return;
	}
	
	public double totalTodosPedidos(Carrinho carrinho) {
		int codigo;
		double total=0;
		double descontoDouble;
		for (Pedido pedido : carrinho.getPedidos()) {
			codigo = pedido.getProduto().getCodigo();
			if (desconto.containsKey(codigo)) {
				descontoDouble = desconto.get(codigo);
				total+= pedido.totalGasto()*(1-(descontoDouble/100.0));
			} else {
				total+= pedido.totalGasto();
			}
				
		} 
		return total;
	}
}
