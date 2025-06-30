package colecao;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();
	
	//Adição de Moedas:
	public void adicionar(Moeda m) {
		listaMoedas.add(m);
	}
	
	//Remoção de Moedas:
	public void remover(Moeda m) {
		if(listaMoedas.isEmpty()) {
			System.out.println("Cofrinho Vazio =(");
			return;
		} else {
			listaMoedas.remove(m);
		}
	}
	
	//Listagem de Moedas:
	public void listar() {
		for(Moeda m: listaMoedas) {
			m.info();
		}
	}
	
	//Conversão de Moedas:
	public void totalConvertido() {
		double total = 0;
		for(Moeda moeda: listaMoedas) {
			total += moeda.converter();
		}
		System.out.println("Valor total em Real: R$" + total);
	}
	
	//Menu do Cofrinho:
	public void menuCofrinho() {
		System.out.println("----------------------------------------------------");
		System.out.println("Menu do Cofrinho");
		System.out.println("----------------------------------------------------");
		System.out.println("Digite a Opção Desejada");
		System.out.println("0 - Sair");
		System.out.println("1 - Adicionar Moedas");
		System.out.println("2 - Remover Moedas");
		System.out.println("3 - Listar Moedas");
		System.out.println("4 - Mostrar Total em Real");
		System.out.println("----------------------------------------------------");
	}
}
