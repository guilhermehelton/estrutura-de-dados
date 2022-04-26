package br.com.ifce.estrutura.pilha;

public class TestePilha {

	public static void main(String[] args) {
		Pilha pilha = new Pilha();
		
		pilha.add(new Node("Camisa"));
		pilha.add(new Node("Carteira"));
		pilha.add(new Node("Oculos"));
		
		System.out.println("O primeiro elemento da pilha é: " + pilha.getFirst());
		System.out.println(pilha.imprimir());
		System.out.println("A quantidade de elementos na pilha é: " + pilha.getCount());
	}

}
