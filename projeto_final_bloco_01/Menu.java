package projeto_final_bloco_01;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			
			System.out.println("*****************************************");
			System.out.println("                                         ");
			System.out.println("               LOJAS AMAZÔNIA            ");             
			System.out.println("                                         ");
			System.out.println("*****************************************");
			System.out.println("                                         ");
			System.out.println("         1 -  LOGIN                      ");
			System.out.println("         2 -  CRIAR CONTA                ");
			System.out.println("         3 -  EXIBIR PRODUTOS            ");
			System.out.println("         4 -  ADICIONAR AO CARRINHO      ");
			System.out.println("         5 -  FINALIZAR COMPRA           ");
			System.out.println("         6 -  SAIR                       ");
			System.out.println("                                         ");
			System.out.println("*****************************************");
			System.out.println("ENTRE COM A OPÇÃO DESEJADA:              ");
			System.out.println("                                         ");
			
			opcao = leia.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("LOGIN\n\n");
				
				break;
			case 2:
				System.out.println("CRIAR CONTA\n\n");
				
				break;
			case 3:
				System.out.println("EXIBIR PRODUTOS\n\n");
				
				break;
			case 4:
				System.out.println("ADICIONAR AO CARRINHO\n\n");
				
				break;
			case 5:
				System.out.println("FINALIZAR COMPRA\n\n");
				
				break;
			case 6:
				System.out.println("SAIR\n\n");
			    break;    
			}
		
			
			}
			
			
			
	}

public static void sobre() {
	System.out.println("\n***********************************************");
	System.out.println("Projeto desenvolvido por: Priscila Soares ");
	System.out.println("PriscilaSoares@gmail.com");
	System.out.println("github.com/Priscila-Soares");
	System.out.println("*************************************************");
	
}
}

