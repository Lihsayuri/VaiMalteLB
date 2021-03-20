package br.edu.insper.desagil.vaimalte;

public class Produto {
	private int codigo;
	private String nome;
	private int preco;
	
	public Produto(int codigo, String nome, int preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public int getPreco() {
		return preco;
	}

}
