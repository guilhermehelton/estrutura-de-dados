package br.com.ifce.estrutura.lista.encadeadadupla;

public class ListaNo {
	DuploNo primeiro;
	DuploNo ultimo;
	private int count = 0;

	public void add(DuploNo duploNo) {
		if (primeiro == null) {
			primeiro = duploNo;
		} else if (ultimo == null) {
			ultimo = duploNo;
			primeiro.setProximo(ultimo);
			ultimo.setAnterior(primeiro);
		} else {
			ultimo.setProximo(duploNo);
			duploNo.setAnterior(ultimo);
			ultimo = duploNo;
		}
		count++;
	}

	public ListaNo(DuploNo primeiro, DuploNo ultimo) {
		super();
		this.primeiro = primeiro;
		this.ultimo = ultimo;
	}

	public void varrerListaDupla(DuploNo duplo) {
		if (duplo.getProximo() != null) {
			System.out.println(duplo);
			varrerListaDupla(duplo.getProximo());
		} else {
			System.out.println(duplo);
		}
	}

	private int varrerListPraContar(DuploNo duploNo) {
		if (duploNo.getProximo() == null) {
			return 1;
		} else {
			return 1 + varrerListPraContar(duploNo.getProximo());
		}
	}

	public int countManual() {
		if (primeiro == null) {
			return 0;
		} else if (ultimo == null) {
			return 1;
		}
		return varrerListPraContar(primeiro);
	}

	public DuploNo varrerListaBuscarDuploNoPorDescricao(DuploNo duploNo, String busca) {
		if (duploNo == null) {
			return null;
		}
		if (duploNo.getDescricao().toUpperCase().equals(busca.toUpperCase())) {
			return duploNo;
		}
		return varrerListaBuscarDuploNoPorDescricao(duploNo.getProximo(), busca);
	}

	public boolean containsName(String descricao) {
		if (varrerListaBuscarDuploNoPorDescricao(primeiro, descricao) == null) {
			return false;
		}
		return true;
	}
	
	private int varrerPosicaoNome(DuploNo duploNo, String nome) {
		if(duploNo == null) {
			return 0;
		}
		if(duploNo.getDescricao().toUpperCase().equals(nome.toUpperCase())) {
			return 1;
		}
		return 1 + varrerPosicaoNome(duploNo.getProximo(), nome);
		
	}
	
	public int posicaoNome(String nome) {
		return varrerPosicaoNome(primeiro, nome);
	}
	
	private String varrerListaImprimir(DuploNo duploNo) {
		if(duploNo == null) {
			return null;
		} else {
			System.out.println(""+ duploNo.getDescricao() + " na posi????o "+ posicaoNome(duploNo.getDescricao()));
			return varrerListaImprimir(duploNo.getProximo());
		}
	}
	
	public void imprimirLista() {
		if(primeiro == null) {
			System.out.println("Lista vazia");
		} else {
			varrerListaImprimir(primeiro);
		}
	}

	public int getCount() {
		return count;
	}
}