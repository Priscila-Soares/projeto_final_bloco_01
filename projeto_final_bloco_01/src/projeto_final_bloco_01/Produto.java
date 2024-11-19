package projeto_final_bloco_01;

import java.util.ArrayList;

public class Produto {

    
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