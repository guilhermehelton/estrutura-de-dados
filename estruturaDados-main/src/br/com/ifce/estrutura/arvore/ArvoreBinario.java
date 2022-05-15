package br.com.ifce.estrutura.arvore;

public class ArvoreBinario {
	private NoBinario root;

	public ArvoreBinario() {
		super();
		this.root = new NoBinario("raiz");
	}

	public ArvoreBinario(NoBinario root) {
		super();
		if (root == null) {
			this.root = new NoBinario("raiz");
		} else {
			this.root = root;
		}
	}

	public void addNo(String valor) {
		NoBinario noToAdd = new NoBinario(valor);
		if(root == null) {
			this.root = new NoBinario("raiz");
		} else {			
			addFilho(noToAdd, root);
		}
	}

	private void addFilho(NoBinario noToAdd, NoBinario atual) {
		if(atual.getDescricao().compareTo(noToAdd.getDescricao()) < 0) {
			if(atual.getEsquerda() != null) {
				addFilho(noToAdd, atual.getEsquerda());
			} else {
				atual.setEsquerda(noToAdd);
			}
		} else {
			if(atual.getDireita() != null) {
				addFilho(noToAdd, atual.getDireita());
			} else {
				atual.setDireita(noToAdd);
			}
		}
	}
	
	private NoBinario percorrerRemover(NoBinario noAtual, String valorRemover) {
		if(noAtual == null) {
			return noAtual;
		}
		if(noAtual.getDescricao().compareTo(valorRemover) < 0) {
			noAtual.setEsquerda(percorrerRemover(noAtual.getEsquerda(), valorRemover));
		}
		else if(noAtual.getDescricao().compareTo(valorRemover) > 0) {
			noAtual.setDireita(percorrerRemover(noAtual.getDireita(), valorRemover));
		}
		else {
			if(noAtual.getEsquerda() == null) {
				return noAtual.getDireita();
			} else if (noAtual.getDireita() == null) {
				return noAtual.getEsquerda();
			} else {
				NoBinario substituto = menorNo(noAtual.getDireita());
				noAtual = substituto;
				noAtual.setDireita(percorrerRemover(substituto, valorRemover));
			}
		}
		return noAtual;
	}
	
	public void remover(String valorRemover) {
		percorrerRemover(root, valorRemover);
	}
	
	public NoBinario buscar(String valorBusca) {
		return percorrerBusca(root, valorBusca);
	}
	
	private NoBinario percorrerBusca(NoBinario noAtual, String valorBusca) {
		if(noAtual.getDescricao().compareTo(valorBusca) == 0) {
			return noAtual;
		} else {
			if(noAtual.getDescricao().compareTo(valorBusca) < 0) {
				return percorrerBusca(noAtual.getEsquerda(), valorBusca);
			} else {
				return percorrerBusca(noAtual.getDireita(), valorBusca);
			}
		}
	}
	
	public NoBinario menorNo(NoBinario noRaiz) {
		if(noRaiz == null) {
			return buscarMenorNo(root);
		} else {
			return buscarMenorNo(noRaiz);
		}
	}
	
	private NoBinario buscarMenorNo(NoBinario noAtual) {
		if(noAtual.getEsquerda() != null) {
			return buscarMenorNo(noAtual.getEsquerda());
		} else {
			return noAtual;
		}
	}
	
	public void imprimir() {
		percorrerImprimir(root);
	}
	
	private void percorrerImprimir(NoBinario atual) {
		if(atual.getEsquerda() != null) {
			percorrerImprimir(atual.getEsquerda());
		}
		System.out.print(atual.getDescricao().concat(" "));
		if(atual.getDireita() != null) {
			percorrerImprimir(atual.getDireita());
		}
	}

	public NoBinario getRoot() {
		return root;
	}
	
	
}
