package cliente;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {


		Scanner leia = new Scanner (System.in);
		
		int opcao;
		
		while (true) {
			System.out.println("✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿");
			System.out.println("                                                                                        ");
			System.out.println("                              AGULINHA ARTE EM CROCHÊ                                   ");
			System.out.println("                                                                                        ");
			System.out.println("✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿");
			System.out.println("                                                                                        ");
			System.out.println("              Seja bem- vindo(a)! Por favor, digite a opção desejada:                   ");
			System.out.println("                                                                                        ");
			System.out.println("                 1- Sou novo por aqui. Quero me cadastrar.                              ");  
			System.out.println("                 2- Já tenho cadastro. Adicionar produtos ao carrinho.                  ");
			System.out.println("                 3- Excluir itens do carrinho.                                          ");
			System.out.println("                 4- Visualizar itens no carrinho.                                       ");
			System.out.println("                 5- Finalizar a compra.                                                 ");
			System.out.println("                 6- Atualizar dados da minha conta.                                     ");
			System.out.println("                 7- Sair.                                                               ");
			System.out.println("                                                                                        ");
			
			
			opcao = leia.nextInt();
	
			if (opcao == 5) {
			System.out.println("✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿❀✿");
			System.out.println("                                                                                        ");
			System.out.println("                   Agradecemos a sua visita. Volte sempre!");
			System.out.println("                                                                                        ");
			sobre();
			leia.close();
			System.exit(opcao);			
			} 
		switch (opcao) { 
		case 1:
			System.out.println("Cadastrar \n\n");
			break;
		case 2:
			System.out.println("Adicionar ao carrinho \n\n");
			break;
		case 3:
			System.out.println("Excluir do carrinho");
			break;
		case 4:
			System.out.println("Visualizar carrinho");
			break;
		case 5:
			System.out.println("Finalizar compra");
			break;
		case 6:
			System.out.println("Atualizar dados da conta");
			break;
		
		default:
			System.out.println("Opção inválida");	
			break;
		} 
		
		} 
	}
		public static void sobre() {
			System.out.println("\n---------------------------------------------------------");
			System.out.println("Projeto Desenvolvido por: ");
			System.out.println("Letícia Silva - le_taina@hotmail.com");
			System.out.println("github.com/let-taina");
			System.out.println("\n---------------------------------------------------------");
		
	} 
	
} 

