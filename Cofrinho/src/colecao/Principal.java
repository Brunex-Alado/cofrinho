package colecao;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Cofrinho cofre = new Cofrinho();
		Moeda moeda = null;
		int opcao;
		int opcaoMoeda = 0;
		double valor;
		String tipo;
		
		//Menu de exibição do Cofrinho:
		cofre.menuCofrinho();
		opcao = teclado.nextInt();
		
		//Opção escolhida pelo usuário diferente de zero:
		while (opcao != 0) {
			
			//Variável opçaoMoeda reiciando:
			opcaoMoeda = 0;
			
			switch(opcao) {
			
			case 1:
				System.out.println("Você escolheu a 1° Opção: Adicionar Moedas");
				while(opcaoMoeda > 3 || opcaoMoeda == 0) {
					Moeda.menuMoeda();
					opcaoMoeda = teclado.nextInt();
				}
				
				if(opcaoMoeda == 1) {
					System.out.println("Digite o valor a ser adicionado");
					valor = teclado.nextInt();
					tipo = "Dolar";
					moeda = new Dolar(valor, tipo);
				} else if (opcaoMoeda == 2) {
					System.out.println("Digite o valor a ser adicionado");
					valor = teclado.nextInt();
					tipo = "Euro";
					moeda = new Euro(valor, tipo);
				} else if (opcaoMoeda == 3) {
					System.out.println("Digite o valor a ser adicionado");
					valor = teclado.nextInt();
					tipo = "Real";
					moeda = new Real(valor, tipo);
				}
				
				cofre.adicionar(moeda);
				
				break;
				
			case 2:
				System.out.println("Você escolheu a 2° Opção: Remover Moedas");
				while(opcaoMoeda > 3 || opcaoMoeda == 0) {
					Moeda.menuMoeda();
					opcaoMoeda = teclado.nextInt();
				}
				
				if(opcaoMoeda == 1) {
					System.out.println("Digite o valor a ser removido");
					valor = teclado.nextInt();
					tipo = "Dolar";
					moeda = new Dolar(valor, tipo);
				} else if (opcaoMoeda == 2) {
					System.out.println("Digite o valor a ser removido");
					valor = teclado.nextInt();
					tipo = "Euro";
					moeda = new Euro(valor, tipo);
				} else if (opcaoMoeda == 3) {
					System.out.println("Digite o valor a ser removido");
					valor = teclado.nextInt();
					tipo = "Real";
					moeda = new Real(valor, tipo);
				}
				
				cofre.remover(moeda);
				
				break;
				
			case 3:
				System.out.println("Você escolheu a 3° Opção: Listar Moedas");
				
				cofre.listar();
				
				break;
			
			case 4:
				System.out.println("Você escolheu a 4° Opção: Mostrar Total em Real");
				
				cofre.totalConvertido();
				
				break;
			
			default:
				System.out.println("Opção Inválida!");
				
				break;
			}
			
			//Método de exibição do Menu do Cofrinho:
			cofre.menuCofrinho();
			opcao = teclado.nextInt();
		}
		
		System.out.println("Finalizando transação");
		teclado.close();
	}
}
