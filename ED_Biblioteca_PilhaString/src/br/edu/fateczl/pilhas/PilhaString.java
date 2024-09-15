package br.edu.fateczl.pilhas;

public class PilhaString {
	
	NoString topo;
	
	public PilhaString() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if (topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(String valor) {
		NoString elemento = new NoString();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public String pop() throws Exception{
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public String top() throws Exception{
		if (isEmpty()) {
			throw new Exception("Pilha vazia");
		}
		
		String valor = topo.dado;
		return valor;
	}
	
	public int size() {
		int cont = 0;
		if (!isEmpty()) {
			NoString auxiliar = topo;
			cont = 1;
			while(auxiliar.proximo != null) {
				cont ++;
				auxiliar = auxiliar.proximo;
			}
		}
		
		return cont;
	}
}