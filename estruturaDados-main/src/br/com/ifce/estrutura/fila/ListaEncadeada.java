package br.com.ifce.estrutura.fila;

public class ListaEncadeada {
	private Node primeiro;
	private Node ultimo;
	private int count = 0;
	
	public void add(Node node) {
		if(primeiro == null) {
			primeiro = node;
		} else if(ultimo == null) {
			ultimo = node;
			primeiro.setProximo(ultimo);
		} else {
			ultimo.setProximo(node);
			ultimo = node;
		}
		
		count++;
	}
	
	private void percorrerRemover(Node node, String descricao) {
		if(primeiro.getDescricao().equalsIgnoreCase(descricao)) {
			primeiro = node.getProximo();
		} else if(node.getProximo().getDescricao().equalsIgnoreCase(descricao)) {
			node.setProximo(node.getProximo().getProximo());
		} else if(node.getProximo().getDescricao().equalsIgnoreCase(ultimo.getDescricao())){
			node.setProximo(null);
		} else {
			percorrerRemover(node.getProximo(), descricao);			
		}
		count--;
	}
	
	public void remover(String descricao) {
		percorrerRemover(primeiro, descricao);
	}
	
	private String percorrerImprimir(Node node) {
		if(node == null) {
			return "";
		} else {
			return "Descrição: " + node.getDescricao() + "\n" + percorrerImprimir(node.getProximo());
		}
	}
	
	public String imprimirLista() {
		return percorrerImprimir(primeiro);
	}
	
	public int getCount() {
		return count;
	}
	
	public Node getPrimeiro() {
		return this.primeiro;
	}
	
	public Node getUltimo() {
		return this.ultimo;
	}
}
