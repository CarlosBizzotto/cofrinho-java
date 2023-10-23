package projeto;

import java.util.Scanner;

// foram criados mais dois metodos nessa classe (adicionarMoeda e removerMoeda) para auxiliar nas funcionalidaes do metodo main

public class Principal {
	private static Scanner input = new Scanner(System.in);
	private static Cofrinho cofrinho = new Cofrinho();
	
	// o metodo main executa as funcionalidades principais do programa
	public static void main(String[] args) {
		while (true) {
			System.out.println();
			System.out.println("Digite o numero da opção que deseja executar:");
			System.out.println("1. Adicionar moeda");
			System.out.println("2. Remover moeda");
			System.out.println("3. Listar moedas");
			System.out.println("4. Mostrar total convertido para real");
			System.out.println("5. Sair");
			
			try {
				int opcao = input.nextInt();

				if (opcao == 1) {
					adicionarMoeda(cofrinho);
					continue;
				} else if (opcao == 2) {
					removerMoeda(cofrinho);
				} else if (opcao == 3) {
					cofrinho.listarMoedas();
					continue;
				} else if (opcao == 4) {
					cofrinho.totalConvertido();
				} else if (opcao == 5) {
					System.out.println("Finalizando o programa...");
					break;
				} else {
					System.out.println("Opção invalida!!");
					continue;
				}
				
			} catch (Exception e) {
				System.out.println("Algo deu errado, tente novamente");
				input = new Scanner(System.in);
				continue;
			}
		}
		
		input.close();
	}
	
	// determina as regras para adicionar as moedas no cofrinho
	private static void adicionarMoeda(Cofrinho cofrinho) {
		while(true) {
			try {
				System.out.println();
				System.out.println("Selecione o tipo de moeda:");
				System.out.println("1. Dolar");
				System.out.println("2. Euro");
				System.out.println("3. Real");
				System.out.println("4. Voltar");
				
				int opcaoMoeda = input.nextInt();
				
				if (opcaoMoeda == 4) {
					System.out.println("Voltando...");
					break;
				}
				else if (opcaoMoeda <= 0 || opcaoMoeda > 3){
					System.out.println("Opção invalida");
					continue;
				}
				
				System.out.println("Digite o valor:");
				
				double opcaoValor = input.nextDouble();
				
				if (opcaoValor <= 0) {
					System.out.println("Valor invalido!!");
					continue;
				}
				
				if (opcaoMoeda == 1) {
					cofrinho.adicionar(new Dolar(opcaoValor));
					System.out.println("Dolar adicionado com sucesso!!");
					continue;
				} 
				else if (opcaoMoeda == 2) {
					cofrinho.adicionar(new Euro(opcaoValor));
					System.out.println("Euro adicionado com sucesso!!");
					continue;
				}
				else if (opcaoMoeda == 3) {
					cofrinho.adicionar(new Real(opcaoValor));
					System.out.println("Real adicionado com sucesso!!");
					continue;
				}
			} catch (Exception e) {
				System.out.println("Algo deu errado, tente novamente");
				input = new Scanner(System.in);
				continue;
			}
		}
	}
	
	// determina as regras para remover as moedas do cofrinho
	private static void removerMoeda(Cofrinho cofrinho) {
		while (true) {
			try {
				System.out.println();
				System.out.println("Digite o index da moeda que deseja remover (-1 para cancelar):");
				int index = input.nextInt();
				
				if (index < -1) {
					System.out.println("Valor invalido!!");
					continue;
				}
				else if (index == -1) {
					System.out.println("Voltando...");
					break;
				}
				
				Moeda moeda = cofrinho.getMoeda(index);
				
				if (moeda != null) {
					cofrinho.remover(moeda);
					System.out.println("Moeda removida com sucesso!!");
					break;
				}
				
			} catch (Exception e) {
				System.out.println("Algo deu errado, tente novamente");
				input = new Scanner(System.in);
				continue;
			}
		}
	}
}
