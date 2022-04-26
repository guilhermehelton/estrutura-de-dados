package br.com.ifce.estrutura.fila;

public class Fila {
	private ListaEncadeada lista;
	private int count = 0;
	
	public Fila() {
		this.lista = new ListaEncadeada();
	}
	
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
	
	public int getCount() {
		return this.lista.getCount();
	}
}
