package br.com.ifce.estrutura.fila;

public class TesteFila {

	public static void main(String[] args) {
		ListaEncadeada lista = new ListaEncadeada();
		Fila fila = new Fila();
		
		lista.add(new Node("Guilherme"));
		lista.add(new Node("Carlos"));
		lista.add(new Node("Joao"));
		lista.add(new Node("Miguel"));

		System.out.println(lista.imprimirLista());
		System.out.println("Número de elementos na lista: " + lista.getCount());
		lista.remover("Miguel");
		System.out.println(lista.imprimirLista());
		System.out.println("Número de elementos na lista: " + lista.getCount());
		
		System.out.println("--- FILA ---");
		
		fila.add(new Node("Pedro"));
		fila.add(new Node("Maria"));
		fila.add(new Node("Claudio"));
		fila.add(new Node("Lucas"));
		
		System.out.println("O primeiro da fila é: " + fila.getFirst());
		fila.remover();
		System.out.println("O primeiro da fila é: " + fila.getFirst());
		System.out.println("A fila é: \n" + fila.imprimir());
	}

}
