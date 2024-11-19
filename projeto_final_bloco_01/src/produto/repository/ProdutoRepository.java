package produto.repository;

import produto.model.Produto;
import java.util.List;

public interface ProdutoRepository {

    void login(String username, String password);

    void criarConta(String username, String password, String email);

    List<Livro> exibirProdutos();

    void adicionarAoCarrinho(Livro produto, int quantidade);

    void finalizarCompra(String paymentDetails);
}
