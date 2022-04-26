package br.com.ifce.estrutura.lista.encadeadadupla;

public class TesteDuploEncadeado {

	public static void main(String[] args) {
		ListaNo listaDupla = new ListaNo(null, null);

		listaDupla.add(new DuploNo("Daniel"));
		listaDupla.add(new DuploNo("Joao"));
		listaDupla.add(new DuploNo("Francisco"));
		listaDupla.add(new DuploNo("Raimundo"));

		System.out.println("Count manual: " + listaDupla.countManual());
		System.out.println("Count por variavel: " + listaDupla.getCount());
		
		System.out.println("Tem nome francisco? " + listaDupla.containsName("francisco2"));
		
		System.out.println("A posição do nome Francisco é: " + listaDupla.posicaoNome("francisco"));
		
		System.out.println("--- Lista Impressa ---");
		listaDupla.imprimirLista();
	
		//TODO: dizer qual posicao foi encontrado o nome? OK
		//TODO: imprimir a lista com quebra de linha e o numero da posi��o OK
		//TODO: add em uma posi��o espec�fica um determinado nó
		//TODO: add na frente
	}
}
