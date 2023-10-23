package projeto;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	public void adicionar(Moeda moeda) {
		listaMoedas.add(moeda);
	}
	
	public void remover(Moeda moeda) {
		listaMoedas.remove(moeda);
	}
	
	public void listarMoedas() {
		for (int i = 0; i < listaMoedas.size(); i++) {
			System.out.println("Index: " + i + ", " + listaMoedas.get(i).info());
		}
	}
	
	public void totalConvertido() {
		double total = 0;
		
		for (Moeda moeda : listaMoedas) {
			total += moeda.converter();
		}
		
		System.out.println("Total: " + total);
	}
	
	// retorna uma moeda especifica do cofrinho de acordo com o index passado por parametro
	public Moeda getMoeda(int index) {
		return listaMoedas.get(index);
	}
}
