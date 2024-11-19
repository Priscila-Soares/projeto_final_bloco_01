package projeto_final_bloco_01;

public class Model {

			
			private String Login;
			private String CriarConta;
			private String ExibirProdutos;
			private String AdicionarAoCarrinho;
			private String FinalizarCompra;
			
			

			public String getLogin() {
				return Login;
			}



			public void setLogin(String login) {
				Login = login;
			}



			public String getCriarConta() {
				return CriarConta;
			}



			public void setCriarConta(String criarConta) {
				CriarConta = criarConta;
			}



			public String getExibirProdutos() {
				return ExibirProdutos;
			}



			public void setExibirProdutos(String exibirProdutos) {
				ExibirProdutos = exibirProdutos;
			}



			public String getAdicionarAoCarrinho() {
				return AdicionarAoCarrinho;
			}



			public void setAdicionarAoCarrinho(String adicionarAoCarrinho) {
				AdicionarAoCarrinho = adicionarAoCarrinho;
			}



			public String getFinalizarCompra() {
				return FinalizarCompra;
			}



			public void setFinalizarCompra(String finalizarCompra) {
				FinalizarCompra = finalizarCompra;
			}



			public EstendidaModel(String login, String criarConta, String exibirProdutos, String adicionarAoCarrinho,
	        	String finalizarCompra) {
				Login = login;
				CriarConta = criarConta;
				ExibirProdutos = exibirProdutos;
				AdicionarAoCarrinho = adicionarAoCarrinho;
				FinalizarCompra = finalizarCompra;
			}



			public static void main(String[] args) {
			}

			public boolean comprar(float valor) {
				
				if (this.getPreço() < valor) {
			}
		}
