package projeto_final_bloco_01;

public class Livro
extends Produto{
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

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Preço: R$" + preco;
    }
}

