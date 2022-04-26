package br.com.ifce.estrutura.pilha;

public class Node {
	private String descricao;
	private Node proximo;
	
	public Node(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Node getProximo() {
		return proximo;
	}

	public void setProximo(Node proximo) {
		this.proximo = proximo;
	}
	
	public String toString() {
		return "Node { descrição = " + descricao + "}";
	}
	
}


