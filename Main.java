import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Produto> listaDeProdutos = new ArrayList<>();
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        List<Estoque> estoque = new ArrayList<>();

        while (true) {
            System.out.println("MENU:");
            System.out.println("1 - Cadastrar Produto");
            System.out.println("2 - Listar Produtos");
            System.out.println("3 - Adicionar Produto ao Carrinho");
            System.out.println("4 - Listar Itens no Carrinho");
            System.out.println("5 - Calcular Total da Compra");
            System.out.println("6 - Verificar Estoque");
            System.out.println("7 - Finalizar Compra");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine(); // Limpa o buffer
                    System.out.print("Nome do Produto: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço do Produto: R$");
                    double preco = scanner.nextDouble();
                    Produto novoProduto = new Produto(nome, preco);
                    listaDeProdutos.add(novoProduto);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("Lista de Produtos Cadastrados:");
                    for (Produto produto : listaDeProdutos) {
                        System.out.println(produto);
                    }
                    break;
                case 3:
                    if (listaDeProdutos.isEmpty()) {
                        System.out.println("Não há produtos cadastrados.");
                    } else {
                        System.out.println("Escolha o número do produto para adicionar ao carrinho:");
                        for (int i = 0; i < listaDeProdutos.size(); i++) {
                            System.out.println((i + 1) + ". " + listaDeProdutos.get(i).getNome());
                        }
                        int escolha = scanner.nextInt();
                        if (escolha >= 1 && escolha <= listaDeProdutos.size()) {
                            Produto produtoEscolhido = listaDeProdutos.get(escolha - 1);
                            carrinho.adicionarProduto(produtoEscolhido);
                            System.out.println("Produto adicionado ao carrinho com sucesso!");
                        } else {
                            System.out.println("Escolha inválida.");
                        }
                    }
                    break;
                case 4:
                    List<Produto> itensNoCarrinho = carrinho.getItens();
                    if (itensNoCarrinho.isEmpty()) {
                        System.out.println("Carrinho vazio.");
                    } else {
                        System.out.println("Itens no carrinho:");
                        for (Produto produto : itensNoCarrinho) {
                            System.out.println(produto);
                        }
                    }
                    break;
                case 5:
                    double total = carrinho.calcularTotal();
                    System.out.println("Total da compra no carrinho: R$" + total);
                    break;

                case 6:
                    List<Estoque> produtosEmEstoque = estoque.getItens();
                    if (produtosEmEstoque.isEmpty()) {
                        System.out.println("Carrinho vazio.");
                    } else {
                        System.out.println("Itens no carrinho:");
                        for (Estoque estoque1 : produtosEmEstoque) {
                            System.out.println(estoque);
                        }
                    }
                case 7:
                    System.out.println("Finalizando compra...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}



