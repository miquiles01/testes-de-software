import java.util.ArrayList;
import java.util.List;

class Estoque {
    private List<Produto> produtosEmEstoque = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtosEmEstoque.add(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtosEmEstoque) {
            System.out.println(produto);
        }
    }

    public boolean verificarDisponibilidade(Produto produto) {
        return produtosEmEstoque.contains(produto);
    }

    public void removerProduto(Produto produto) {
        produtosEmEstoque.remove(produto);
    }
}
