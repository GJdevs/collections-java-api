import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> comprasList;

    public CarrinhoDeCompras(List<Item> comprasList) {
        this.comprasList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        comprasList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        if (!comprasList.isEmpty()) {
            for (Item i : comprasList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            comprasList.removeAll(itensParaRemover);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        if (!comprasList.isEmpty()) {
            for (Item item : comprasList) {
                double valorItem = item.getPreco() * item.getQuantidade();
                valorTotal += valorItem; //valorTotal = valorTotal + valorItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public void exibirItens() {
        if (!comprasList.isEmpty()) {
            System.out.println(this.comprasList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }
    public static void main(String[] args) {
        CarrinhoDeCompras compras = new CarrinhoDeCompras();
        compras.adicionarItem("mouse", "10","5");


    }
}


