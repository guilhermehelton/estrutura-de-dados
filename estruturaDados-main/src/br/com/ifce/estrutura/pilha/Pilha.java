package br.com.ifce.estrutura.pilha;

public class Pilha {
	private ListaEncadeada lista;
	private int count = 0;
	
	public Pilha() {
		this.lista = new ListaEncadeada();
	}
	
	public void add(Node node) {
		this.lista.addInicio(node);
		this.count++;
	}
	
	public void remover() {
		this.lista.remover(getFirst());
		this.count--;
	}
	
	public String getFirst() {
		return this.lista.getPrimeiro().getDescricao();
	}
	
	public String imprimir() {
		return this.lista.imprimirLista();
	}
	
	public int getCount() {
		return this.count;
	}
}
