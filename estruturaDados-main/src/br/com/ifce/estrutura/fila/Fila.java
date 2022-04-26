package br.com.ifce.estrutura.fila;

public class Fila {
	private ListaEncadeada lista = new ListaEncadeada();
	private int count = 0;
	
	public void add(Node node) {
		this.lista.add(node);
		this.count++;
	}
	
	public void remover() {
		this.lista.remover(getFirst());
		this.count--;
	}
	
	public String getFirst() {
		return lista.getPrimeiro().getDescricao();
	}
	
	public String imprimir() {
		return lista.imprimirLista();
	}
}
