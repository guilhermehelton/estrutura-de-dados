package br.com.ifce.estrutura.arvore;

public class HelloArvore {

	public static void main(String[] args) {
		
		ArvoreBinario arvoreBinario = new ArvoreBinario();
		arvoreBinario.addNo("a");
		arvoreBinario.addNo("b");
		arvoreBinario.addNo("c");
		arvoreBinario.addNo("d");
		
		System.out.println(arvoreBinario.menorNo(null));
		
		System.out.println(arvoreBinario.buscar("b"));
		
		arvoreBinario.remover("c");
		arvoreBinario.imprimir();
	}
}
