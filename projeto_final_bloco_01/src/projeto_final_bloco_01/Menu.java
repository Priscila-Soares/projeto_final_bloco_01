package projeto_final_bloco_01;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	
	static Scanner leia = new Scanner(System.in);
	static ArrayList<Livro> carrinho = new ArrayList<>();
	

	public static void main(String[] args) {
		
		
		int opcao;
		
		while (true) {
			exibirMenu();
			
			
			try {
			    opcao = leia.nextInt();
			    leia.nextLine();
			
			
		switch (opcao) {
            case 1:
                  login();
                  break;
            case 2:
                  criarConta();
                  break;
            case 3:
                  exibirProdutos();
                  break;
            case 4:
                  adicionarAoCarrinho();
                  break;
            case 5:
                  finalizarCompra();
                  break;
            case 6:
                sair();
                return; 
            default:
                System.out.println("Opção inválida! Tente novamente.\n");
        }
    } catch (Exception e) {
    	System.out.println("Número inválido! Digite um número.\n");
    	leia.nextLine();
    }
  }
}
          public static void exibirMenu() {
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
			
			}
		
		 public static void login() {
		        System.out.print("Digite seu email: ");
		        String email = leia.nextLine();
		        System.out.print("Digite sua senha: ");
		        String senha = leia.nextLine();
		        System.out.println("Login realizado com sucesso!\n");
		    }

		    public static void criarConta() {
		        System.out.print("Digite seu nome: ");
		        String nome = leia.nextLine();
		        System.out.print("Digite seu email: ");
		        String email = leia.nextLine();
		        System.out.print("Digite sua senha: ");
		        String senha = leia.nextLine();
		        System.out.println("Conta criada com sucesso!\n");
		    }

		    public static void exibirProdutos() {
		        System.out.println("\nProdutos disponíveis:");
		        for (Livro livro : Livro.listarLivros()) {
		            System.out.println(livro);
		        }
		        System.out.println();
		    }

		    public static void adicionarAoCarrinho() {
		        exibirProdutos();
		        System.out.print("Digite o número do produto que deseja adicionar ao carrinho: ");
		        int opcao = leia.nextInt();
		        leia.nextLine();

		        ArrayList<Livro> produtos = Livro.listarLivros();
		        if (opcao > 0 && opcao <= produtos.size()) {
		            carrinho.add(produtos.get(opcao - 1));
		            System.out.println("Produto adicionado ao carrinho!\n");
		        } else {
		            System.out.println("Opção inválida.\n");
		        }
		    }

		    public static void finalizarCompra() {
		        if (carrinho.isEmpty()) {
		            System.out.println("Seu carrinho está vazio!\n");
		            return;
		        }

		        double total = 0;
		        System.out.println("\nProdutos no carrinho:");
		        for (Livro livro : carrinho) {
		            System.out.println(livro);
		            total += livro.getPreco();
		        }
		        System.out.printf("Total da compra: R$ %.2f%n", total);

		        System.out.print("Digite o seguinte voucher para pagamento: 0000: ");
		        String voucher = leia.nextLine();

		        if ("0000".equals(voucher)) {
		            System.out.println("Compra confirmada com sucesso!\n");
		            carrinho.clear();
		        } else {
		            System.out.println("Voucher inválido. Tente novamente.\n");
		        }
		    }

		    public static void sair() {
		        System.out.println("Sessão encerrada. Obrigada por comprar nas Lojas Amazônia!");
		    }
		}

		
		class Livro {
		    private String titulo;
		    private String autor;
		    private double preco;

		    public Livro(String titulo, String autor, double preco) {
		        this.titulo = titulo;
		        this.autor = autor;
		        this.preco = preco;
		    }

		    public String getTitulo() {
		        return titulo;
		    }

		    public String getAutor() {
		        return autor;
		    }

		    public double getPreco() {
		        return preco;
		    }

		    
		    public String toString() {
		        return String.format("Livro: %s\nAutor: %s\nPreço: R$ %.2f\n", titulo, autor, preco);
		    }

		    public static ArrayList<Livro> listarLivros() {
		        ArrayList<Livro> livros = new ArrayList<>();
		        livros.add(new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 50));
		        livros.add(new Livro("O Mundo Assombrado Pelos Demônios", "Carl Sagan", 50));
		        livros.add(new Livro("Olhos D'Água", "Conceição Evaristo", 50));
		        livros.add(new Livro("Triste Fim de Policarpo Quaresma", "Lima Barreto", 50));
		        livros.add(new Livro("O Santo e a Porca", "Ariano Suassuna", 50));
		        return livros;
			
		
			
			
			}
			
			
			


public static void sobre() {
	System.out.println("\n***********************************************");
	System.out.println("Projeto desenvolvido por: Priscila Soares ");
	System.out.println("PriscilaSoares@gmail.com");
	System.out.println("github.com/Priscila-Soares");
	System.out.println("*************************************************");
	
}
}

