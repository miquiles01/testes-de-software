import java.util.ArrayList;
import java.util.List;

class CarrinhoDeCompras {
    private List<Produto> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        itens.add(produto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }

    public List<Produto> getItens() {
        return itens;
    }
}