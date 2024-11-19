package projeto_final_bloco_01.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import projeto_final_bloco_01.Livro; 

public class LivroController {

    
    private List<Livro> livros = new ArrayList<>();

   
    public List<Livro> listarLivros() {
        return livros;
    }

    
    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        System.out.println("Livro adicionado com sucesso: " + livro);
    }

    
    public Livro buscarLivroPorTitulo(String titulo) {
        Optional<Livro> livroEncontrado = livros.stream()
            .filter(livro -> livro.getTitulo().equalsIgnoreCase(titulo))
            .findFirst();

        return livroEncontrado.orElse(null);
    }

   
    public void atualizarLivro(String titulo, Livro livroAtualizado) {
        Livro livroExistente = buscarLivroPorTitulo(titulo);
        if (livroExistente != null) {
            livroExistente.setTitulo(livroAtualizado.getTitulo());
            livroExistente.setAutor(livroAtualizado.getAutor());
            livroExistente.setPreco(livroAtualizado.getPreco());
            System.out.println("Livro atualizado com sucesso!");
        } else {
            System.out.println("Livro com título '" + titulo + "' não encontrado.");
        }
    }

   
    public void removerLivro(String titulo) {
        Livro livroParaRemover = buscarLivroPorTitulo(titulo);
        if (livroParaRemover != null) {
            livros.remove(livroParaRemover);
            System.out.println("Livro removido com sucesso: " + titulo);
        } else {
            System.out.println("Livro com título '" + titulo + "' não encontrado.");
        }
    }
}

